
/*
 * 
 * 29. which will ask the user to enter his/her marks (out of 100).
 *     Define a method that will display grades according to the marks
 *     entered as below:
 *      Marks Grade
 *      91-100 AA
 *      81-90 AB
 *      71-80 BB
 *      61-70 BC
 *      51-60 CD
 *      41-50 DD
 *      <=40 Fail
 * 
 */

package Module_6;

public class Question29 {
   
	public static void main(String[] args) {
		
		int percentage=56;
		
		if(percentage>=99)
		{ 
			System.out.println("distinction");
		}else if(percentage>=91) {
			System.out.println("AA");
		}else if(percentage>=81) {
			System.out.println("AB");
		}else if(percentage>=71) {
			System.out.println("BB");
		}else if(percentage>=61) {
			System.out.println("BC");
		}else if(percentage>=51) {
			System.out.println("CD");
		}else if(percentage>=41) {
			System.out.println("DD");
		}else if(percentage<=40) {
			System.out.println(" FAIL !! ");
		}
		else {
		     System.out.println("fail!!");	
			}
				
	}
	
}
