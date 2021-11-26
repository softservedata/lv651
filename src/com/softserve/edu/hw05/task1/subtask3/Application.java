package com.softserve.edu.hw05.task1.subtask3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
        public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Insert number of error from 400-405: ");
            String input = read.readLine();
            switch (input.toLowerCase()) {
                case "400":
                    System.out.println(Errors.BAD_REQUEST);
                    break;
                case "401":
                    System.out.println(Errors.UNAUTHORIZED);
                    break;
                case "402":
                    System.out.println(Errors.PAYMENT_REQUIRED);
                    break;
                case "403":
                    System.out.println(Errors.FORBIDDEN);
                    break;
                case "404":
                    System.out.println(Errors.NOT_FOUND);
                    break;
                case "405":
                    System.out.println(Errors.METHOD_NOT_ALLOWED);
                    break;
                default:
                    System.out.println("Wrong input!");

    }
}
}
