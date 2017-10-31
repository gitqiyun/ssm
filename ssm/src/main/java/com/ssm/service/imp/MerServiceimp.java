package com.ssm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.MerchantDao;
import com.ssm.model.Merchant;
import com.ssm.service.MerService;
@Transactional
@Service("merService")
public class MerServiceimp implements MerService{

	@Autowired
	private MerchantDao merchantDao;
	
	public int register(Merchant merchant) {
		String merNo=merchant.getMerName()+merchant.getPassWrod();
		merchant.setMerNo(merNo); 
		System.out.println(merchant.toString());
		int a=merchantDao.register(merchant);
		return a;
	}

	public Merchant login(String merName) {
		
		Merchant merchant=merchantDao.selectMerByName(merName);
		return merchant;
		 
	}
 
}
