package Exceptions;

public class ExceptionDemo {
	
	/*public void getData() {
		System.out.println(k);
	}*/
	
	public static void main (String[] args) {
		
		int b=7;
		int c=0;
		
		try {
			//int k=b/c;
			int ar[]=new int[5];
			System.out.println(ar[7]);
		}catch(ArithmeticException e) {//This means Arithematic exception and since the above error exception is Arithematic exception the control goes to this catch block
			System.out.println("Arithematic Exception Error exception caught");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception Error exception caught");
		}
		catch(Exception e) {//Exception e is a general exception and supports any exception
			System.out.println("Error exception caught");
		}finally{
			System.out.println("Finally block is executed");
			//This block is executed regardless of whether the exception is thrown or not
			//THis block if finally executes even if any error is found
		}
		ExceptionDemo ed=new ExceptionDemo();
		//ed.getData();
	}
}
