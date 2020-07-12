
public class firstjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char C ='?';
		System.out.println((int)C);// return the anscis value
		 int i =5,j=3,k=3;
		 byte l = 8;
		 i += 3; // is same as a i = i + 3
		 j -=3;
		 k *=3;
		// l = l*2.5; show error 
		 l *=2.5; //
		 System.out.println("plus= "+i+" minus= "+j+" multiple= "+k+" byte is" +l);
		
		i++; //is same like i=i+1 post increment
		int m = ++j; //is pre increment
		System.out.println("increment by one = "+i+ " post increment "+m);
		
		System.out.println("bitewise operators: and ,or");
		//RULES:
		// & 1 1 ->1  (for & if any of the value have 1 than its 1)
		// | 0 1 ->1  (for | if any of the value have 1 than its 1)
		// | 0 0 ->1  (for | if both value is 0 than 0)
		// | 1 0 ->1  (for | if any of the value have 1 than its 1)
		
		int n =25; //1 1 0 0 1
		int p=15;  //0 1 1 1 1
				  // 1 1 1 1 1 ->31 for | operators
				 //  0 1 0 0 1 ->9 for & operators
		
		int q= n & p;
		int r= n | p;
		System.out.println("bitwise and is:" +q);
		System.out.println("bitwise or is:" +r);
		
		System.out.println("<<left shift and >> right shift");
		int s =8; // 1 0 0 0
		int t = s << 2; //1 0 0 0 0 0 add 2 more zero
		System.out.println("left shift is :"+t);
		
		System.out.println("Data type boolean :");
		//boolean is data type
		//Boolean is class 
		boolean u = true; // value is must
		u= !u; // output is false
		System.out.println("Boolean data type :"+u);
		
		
		
	}
	
	

}
