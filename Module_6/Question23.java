package Module_6;

import java.util.HashMap;

/*
 * 
 * 23. WAP to update specific array element by given element.
 * 
 */


public class Question23 {

	public static void main(String[] args) {
		
		
			HashMap h=new HashMap();
		
			System.out.println(" Default size is : " +h.size());
			System.out.println(" Default value is : " +h);
			
			
			h.put(1, "h");
			h.put(123, "pari");
			h.put("parita", 12345);
			h.put("parita", "chothani");
			
			
			System.out.println(" Default size is : " +h.size());
			System.out.println(" Default value is : " +h);
			
			
			h.remove(1);
			

			System.out.println(" Default size is : " +h.size());
			System.out.println(" Default value is : " +h);
			
			
			
		
		}
		
		
	}
