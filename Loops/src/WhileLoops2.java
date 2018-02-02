
public class WhileLoops2 {
public static void main(String[] args) {
	//while(condition){do this}
	//make sure you increment/decrement
	for(int i = 0; i < 10; i++);
	
	int x = 0;
	while(x<10) {
		System.out.println(x);
		x++;
	}
	int ayy = 20;
	while(ayy > 5) {
		System.out.println(ayy);
		ayy--;
		if(ayy==20) {
			continue;
		}
	}
	int b = 15;
	do {
		System.out.println(b);
		b-=2;
	}while( b > 5);
	
}
}
