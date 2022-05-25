package com.tns.users;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Users {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(1000254501,"Umesh Nayak",5500.47F, true);
		CurrentAcc n=new MMCurrentAcc(1000254502, "Rohit Moholkar", 4550.25F,50);
		System.out.println("Saving Account");
		p.withdraw(p.getaccBal());
		System.out.println("Current Account");
		n.withdraw(n.getMINBAL());
		
		
		System.out.println(p);
		System.out.println(n);

	}

}
