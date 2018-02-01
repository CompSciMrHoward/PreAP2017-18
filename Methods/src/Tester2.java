import java.util.Scanner;

public class Tester2 {
public static void main(String[] args) {
	
	System.out.println(mine(6));
	System.out.println(fun1(8));
	System.out.println(fun4(4));
}
public static int fun4(int x) {
	if(x<1)
		return 1;
	else
		return x + fun4(x-1) + fun4(x-2);
	
}
public static int mine(int num) {
	if(num == 1) {
		return 1;
	}
	else {
		return num + mine(num-1);
	}
	
}
	public static int fun1(int x) {
		if(x<1)
			return x;
		else
			return x + fun1(x-3);
	
}

}
