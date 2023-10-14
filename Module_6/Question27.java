package Module_6;

public class Question27 {

	
	/*
	 * 
	 * 27. to find the second largest element in an array.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int a, size;
	    int array[] = {5, 8, 11, 13, 15, 17};
	    size = array.length;

	    for(int i = 0; i<size; i++ ){
	       for(int j = i+1; j<size; j++){

	          if(array[i]>array[j]){
	             a = array[i];
	             array[i] = array[j];
	             array[j] = a;
	          }
	       }
	    }
	    System.out.println("Third second largest number is: "+array[size-2]);
		
	}
}
