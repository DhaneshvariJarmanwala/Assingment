package Module_6;


public class Question11 {


	/*
     * 
     * 11. sum of the first 100 prime number
     * 
     */
	public static void main(String[] args) {
	
		int a=100,sum=0;
		for (int j= 2; j <= 100 ; j++) {
			

			int flag=1;
		
		for (int i = 2; i < j ; i++) {
			if(j%i==0) {
				flag=0;
				
			}
		}
		
		if(flag==0){
		System.out.println( +j+ " Not A Prime No ");
	} else {
		System.out.println( +j+ " Prime No ");
		
		sum=sum+j;
	}
		
			
		}

		System.out.println(" sum of first 100 prime number is : " +sum);
		
		}
	
		
}


