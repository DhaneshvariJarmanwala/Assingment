package Module_6;

import java.util.ArrayList;

public class Question24 {

	
	/*
	 * 
	 * 24. to remove the third element from a array list.
	 * 
	 */
	
public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		System.out.println(" Default size is : " +a.size());
		System.out.println(" Default value is : " +a);
		
		a.add(1);
		a.add(1.56);
		a.add("p..");
		a.add("pari !!");
		a.add(new Integer(1000));
		a.add("pari !!");

		System.out.println(" now size is : " +a.size());
		System.out.println(" Now value is : " +a);
		
		a.remove(3);

		System.out.println(" now size is : " +a.size());
		System.out.println(" Now value is : " +a);
		
		
	}
	

	
}
