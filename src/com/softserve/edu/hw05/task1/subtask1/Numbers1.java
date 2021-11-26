package com.softserve.edu.hw05.task1.subtask1;
import com.softserve.edu.hw05.task1.subtask3.Errors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers1 {
    public static void checkNumber(float input){
        if (input >= -5 && input <= 5) {
            System.out.println("Value belongs to the range [-5,5]");
        } else {
            System.out.println("Error! Value doesn't belong to the range [-5,5]");
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert float number: ");
        float input = Float.parseFloat(read.readLine());
        checkNumber(input);
        System.out.println("Insert float number: ");
        float input1 = Float.parseFloat(read.readLine());
        checkNumber(input1);
        System.out.println("Insert float number: ");
        float input2 = Float.parseFloat(read.readLine());
        checkNumber(input2);






    }
}

