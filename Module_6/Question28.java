
/*
 * 
 * 28.  Create an abstract class 'Parent' with a method 'message'. It
 *      has two subclasses each having a method with the same name
 *      'message' that prints "This is first subclass" and "This is second
 *      subclass" respectively.
 *      Call the methods 'message' by creating an object for each subclass.
 * 
 */

package Module_6;



class parent{


	public void show() {
		// TODO Auto-generated method stub

		System.out.println("i m parent");
		
	}
}

	class child1 extends parent{
		
		public void show() {
			// TODO Auto-generated method stub
System.out.println("This is first subclass");
		}
	}
	
	

	class child2 extends parent{
		
		public void show() {
			// TODO Auto-generated method stub
System.out.println("This is 2 subclass");
		}
	}
	
	


public class Question28 {
public static void main(String[] args) {
	
	child1 a=new child1();
	a.show();
	
	child2 b=new child2();
	b.show();
	
		
	
}
    
}


