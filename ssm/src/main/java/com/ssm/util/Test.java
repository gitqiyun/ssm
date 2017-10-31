package com.ssm.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.dao.MerchantDao;
import com.ssm.model.Merchant;

public class Test {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
			
			SqlSession session=new SqlSessionFactoryBuilder().build(inputStream).openSession();
			
			Merchant merchant=new Merchant();
			merchant.setMerId(1);
			
			merchant.setMerName("����");
			merchant.setPassWrod("qiyun341125");
			
			
			MerchantDao merchantDao=session.getMapper(MerchantDao.class);
			
			int a=merchantDao.register(merchant);
			
			session.commit();
			System.out.println(a);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
