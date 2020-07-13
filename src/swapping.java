import java.util.Scanner;

public class swapping {
	
	int facto(int n){
		if(n==1){
			return 1;
		}
		else 
		{
			return n * facto(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("select the function");
		System.out.println("press 1.swapping");
		System.out.println("press 2.find factorial");
		int sno =sc.nextInt();
		if (sno==1) {
			int temp=0;
			Scanner no1 =new Scanner(System.in);
			System.out.print("enter the 1st number");
			int num1=no1.nextInt();
			System.out.print("enter the 2nd number");
			int num2=no1.nextInt();
			System.out.println(num1+ "your 1st number");
			System.out.println(num2+ "your 1st number");
			
			temp=num1;
			num1=num2;
			num2=temp;
			System.out.println(num1+ "your 1st number after swapping");
			System.out.println(num2+ "your 1st number after swapping");
		}
		else {
			swapping myobj =new swapping();
			Scanner fno = new Scanner(System.in);
			System.out.println("enter the no that you want to find factorial");
			int fnum = fno.nextInt();
			System.out.println(myobj.facto(fnum));
		}
	
		
		
		

	}

}
