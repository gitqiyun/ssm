package com.ssm.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.dao.MerchantDao;
import com.ssm.model.Merchant;
import com.ssm.service.MerService;

@Controller
public class MerController {
	@Autowired
	private MerService merService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String regiter(ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		try {
			String merName = request.getParameter("merName");
			String passWord =  request.getParameter("passWord"); 
			if (merName==null||passWord==null) {
				model.addAttribute("msg","请输入用户名或密码");
				return "register";
			}
			Merchant merchant = merService.login(merName);
			if (merchant!=null) {
				model.addAttribute("msg","用户名已存在");
				return "register";
			}
			Merchant merchant2=new Merchant();
			merchant2.setMerName(merName);
			merchant2.setPassWrod(passWord);
			int a = merService.register(merchant2);

			if (a == 1) {
				return "login";
			} else {
				return "error";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String merName = request.getParameter("merName");
		String passWord =  request.getParameter("passWord"); 
		Merchant merchant = merService.login(merName);
		if (merchant != null && merchant.equals(passWord)) {
			return "main";
		} else {
			model.addAttribute("msg", "用户名或密码错误");
			return "login";
		}

	}
}
