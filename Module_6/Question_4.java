package Module_6;

public class Question_4 {

	 /*
	  * 
	  *  4.prime or not
	  *  
	  *       
	  */
	
	
	public static void main(String[] args) {
		
	    
			int no=103,flag=1;
		
		for (int i = 2; i < no ; i++) {
			if(no%i==0) {
				flag=0;
				
			}
		}
		
		if(flag==0){
		System.out.println(" Not A Prime No ");
	} else {
		System.out.println(" Prime No ");
	}
		
		
	}
	
}
