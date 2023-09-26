package Module_6;

import java.util.Scanner;

public class Question14 {

	
	public static void main(String[] args) {
		
		
		/*
	     * 
	     * 14. index of an array element 
	     * 
	     */
		

		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter A No : ");
			
			a[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(" Pick A No From Above List ");
		int num=sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			if(num==a[i]) {
				System.out.println(" Index No Is : " +i);
				
				
			}
		}
		
		
		
	}
}
