
public class TestReview2 {
//}
//public void thisMethod() {  methods must be defined withing class braces
//}
	public static void main(String[] args) {
		TestReview2 obj = new TestReview2();
		obj.mystery(2);
		//obj.mystery(5, 2.0);  para must be of correct type and order
		obj.mystery(2, 2);
		
		int a = 5;
		back(a);
		System.out.println(a);
		mine(0, 2);
	}
		public static double mine(double a, double b) {
			if(a>0)
				return a*b;
			else if(a<0)
				return a/b;
			return 0;
		}
		public static void back(int num) {
			//para are treated like a normal variable 
			//b/w curly braces
			num = 6;
			System.out.print(num + " ");
		}
	
		//accessControl returnType name(para1, para2)
		public double mystery(double a, int b) {//{} contain all code for your method
			return a * b;
		}
		public double mystery(double a) {//overloading, think substring
			//same name, diff para types or number
			return a;
		}
	

}
