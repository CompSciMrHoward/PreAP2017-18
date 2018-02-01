
public class TestReview {
//}
//public void empty(){  outside of class declaration
//}
	public static void thisMet() {
		nextMet();
	}
	public static void nextMet() {
		
	}
	public static void main(String[] args) {
		TestReview obj = new TestReview();
		int a = 5;
		double b = 2.3;
		//obj.mystery(a, b);  would not compile, wrong para order
		//make sure parameters in a method call are in correct order of type
		System.out.println(obj.mystery(5));
		System.out.println(obj.mystery(5.0, 2));
		together(125);
		newMet(-4, 2.6);
		//keyword use to call any method from the main method...static
		//function, method!!!!, subroutine
		//function decomposition == break a large task into easier to solve pieces
		// in the method body, treat parameter like any other variable
//Loops
		//do-while == you want the loop to execute at least once.
		//for(int i = 1; i < 10;?????)
	}
	public void mine(int a, double b) {
		//return a;  return type not satisfied
	}
	public static double newMet(double a, double b) {
		if(a>0)
			return a * b;
		else if(a<0) 
			return a/b;
		return 0;
		
	}
	public static void together(int a) {
		a = 3;
		System.out.println(a + " ");
	}
//accessControl returnType name(para1, para2)
	public double mystery(double a, int b) {
		return a * b;
	}
	public double mystery(double a) {//overloading
		//same name, diff para types or number
		return a;
	}
	
	
}
