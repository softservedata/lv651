import java.util.Scanner;

public class Calls {

	public static void main(String[] args) {
	
		System.out.println("Hello! Input price of units per min from country1: ");
		 Scanner sc = new Scanner(System.in);
		 double c1 = Double.parseDouble(sc.nextLine());
		 System.out.println( "Country1: "+ c1 +   " units per min. Please input duration of talk:");
		 double t1 = Double.parseDouble(sc.nextLine());
		 
		 System.out.println("Input price of units per min from country2: ");
		 double c2 = Double.parseDouble(sc.nextLine());
		 System.out.println( "Country2: "+ c2 +   " units per min. Please input duration of talk:");
		 double t2 = Double.parseDouble(sc.nextLine());
		  
		 System.out.println("Input price of units per min from country3: ");
		 double c3 = Double.parseDouble(sc.nextLine());
		 System.out.println( "Country3: "+ c3 +   " units per min. Please input duration of talk:");
		 double t3 = Double.parseDouble(sc.nextLine());
		 sc.close();
		 	 
		 System.out.println("Call 1:	 " + c1*t1+ " utits");
		 System.out.println("Call 2:	 " + c2*t2+ " utits");
		 System.out.println("Call 3:	 " + c3*t3+ " utits");
		 System.out.println("Total:	" +  (c1*t1+c2*t2+t3*c3) + " units"); 
		 System.out.println(" The End! :)");

		 
}
}