package Module_6;

import java.util.Scanner;


/*
 * 
 * 30.  to create a custom exception if Customer withdraw amount
 *      which is greater than account balance then program will show custom 
 *      exception otherwise amount will deduct from account balance.
 *      Account balance is:2000 Enter withdraw
 *      amount:2500
 *      Sorry, insufficient balance, you need more 500 Rs.To perform
 *      this transaction.
 *
 * 
 */



class PariException extends Exception{
 double amount;
	public PariException(double amount) {
		this.amount=amount;
	}
	
}
class ATM{
	double balance=0;
    public void deposit(double amount) {
		balance+=amount;
		System.out.println(" total deposited amount is : " +amount);
		System.out.println(" your balance is : " +balance);
	}	
    
    public void withdraw(double amount) throws PariException {
		if(amount<balance) {
			balance-=amount; // balance=balance-amount
			System.out.println(" total withdraw amount is : " +amount);
			System.out.println(" your balance is : " +balance);
		}
		else {
			double needs=amount-balance;
			throw new PariException(needs);
			
		}
	}

}

public class Question30 {
	
	

	public static void main(String[] args) {
		
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		double amount;
		System.out.println(" enter the amount to be deposited  ");
		amount=sc.nextDouble();
		atm.deposit(amount);
		
		System.out.println(" enter the amount to be withdraw  ");
		amount=sc.nextDouble();
		
		try {
			atm.withdraw(amount);
		} catch (PariException e) {
			
			System.out.println(" if you deposit " +e.amount+ " Rs more you " + " can withdraw " +amount);
		}
		
		
	}
	
}
