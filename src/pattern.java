import java.util.Scanner;

public class pattern {
	
	public static void main(String[]args) {
	  
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);  
	    
	    System.out.println("enter pattern number from 1 to 3:");
	    int num= sc.nextInt();
		
	    if (num==1)
	    {
		int i,j;
		for (i=1;i<=5;i++) //rows
		{
			for (j=1;j<=i;j++) //column
			{
				if ((i+j)%2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
				
				
			}
			System.out.println("");
		}
	    }
	    else if (num==2)
	    {
	    	for(int k=1;k<=5;k++)
	    	{
	    		for (int l=1;l<=k;l++)
	    		{
	    			System.out.print(k);
	    		}
	    		System.out.println("");
	    	}
	    	
	    }
	    else
	    {
	    	for(int m=1;m<=5;m++)
			{
				for(int n=5-m;n>=1;n--)
				{
					System.out.print("");
					for(int o=1;o<=m;o++)
					{
						System.out.print("1 ");
						
					}
					
				} 
				
				
				System.out.println();
				
			}
	    	
	    }

	}

}
