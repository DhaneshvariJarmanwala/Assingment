package Module_6;


public class Question_5 {

	
	public static void main(String[] args) {
		
		
		 /*
		  * 
		  *  5.armstrong or not
		  *  153
		  *  371 
		  *       
		  */
		

	
		int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        
	}
	
}
