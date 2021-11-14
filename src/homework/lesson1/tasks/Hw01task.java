package homework.lesson1.tasks;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Hw01task {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*Define integer variables a and b. Read values a and b from Console and calculate:
            a + b
            a - b
            a * b
            a / b.
        Output obtained results.
        */
        System.out.println("TASK 1");
        System.out.println("Enter a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("RESULTS");
        System.out.println("a + b = " + (a+b) +
                "\na - b = " + (a-b) +
                "\na * b = " + (a*b) +
                "\na / b = " + (a/b));

        //Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".

        System.out.println("\nTASK 2");
        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}
