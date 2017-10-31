package com.ssm.model;

public class Merchant {

	private int merId;
	private String merNo;
	private String merName;
	private String passWord;
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Merchant(int merId, String merNo, String merName, String passWrod) {
		super();
		this.merId = merId;
		this.merNo = merNo;
		this.merName = merName;
		this.passWord = passWrod;
	}
	public int getMerId() {
		return merId;
	}
	public void setMerId(int merId) {
		this.merId = merId;
	}
	public String getMerNo() {
		return merNo;
	}
	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}
	public String getMerName() {
		return merName;
	}
	public void setMerName(String merName) {
		this.merName = merName;
	}
	public String getPassWrod() {
		return passWord;
	}
	public void setPassWrod(String passWrod) {
		this.passWord = passWrod;
	}
	@Override
	public String toString() {
		return "Merchant [merId=" + merId + ", merNo=" + merNo + ", merName=" + merName + ", passWord=" + passWord
				+ "]";
	}
	
	
}
