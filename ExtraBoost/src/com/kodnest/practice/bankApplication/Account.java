package com.kodnest.practice.bankApplication;

public class Account {
	
	
	private long accNo;
	private  String accHolder;
	public Account(long accNo, String accHolder) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		
	}
	public long getAccNo() {
		return accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	
	
	
	
}
