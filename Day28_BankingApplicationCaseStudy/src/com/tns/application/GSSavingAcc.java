package com.tns.application;

import com.tns.framework.SavingAcc;

public class GSSavingAcc extends SavingAcc {

	public GSSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("GSSavingAcc [toString()=%s]", super.toString());
	}
	

}
