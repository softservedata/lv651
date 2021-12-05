package com.softserve.edu.hw05;

import java.util.Scanner;

//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

public class Task1_3 {public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter the number of HTTP Error from 400 to 410: ");
    int error = scanner.nextInt();
	
    switch (error) {
        case 400:
            System.out.println("The name of this error " + error + " is " + HTTPError.BAD_REQUEST);
            break;
        case 401:
            System.out.println("The name of this error " + error + " is " + HTTPError.UNAUTHARIZED);
            break;
        case 402:
            System.out.println("The name of this error " + error + " is " + HTTPError.PAYMENT_REQUIRED);
            break;
        case 403:
            System.out.println("The name of this error " + error + " is " + HTTPError.FORBIDDEN);
            break;
        case 404:
            System.out.println("The name of this error " + error + " is " + HTTPError.NOT_FOUND);
            break;
        case 405:
            System.out.println("The name of this error " + error + " is " + HTTPError.METHOD_NOT_ALLOWED);
            break;
        case 406:
            System.out.println("The name of this error " + error + " is " + HTTPError.NO_ACCEPTABLE);
            break;
        case 407:
            System.out.println("The name of this error " + error + " is " + HTTPError.PROXY_AUTHENTICATION_REQUIRED);
            break;
        case 408:
            System.out.println("The name of this error " + error + " is " + HTTPError.REQUEST_TIMEOUT);
            break;
        case 409:
            System.out.println("The name of this error " + error + " is " + HTTPError.CONFLICT);
            break;
        case 410:
            System.out.println("The name of this error " + error + " is " + HTTPError.GONE);
            break;
        default:
            System.out.println("Unknown error");
    }
}
}
	

		
