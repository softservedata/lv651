package com.software.edu.hw11.practicalTask2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your first name, surname and patronymic: ");
        String fullName = br.readLine();

        String[]arr = fullName.split(" ");

        String name = arr[0];
        String surname= arr[1];
        String patronymic = arr[2];

        System.out.println("Your surname and initials: "+ surname+" " + name.charAt(0)+". "+patronymic.charAt(0)+".");
        System.out.println("Your name is: "+ name);
        System.out.println("name, middle name and last name: "+ surname+" "+ patronymic+" "+surname);

    }

}
