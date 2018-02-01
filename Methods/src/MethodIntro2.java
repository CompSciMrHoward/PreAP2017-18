
public class MethodIntro2 {

	public static void main(String[] args) {
		MethodIntro2 intro = new MethodIntro2();
		double result = intro.add(5, 5);
		System.out.println(result);
		
		double a = intro.multiply(2,3);
		System.out.println(a/2);
	}
	
public double multiply(int i, int j) {
		return i * j;
	}

//public returnType name(parameters)
	
	public double add(int a, int b) {
		return a+b;
	}
	//method overloading
	public double add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}//name only exists up to here

}
