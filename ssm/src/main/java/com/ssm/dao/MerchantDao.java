package com.ssm.dao;

import com.ssm.model.Merchant;

public interface MerchantDao {

	public int register(Merchant merchant);
	public Merchant selectMerByName(String merName);
}
