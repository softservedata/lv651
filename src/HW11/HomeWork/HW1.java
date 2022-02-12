package HW11.HomeWork;

public class HW1 {
    /* Task:
     * Create method div(), which calculates the dividing of two double numbers.
     * In main method input 2 double numbers and call this method.
     * Catch all exceptions.
     * Write a method readNumber(int start, int end), that read from console integer number
     * and return it, if it is in the range [start...end].
     * If an invalid number or non-number text is read, the method should throw an exception.
     * Using this method write a method main(), that has to enter 10 numbers:
     * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
     */
    public static void main(String[] args) {
        double a = 20;
        double b = 10;
        System.out.println(div(a, b));
    }

    private static double div(double a, double b) {
        if (b==0.0) throw new ArithmeticException();
        return a / b;
    }


}
