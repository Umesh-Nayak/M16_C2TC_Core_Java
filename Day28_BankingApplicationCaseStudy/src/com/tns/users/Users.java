package com.tns.users;

import com.tns.application.GSBankFactory;
import com.tns.application.GSCurrentAcc;
import com.tns.application.GSSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Users {

	public static void main(String[] args) {
		BankFactory s=new GSBankFactory();
		SavingAcc p=new GSSavingAcc(1000254511,"Umesh Nayak",5550, true);
		CurrentAcc n=new GSCurrentAcc(1000254512, "Rohit Moholkar", 4550,50);
		System.out.println("Saving Account");
		p.withdraw(p.getaccBal());
		System.out.println("Current Account");
		n.withdraw(n.getaccBal());
		
		
		
		System.out.println(p);
		System.out.println(n);
	}

}
