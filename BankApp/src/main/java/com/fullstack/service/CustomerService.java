package com.fullstack.service;

import java.util.Scanner;

public class CustomerService {

	double custAccBal =10000;
	int amount,otp,generatedOTP;

	Scanner scanner=new Scanner(System.in);


	public void deposit() {
		System.out.println("\n Before Deposit Cust Acc Balance: "+custAccBal);

		System.out.println("\n Please enter amount for deposit: ");

		amount= scanner.nextInt();

		custAccBal+= amount;

		System.out.println("\n After Deposit Cust Acc Balance: "+custAccBal);
	}
	public void withdraw() {
		System.out.println("\n Before Withdraw Cust Acc Balance: "+custAccBal);

		System.out.print("\n Please enter amount for withdraw: ");

		amount= scanner.nextInt();
		if(custAccBal>amount) {
			custAccBal-=amount;
			System.out.println("\n After withdraw Cust Acc Balance: "+custAccBal);
		}else {
			System.out.println("Insufficient Fund");
		}
	}
	public void transfer() {

		System.out.println("\n Before Transfer Cust Acc Bal: "+custAccBal);

		System.out.print("\n Please enter amount for transfer: ");
		amount=scanner.nextInt();

		if(custAccBal >amount) {
			generatedOTP = generatedOTP();
			System.out.println("\n Please enter OTP: " +generatedOTP);
			otp=scanner.nextInt();
			if(generatedOTP == otp) {
				custAccBal -=amount;

				System.out.println("\n After transfer Cust Acc Balance: "+custAccBal);
			}else {
				System.out.println("Invalid OTP");
			}
		}else {
			System.out.println("Insufficient Fund");

		}

	}
	public void logout() {

		System.out.println("Logout Successfully");
		System.exit(0);
	}

	int generatedOTP() {
		return (int) (Math.random()*9000+1000);
	}
}
