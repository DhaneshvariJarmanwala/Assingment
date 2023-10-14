
/*
 * 
 * 21. WAP to create one thread by extending Thread class in another class. 
 * 
 */


package Module_6;

class First extends Thread {
	
      public void run() {  
    	  
    	 for (int i = 1; i <=5 ; i++) {
			System.out.println(" first thread is : " +i);
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class Question21 {

	public static void main(String[] args) throws InterruptedException {
		
		First first=new First();
		
	   first.start();
	   
	   
  	 for (int i = 1; i <=5 ; i++) {
			System.out.println(" main thread is : " +i);
		
		Thread.sleep(2000);
		
	}
	
	}
}
	


