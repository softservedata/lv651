import java.io.IOException;
import java.util.Scanner;

public class FlowerBed {

	 public static void main(String[] args) throws IOException {

		
		 System.out.println("Please, enter radius of flower bed");
		 Scanner sc = new Scanner(System.in);
		 double r = Double.parseDouble(sc.nextLine());
		 sc.close();
		 System.out.println("Radius of flower bed is  "+r);
		 System.out.println("Perimetr of flower bed is  "+2*Math.PI*r);	
		 System.out.println("Area of flower bed is 	 "+Math.PI*Math.pow(r, 2));	
		 
	}
}

