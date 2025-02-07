package com.fullstack.controller;

import com.fullstack.model.Customer;
import com.fullstack.service.CustomerService;

import java.util.Scanner;
public class CustomerController {


	public static void main(String[] args) {

		CustomerService service=new CustomerService();


		Customer customer=new Customer(12345,"FullStack");
		Scanner scanner=new Scanner(System.in);
		boolean flag=false;
		do{
			System.out.println("\n Please enter Account Number & Password: ");

			long accNumber =scanner.nextLong();
			String password = scanner.next();

			if(customer.getCustAccountNumber()==accNumber && customer.getCustPassword().equals(password)) {
				System.out.println("Welcome to Indian Bank");
				flag=false;
			}else {
				System.out.println("Invalid Credentials ,Please try agian !!!");
				flag=true;
			}
		} while(flag);

		do {
			System.out.println("\n Please enter your choice: \n 1. Deposit \n 2. Withdraw \n 3. Transfer Money \n 4.Logout");
			int ch =scanner.nextInt();

			switch(ch) {
			case 1: //deposit
				service.deposit();
				break;
			case 2: //withdraw
				service.withdraw();
				break;
			case 3: //Transfer money
				service.transfer();
				break;
			case 4: //logout
				service.logout();
				break;
			}

		}while(true);
	}
}
