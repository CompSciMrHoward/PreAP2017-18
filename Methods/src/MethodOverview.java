import java.util.*;
public class MethodOverview {

	public static void main(String[] args) {
	MethodOverview met = new MethodOverview();
	met.addThem(5,10);
	double rad = met.radius(.6);
	System.out.println(rad);	
	met.test( "one", 15);
	}
	public void test(String name, int num) {
		System.out.println(name + " " + num);
	}
	//Pi*r^2
	public double radius(double r) {
		double answer = Math.PI*(r*r);
		return answer;
	}
	public void addThem(int one, int two) {
		System.out.println(one+two);
	}
	
}
