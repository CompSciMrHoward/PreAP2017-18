
public class LogicalOperators2nd {

public static void main(String[] args) {
	//&& and
		//to be true, all conditions must be true
		//if there is one false, whole statement is false
		boolean t1 = true, t2 = true;//must be same data type
		//boolean t2 = true;^
		boolean f1 = false, f2 = false;
		//boolean f2 = false;
		System.out.println(t1 && t2 && f1);
	// || or
		//to be false, all must be false
		//to be true, need only one true
		System.out.println(f1 || t1 || f2);
//putting them together
		//take your time
		//work from the inner parentheses first
		System.out.println((t1 && t2) && (f1 || f2));
		//					 t          f       f
		System.out.println((f1 && t1) || (f2 || t2));
		//						f		t	  t
		
	}

}
