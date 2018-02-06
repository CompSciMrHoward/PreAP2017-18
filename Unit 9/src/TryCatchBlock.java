
public class TryCatchBlock {

public static void main(String[] args) {
		//ArithmeticException
			//  /0
	try {
		int a = 5/0;
	}
	catch(Exception e) {
		String message = e.getMessage();
		System.out.println("Error: " + message);
	
	}
		//NullPointerException
			//value of null, compare it to something
			//Object declare and not initialized
	String name = null;
	try {
		name.length();
		
	} catch (NullPointerException e) {
		String message = e.getMessage();
		System.out.println("Error: " + message);
	}
		//IndexOutOfBoundsException
			//array, String method that uses index
	String myName = "Derek";
	try {
		char letter = myName.charAt(10);
		
	} catch (StringIndexOutOfBoundsException e) {
		String message = e.getMessage();
		System.out.println("Error: " + message);
	}
		//Exception
			//SuperClass of all Exception classes
			//covers all specific Exceptions
	}
/*
 try{
	//code that may produce an exception
}
catch(ExceptionName e) {
	//code to deal with this exception
	tell the user whats wrong
	change flow of execution to bypass exception
	prompt for user input again with error message
}
*/
}
