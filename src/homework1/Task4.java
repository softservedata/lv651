package homework1;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is you name?");
		String name =  in.nextLine();
		System.out.println("Hi, " + name);
		System.out.println("Where are you live ? " + name);
		String address =  in.nextLine();
		System.out.println("Your address is " + address);
	}

}
