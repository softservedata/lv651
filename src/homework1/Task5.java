package homework1;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int c1 ;
		int c2 ;
		int c3 ;
		int t1 ;
		int t2 ;
		int t3 ;
		System.out.println("time 1");
		t1 = in.nextInt();  
System.out.println("price 1");
		c1 =  in.nextInt(); 
		System.out.println("time 2");
		t2 = in.nextInt(); 
		System.out.println("price 2");
		c2 =  in.nextInt();  
		System.out.println("time 3");
		t3 = in.nextInt(); 
		System.out.println("price 3");
		c3 =  in.nextInt();  	
		System.out.println("You will pay for first call " + c1 * t1 + " $");
		System.out.println("You will pay for second call " + c2 * t2 + " $");
		System.out.println("You will pay for third call " + c3 * t3 + " $");
		System.out.println("You will pay for all calls " + (c1*t1+c2*t2+c3*t3)+ " $");
	}		


}

