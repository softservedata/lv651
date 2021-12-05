package HW05.AdditionalTasks;

import java.util.Arrays;

public class Task2 {
    /*2.	Утворити та видрукувати послідовність  , елементи якої  утворюються за наступним правилом:

    */
    public static void main(String[] args) {
        double[] digs = new double[20];
        digs[0]=0;
        digs[1]=5.0/8.0;
        for (int i = 2; i < digs.length; i++) {
            digs[i] = digs[i-1]/2.0 + 3.0/4.0*digs[i-2];
        }
        System.out.println(Arrays.toString(digs));
    }
}
