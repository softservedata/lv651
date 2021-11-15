package homework1;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in); //імпортуємо сканер для вводу в консоль
		System.out.println(" Radius");
		double r;
		r =  in.nextDouble(); 
	double p = 3.14;
	double s=p*(r*r);
	double l=2*p*r;
	System.out.println("circle area\r\n"
			+ " = "+s+"\ncircle length= "+l);
	{
}
}
}