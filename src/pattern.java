import java.util.Scanner;

public class pattern {
	
	public static void main(String[]args) {
	  
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
	    
	    System.out.println("enter pattern number from 1 to 4:");
	    int num= sc.nextInt();
		
	    if (num==1)
	    {
	    	for (int i = 5; i >=0; i--) {
				for (int j = 5; j >=i; j--) {
					System.out.print(i);

				}
				System.out.println(" ");
			}
			for (int i = 1; i <=5; i++) {
				for (int j = 6-i; j >=1; j--) {
					System.out.print(i);

				}
				System.out.println(" ");
			}

	    }
	    else if (num==2)
	    {
	    	int k=10;
			for(int a=5;a>=1;a--)
			{
				for(int b=a;b>=1;b--)
				{
					System.out.print(k+" ");
					k=k-2;
					
				}
				System.out.println();
				k=10;
				
			}
	    }
	    else if(num==3)
	    {
	    	for(int m=1;m<=5;m++)
			{
				for(int n=1;n<=m;n++)
				{
				if((m+n)%2==0)	
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
				} 
				 
				
				System.out.println();
				
			}
	    	
	    	
	    }
	    else {
	    	for(int p=1;p<=5;p++)
	    	{
	    		for(int q=1;q<=p;q++)
	    		{
	    			System.out.print(p);
	    		}
	    		System.out.println("");
	    	}
	    	
	    }
	    

	}

}
