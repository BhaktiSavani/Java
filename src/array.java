import java.util.Random;
import java.util.Scanner;

public class array {
 
	
	static Scanner sno=new Scanner(System.in);
	static int snum =sno.nextInt();
	
	//create user input array funcation
	public static void myarray() {
		int k[] = new int[10];
		int a,h=0,temp=0;
			
		Scanner s= new Scanner(System.in);
		System.out.println("enter size of array you want");
		    a=s.nextInt();

		   System.out.println("Add the number");
			for(int i=0; i<a; i++)
			{
						
				k[i]=s.nextInt();
				
				
			}
			for(int m=0;m<a;m++)
			{
				System.out.println("your arry a[" +m+"] = " +k[m]);
			}
			
	}
	
	public static void list()
	{
		
		System.out.println("Select item from the list");
		
		System.out.println("Press 1.Simple Array");
		System.out.println("Press 2.Random Array");
		System.out.println("Press 3 user input Array");
		System.out.println("Press 4 two dimesinal Array");
		//static Scanner sno=new Scanner(System.in);
		//static int snum =sno.nextInt();
		
		
		
	}
	
	public static void exit()
	{
		
		Scanner yn = new Scanner(System.in);
		System.out.println("press 1 if you want to go to main menu");
		int ans = yn.nextInt();
		if (ans==1)
		{
			list();
		    snum =sno.nextInt();
			
		}
		else {
			System.out.println("exit");
			System.exit(0);
		}
		
		
	}
	
	public static void main(String[] args) {
		// An array is a collection of similar data types/ elements
		
		
		array myobj =new array();
		myobj.exit();
		
		
		//list();
		
		//Scanner sno=new Scanner(System.in);
		//int snum =sno.nextInt();
		//array.list();
		if(snum==1) 
		{
		int a[] = new int[5]; 
		//int val[] ={2,4,6,8,10};
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=8;
		a[4]=10;
		
		for(int i=0;i<a.length;i++) //a.lenth property fetch the lenth of array
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
		exit();
		}
		else if(snum==2)
		{
			Random r= new Random();
			int arr[]=new int[5]; // if you try to fatch more than 5 array its showing Arrayindex out f the bounds Exception
			
			for (int j=0;j<arr.length;j++) {
				
				arr[j]=r.nextInt(20); // in between 0 to 20 getting random number using java class random
				try {
					System.out.println(arr[j]);
				}
				catch(Exception e) {
				System.out.println("Max value is 5");
				}
				
			}
			exit();
		}
		else if(snum==3) {
			//In 2d array, elements can be arranged in rows and columns
			
			myarray();
			exit();
		}
		
		else {
			
			int x[]= {5,3,6};
			int y[]= {1,5,0};
			int z[]= {2,7,9};
			
			int p[][]={{5,3,6}, {1,5,0},{2,7,9}};
			for (int c=0;c<3;c++) {
				for(int d=0;d<3;d++)
				{
					System.out.print(p[c][d]+ " ");
				}
			System.out.println();	
			}
			exit();
			
		}
	}
	
}
