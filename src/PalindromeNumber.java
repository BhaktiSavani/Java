import java.util.Scanner;

public class PalindromeNumber {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the number from the list");
		System.out.println("1.fibonacci");
		System.out.println("2.palindrome Number");
		System.out.println("3.perfact number");
		System.out.println("4.armstorng number");
		System.out.println("5.Prime Number");
		
		
		int no= sc.nextInt();
		if(no==1)
			
			//fibonacci values 1,1,3,5,...n
		{
			int k=0,a=1,b=1;
			System.out.print("1 1 ");
			while(k<=50)
			{
				k=a+b;
				System.out.print(k +" ");
				a=b;
				b=k;
			}
			
			
		}
		else if(no==2)
			//palindrome number is a number that remains the same when its digits are reversed ex.121
		{
			Scanner pnum =new Scanner(System.in);
			System.out.println("Enter the number that you want to check is palindrome");
			int n = pnum.nextInt();
			int temp=n;
			int rev=0,store=0;
			while(n>0)
			{
					rev=n%10;  //getting remainder  
				    store=(store*10)+rev;    
				   	n=n/10;   
			
			}
			if(temp==store) {
				System.out.println("is palindrome");
			}
			else {
				System.out.println("not palndrome");
			}
			
			
		}
		
		else if(no==3)
		{
			//perfact num is number factorials sum equals to itself ex. 6=1+2+3
			Scanner pf=new Scanner(System.in);
			System.out.println("Enter the number that you want to check is perfact");
			int pfnum = pf.nextInt();
			int temp2 =0;
			for(int in=1;in<pfnum;in++) // for loop must started from =1 must be 1 otherwise its shows exception
			{
				if(pfnum%in==0)
				{
					temp2=temp2+in;
				}
				
			}
			if(pfnum==temp2)
			{
				System.out.println("is perfact");
			}
			else 
			{
				System.out.println("is not perfact");
			}
			
			
		}
		
		else if(no==4)
		{
			//sum of the cubes of its digits is equal to the number itself
			//ex.153 1*1*1 + 5*5*5 + 3*3*3 = 1 +125+ 27 = 153
			
			Scanner ano =new Scanner(System.in);
			System.out.print("Enter the number you want to check is armstrong");
			int anum =ano.nextInt();
			int rev2=0, sum2=0;
			int temp = anum;
			while(anum>0)
			{
				rev2 =anum %10;
				anum =anum/10;
				sum2= sum2 +rev2*rev2*rev2;
				
			}
			if(temp==sum2){
				System.out.println("is armstorng");
			}
			else {
				System.out.println("is not armstorng");
			}
		
			
			
		}
		
		else if(no==5){
			//that number which can not divide by any other number its only divide by 1 and itself.
			Scanner prno= new Scanner(System.in);
			System.out.println("enter the number check is prime or not");
			int prnum= prno.nextInt();
			boolean isprime = true;
			
			for(int k=2;k<prnum;k++)
			{
				if(prnum%k==0)
				{
					isprime =false;
					break;
				}
					
			}
			if(isprime==false) {
			 System.out.print("is prime number");
			}
			else {
				System.out.println("is not");
			}
				
			
			
		}
		else {
			System.out.print("the number is out of list");
		}
		
		
		
		
		

	}

}
