
import java.util.*;
public class ForLoopEx {

	public static void main(String[] args) {
//for(int i = 0; i < 10; i++){ //code to loop}
	//initial..  control step
		
		int age = 25;
		for(int i = 1; i <= 5; i++) {
			age = age + 2;
			//System.out.print(i);
		}
		System.out.println(age);
		System.out.println();
		//when starting @ 1, use <= || >=
		//when starting @ 0, use < || >
		int j;//extends scope of j outside for loop
		for( j = 0; j<5; j++) {
			System.out.print(j);
		}
		//System.out.println(j);
		System.out.println();
		for(int k = 10; k > 0; k--) {
			if(k==5) {
				//continue;//skip this interation
				break; //break out of loop completely
			}
			System.out.print(k);
		}
		for(int a = 0; a<5; a++) {//5x
			for(int b=0; b<5; b++) {//5x
				System.out.print(b);
			}//for a
			System.out.println();
		}//for b
		
		}
		

}
