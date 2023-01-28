package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa {

	public static void main(String[] args) {

		Account acc = new Account(1000, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
	
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob",0.0,3000.0);
		Account acc3 = new SavingsAccount(1004, "Anaa",0.0, 0.0);
		
		//DOWNCATING 
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//Erro pos uma nao se extende da outra
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		//esse ira falhar
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		//-------------
		
		Account acc01 = new Account(1001, "Alex", 1000.0);
		acc01.withdraw(200.0);
		System.out.println(acc01.getBalance());
		
		Account acc02 = new SavingsAccount(1002, "Maria", 1000.0,0.01);
		acc02.withdraw(200.0);
		System.out.println(acc02.getBalance());
		
		Account acc03 =  new BusinessAccount(1003, "Eli" , 1000.0, 500.0);
		acc03.withdraw(200.0);
		System.out.println(acc03.getBalance());
		
		
		//----------- 
		 
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001,"alex", 500.0,0.01));
		list.add(new BusinessAccount(1002,"Ana",1000.0,400.0));
		list.add(new SavingsAccount(1005,"bob", 300.0, 0.01));
		list.add(new BusinessAccount(1006,"EDU",500.0,500.0));

		double sum = 0.0;
		for(Account ac01 : list) {
			sum += ac01.getBalance();
		}
		System.out.printf("Total %.2f%n", sum);
		
		for (Account ac02 : list) {
			ac02.deposit(10.0);
		}
		for(Account ac02 : list) {
			System.out.printf("Atualizacao do saldo %d: %.2f%n", acc02.getNumber(), ac02.getBalance());
		}
		
	}
}
