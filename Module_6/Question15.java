package Module_6;

public class Question15 {

	public static void main(String[] args) {
		
		/*
	     * 
	     * 15. max. or min. value
	     * 
	     */
		
		
		int[] arr= {3,5,9,7,6};
		int min=arr[0];
		int max=arr[0];
		
		for (int i =0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if (arr[i]>max) {
				max=arr[i];
				
			}
		}
		
		System.out.println(" Minimum Value Of Array : " +min);
		
		System.out.println(" Maximum Value Of Array : " +max);
	}	

	}

