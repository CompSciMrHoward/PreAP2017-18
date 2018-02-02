import java.util.*;
public class WhileLoops1 {
public static void main(String[] args) {
	//while(condition){do this}
	//make sure you increment/decrement
	
	int age = 15;
	while(age < 20) {
		System.out.println(age);
		age++;//do not forget
	}
	int newInt = 0;
	int nextInt = 2;
	while(newInt < 10) {
		nextInt*=2;
		newInt++;
	}
	System.out.println(nextInt);
	int ten = 10;
	while(ten > 0) {
		System.out.println(ten);
		ten--;
		
	}
	int x = 0;
	do {//always run at least 1x
		System.out.println(x);
		x++;
	}while(x < 10);
}
}
