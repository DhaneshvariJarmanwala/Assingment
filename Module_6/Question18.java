package Module_6;

import java.util.Scanner;

public class Question18 {

	
	/*
	 * 
	 *  18. to demonstrate try catch block.
	 * 
	 */
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println(" Enter A : " );
		a=sc.nextInt();
		
		System.out.println(" Enter B : " );
		b=sc.nextInt();
		
		try {
			System.out.println(" Division is : " +a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println(" This code is written by ...  ");
			System.out.println(" phn no is : 7878787878 ");
			
		}
		
		
	}
	
}
