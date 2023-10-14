
	/*
	 * 
	 * 20. to create one thread by implementing Runnable interface in class.
	 *  
	 */
		
package Module_6;

 class second implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <=5; i++) {
		System.out.println(" second thread is : " +i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
}
	
}

}

 public class Question20 {

	public static void main(String[] args) throws InterruptedException {
				
		second s1=new second();
		Thread thread=new Thread();
				
		Thread t1=Thread.currentThread();
		t1.setName("pari..");
		t1.setPriority(t1.NORM_PRIORITY);
		thread.start();
		
		System.out.println(" current thread is : " +t1);
		
		for (int i = 0; i <=5; i++) {
			System.out.println(" main thread is : " +i);
			
			thread.sleep(2000);
			
		}
		
	}
}
