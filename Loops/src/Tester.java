import java.util.*;
public class Tester {
public static void main(String[] args) {
	int number = 25;
	number+=37;//number = number + 37
	System.out.println(number);
	System.out.println((char)number);
	System.out.println("My dad is "  + number);
	String name = "Derek";
	name = name.toUpperCase();
	System.out.println(name.substring(0,2));
	Scanner kbInput = new Scanner(System.in);
	System.out.println("How old are you?__");
	int age = kbInput.nextInt();
	System.out.println("in 2022 you will be " + (age+4) + " years old");
	kbInput.nextLine();
	kbInput.close();
	
	
}

}
