package Module_6;

import java.util.Scanner;

/*
 * 
 * 16. to Compare Two String.
 * 
 */


public class Question16 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int a,b,c;
		
		System.out.println(" Enter value of A : ");
		a=sc.nextInt(); 
		System.out.println(" Enter value of B : ");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println(" Sum is : " +c);
		
		
		
		char ch;
		
		System.out.println(" Enter a char :");
		ch=sc.next().charAt(0);
		
		System.out.println(" Enter char is : " +ch);
		
		
	    String name;
	    
//	    System.out.println(" Enter your name : " );
//	    name=sc.next();
	//    
//	    System.out.println(" Your name is : " +name);
	//    
//	    sc.nextLine(); // clear buffer
	//    
	    System.out.println(" Enter your name : ");
	    
	    name=sc1.nextLine();
	    
	    System.out.println(" Your name is : " +name);
	    
	   
	    
	}
	
}
