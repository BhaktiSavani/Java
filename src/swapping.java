import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.print("press 1 if you want to only number swap:");
		int num=sc.nextInt();
		int temp=0;
		if (num==1)
		{
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
			
		}
		
		

	}

}
