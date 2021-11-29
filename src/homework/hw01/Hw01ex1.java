package homework.hw01;
//Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class Hw01ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of the flower bed: ");
        int radius = Integer.parseInt(br.readLine());
        double pi = 3.1415;
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;
        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }
}
