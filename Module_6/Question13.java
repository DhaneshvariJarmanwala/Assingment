package Module_6;

public class Question13 {

	
	public static void main(String[] args) {
		
		
		/*
	     * 
	     * 13. average value of array element
	     * 
	     */
	         
	         int[] numbers = new int[]{5,8,12,3};
	         
	         int sum2 = 0;
	         for(int i=0; i < numbers.length ; i++)
	          sum2 = sum2 + numbers[i];
	        
	          double average = sum2 / numbers.length;
	          System.out.println("Average value of the array elements is : " + average); 
	         
	          
	}
}
