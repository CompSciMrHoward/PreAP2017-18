import java.util.*;
public class RelationalOperators {

	public static void main(String[] args) {
		boolean lessThan = 5>3;
		int num = -5;
		if(num == 0){
			System.out.println("This num is 0");
		}
		else if(num == 1){//test if the if condition is false
			System.out.println("This num is 1");
		}
		else if(num > 1){
			System.out.println("This is a big num");
		}
		else{//this runs if all conditions are false
			System.out.println("Num is less than 0");
		}
//write some statements that test the value number.
//		if number is greater than 25, 
//		store a false in a boolean called isLess
//		if number is less than or equal to 25, 
//		store a false in a boolean called isLess
		int number = 0;
		boolean isLess = false;
		 if(number<=25){
			 isLess = true;
		}
		 System.out.println(isLess);
		String name = "evan";
		name = name.toLowerCase();
		if(name.equals("evan")){
			System.out.println("Name is Evan");
		}
		else{
			System.out.println("Name is not Evan");
		}
/*  relational operator is a programming 
	construct or operator that tests or defines 
	some kind of relation between two entities. These include 
	numerical equality (e.g., 5 = 5) and inequalities (e.g., 4 ≥ 3).
*/
}
}
