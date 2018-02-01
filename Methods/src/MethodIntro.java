
public class MethodIntro {
	public static void main(String[] args) {
		//write a method that prints Hello User! with User as a String Parameter
		
		hello("Derek");
		hello("John");
		hello("Ben");
			
	}//end of main
//public returnType name(parameters)
	public static void hello(String name) {
		System.out.println("Hello " + name + "!");
	}
	public static double timesPi(double var) {
		return var * Math.PI;
	}//end of timesPi
	private void printDiamonds() {
		System.out.println("<><><><><><><><><><><><>");
		System.out.println("<><><><><><><><><><>");
		System.out.println("<><><><><><><><>>");
		System.out.println("<><><><><><>");
		System.out.println("<><><><>");
		System.out.println("<><>");
		System.out.println("<><><>");
		System.out.println("<><><><><><>");

	}
	
}
