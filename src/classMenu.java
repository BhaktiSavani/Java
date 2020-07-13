import java.text.NumberFormat;
import java.util.Scanner;

public class classMenu {

	boolean exit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classMenu menu = new classMenu();
		menu.runmenu();

	}
	public void runmenu() {
		header();
		while(!exit)
		{
			menu();
			int choice = getchoice();
			action(choice);
		}
		
	}
	private void header() {
		System.out.println("---------------------");
		System.out.println("/      welcome      /");
		System.out.println("/    Application    /");
		System.out.println("---------------------");
		
	}
	private void menu() {
		System.out.println("Press 1.add product");
		System.out.println("Press 2 Update product");
		System.out.println("Press 3 Delete Product");
		System.out.println("Press 0 exit");
	}
	private int getchoice() {
		Scanner ch =new Scanner(System.in);
		int choice= -1;
		while (choice<0 || choice >2) {
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
			exit =true;
			break;
		}
		case 1:
		{
			//addproduct();
			System.out.println("add input");
			break;
		}
		case 2:
		{
			//updateproduct();
			System.out.println("update input");
			break;
		}
		default:
		{
			System.out.println("invalid choiice!");
		}
		}
		
	}

}
