package Module_6;

import java.io.FileOutputStream;

public class Question19 {

	
	/*
	 * 
	 * 19. to demonstrate multiple catch blocks.
	 * 
	 */
	

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream(" file.txt");
			String msg=" THis is top's technologies..";
			byte[]b=msg.getBytes();
			fos.write(b);
			fos.flush();
			System.out.println(" data Write sucessfully..");
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
