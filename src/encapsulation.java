import java.util.Scanner;

public class encapsulation {
	
	boolean exit = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu menu = new stu();
		menu.runmenu();
		
		
		
	}
	
	
}

class stu{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private void header() {
		System.out.println("---------------------");
		System.out.println("/      welcome      /");
		System.out.println("/    Application    /");
		System.out.println("---------------------");
		
	}
	private void menu() {
		System.out.println("Press 1.encapsulation");
		System.out.println("Press 2 Inheritance");
		System.out.println("Press 3 polymorphism overloding");
		System.out.println("press 4 overriding");
		System.out.println("Press 0 exit");
	}
	public void runmenu() {
		
		header();
		boolean exit=false;
		while(!exit)
		{
			menu();
			int choice = getchoice();
			action(choice);
		}
		
	}
	private int getchoice() {
		Scanner ch =new Scanner(System.in);
		int choice= -1;
		while (choice<0 || choice >4) {
			try {
				System.out.println("\n enter choice from list:");
				choice =Integer.parseInt(ch.nextLine());
			}
			catch(NumberFormatException e){
				
				System.out.println("invalid input");
				
			}
			
		}
		return choice;
		
	}
	private void action(int choice) {
		switch(choice) {
		case 0:
		{
			System.out.println("thank you !!");
			boolean exit = true;
			break;
		}
		case 1:
		{
			encapsulation();
			break;
		}
		case 2:
		{
			 inheritance myobj = new inheritance();
			 System.out.println("enter 1st number that you want to add");
			 Scanner sc =new Scanner (System.in);
			 int no=sc.nextInt();
			 myobj.num1=no;
			 System.out.println("enter 2nd number that you want to add");
			 Scanner sc2 =new Scanner (System.in);
			 int no1=sc.nextInt();
			 myobj.num2=no1;
			 myobj.sum();
			 System.out.println("your sum  is "+myobj.result);
			 myobj.sub();
			 System.out.println("your substraction is" +myobj.result ); // come from anoter class call i
			 break;
		}
		case 3:
		{
			print pri = new print ();
			pri.show();
			pri.show(5);
			
		}
		
		case 4:
		{
			animal ani = new animal();
			ani.sound();
			animal dog = new dog(); // must be 
			dog.sound();
			dog d1 = new dog();
			d1.sound();
		}
		default:
		{
			{System.out.println("invalid choiice!");
		}
	}
}
		
		
	}
	private void  encapsulation() {
		stu s1 = new stu();
		s1.setId(3);
		s1.setName("bhakti");
		System.out.println(s1.getName());
		stu s2 = new stu();
		s2.setName("abc");
		s2.setId(1);
		stu s3 = new stu();
		s3.setId(2);
		s2.setName("xyz"); 
		
	}
	
	class inheritanceMain{
		
		int num1,num2,result=0;
		
		public void sum() {
			result = num1 +num2;
		}
		
	}
	class inheritance extends inheritanceMain { // extends class i
		
		public void sub() {
			
			result = num1-num2;
		}
		
		
	}
	class print{
		//in overloading there is name of the method is same parameter are different.
		public void show() {
			
			System.out.println("coming from show");
		}
		public void show(int num) {
			System.out.println("coming from show para");
		}
		
	}
	class animal {
		 //in overring occurss in two classes and the name, parameter must be same.
		public void sound() {
			System.out.println("come from animal super class");
		}
		
	}
	class dog extends animal{
		public void sound() {
			System.out.println("come from dog subclass");
		}
		
	}
	
}
