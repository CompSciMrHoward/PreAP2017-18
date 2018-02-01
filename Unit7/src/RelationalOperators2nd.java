
public class RelationalOperators2nd {

	public static void main(String[] args) {
		//System.out.println(isLess);
		int num = 25;
		if(num <= 1){
			System.out.println("value is 1 or less");
		}
		else if(num == 2){
			System.out.println("value is 2");
		}
		else{//NO PARAMETER LIST!!!
			System.out.println("value is greater than 2");
		}
//write a test to determine if a given int called number
//is less than 5.  If less than 5, store a true in 
//boolean isLess. Otherwise store a false;
	boolean isLess = false;
	int number = 10;
	if(number<5){
		isLess = true;
	}
	
	String name = "BOB";
	System.out.println(name instanceof String);
	String age = "12";
	name = name.toLowerCase();
	if(name.equals("bob")){
		System.out.println("Happy Birthday Bob!");
	}
	else{
			System.out.println("Welcome to IKEA");
		}
	}
/*  relational operator is a programming 
construct or operator that tests or defines 
some kind of relation between two entities. These 
include numerical equality (e.g., 5 = 5) and 
inequalities (e.g., 4 ≥ 3).
*/
	}


