package com.ssm.service;

import com.ssm.model.Merchant;

public interface MerService {
	public int register(Merchant merchant);
	
	public Merchant login(String merName);
}
