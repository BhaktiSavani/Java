
public class demoifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//And operator a b &&
					// t t t
					// t f f
					// f t f
					// f f f
		
		//or operator a b ||
					// t t t
					// t f t
					// f t t
					// f f f
		int num1=6;
		if (num1 %2==0) {
			System.out.println("number is even :"+num1);
		}
		else {
			System.out.println("number is odd :"+num1);
		}
		int a=4,b=7,c=2;
		if(a>b && b>c)
		{
			System.out.println("a is greatre");
		}
		else if(b>c)
		{
			System.out.println("b is greater :"+b);
		}
		else
		{
			System.out.println("C is greater :"+c);
		}

	}

}
