import java.util.*;
public class MethodOverview2 {

	public static void main(String[] args) {
		MethodOverview2 met = new MethodOverview2();
		met.hello("Class");
		double diameter = met.radius(5);
		System.out.println(diameter);
		System.out.println(diameter * 5 / 2.3);
		met.myMethod(22, "Derek");
	}
	public void myMethod(int num, String n) {
		System.out.println(num + n);
	}
	//d/2
	public double radius(double d) {
		return d/2;
	}
	public void hello(String name) {
		System.out.println("Hello! " + name );
	}
	
}
