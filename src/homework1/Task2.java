package homework1;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Hello " + name);
		System.out.println("How are you?");
		String answer = in.nextLine();
		System.out.println("You are " + answer);
		
	}

}


