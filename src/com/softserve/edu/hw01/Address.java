import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		 System.out.println("What is your name? ");
		 Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
		 System.out.println("Where are you live, "+name+" ?");
		 String address = sc.nextLine();
		 System.out.println(name + " lives in "+address+" .");
		 
		 sc.close();
		
		

	}

}
