package Module_6;

public class Question10 {

	
	public static void main(String[] args) {
		
	    /*
	     * 
	     *  10. *
	     *     ***
	     *    *****
	     *     ***
	     *      *
	     *  
	     */

		for (int i=1; i<=3; i++)
		{
			for (int m=i; m<=3; m++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i*2-1; j++)
			{
				System.out.print("*");
			}
	           			System.out.println();
		}

		
		
		for (int i=2; i>=1; i--)
		{
			for (int m=i; m<=3; m++)
			{
				System.out.print(" ");
			}
			for (int j=i*2-1; j>=1; j--)
			{
				System.out.print("*");
			}
	           			System.out.println();
		}

		
	}
}
