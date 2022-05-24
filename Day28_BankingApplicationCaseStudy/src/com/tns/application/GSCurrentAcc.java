package com.tns.application;

import com.tns.framework.CurrentAcc;

public class GSCurrentAcc extends CurrentAcc {

	public GSCurrentAcc(int accNo, String accNm, float accBal, float MINBAL) {
		super(accNo, accNm, accBal, MINBAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("GSCurrentAcc [toString()=%s]", super.toString());
	}
	
	
	

}
