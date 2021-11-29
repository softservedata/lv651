package homework.hw04.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read 3 float numbers and check: are they all belong to the range [-5,5];

        String numbers = "";
        float num1, num2, num3;
        int counter = 0;
        System.out.println("Enter float number: ");
        num1 = sc.nextFloat();
        if (num1 <= 5 && num1 >= -5) {
            numbers = numbers + "num1( " + num1 + " ) ";
            counter++;
        }
        System.out.println("Enter float number: ");
        num2 = sc.nextFloat();
        if (num2 <= 5 && num2 >= -5) {
            numbers = numbers + "num2( " + num2 + " ) ";
            counter++;
        }
        System.out.println("Enter float number: ");
        num3 = sc.nextFloat();
        if (num3 <= 5 && num3 >= -5) {
            numbers = numbers + "num3( " + num3 + " ) ";
            counter++;
        }
        System.out.println("Only " + counter + " numbers belong the range [-5,5]: " + numbers);

        //read 3 integer numbers and write max and min of them;

        int n1, n2, n3;
        System.out.println("Enter int number: ");
        n1 = sc.nextInt();
        System.out.println("Enter int number: ");
        n2 = sc.nextInt();
        System.out.println("Enter int number: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("max: " + n1);
                if (n2 > n3) {
                    System.out.println("Min: " + n3);
                } else {
                    System.out.println("Min: " + n2);
                }
            } else {
                System.out.println("Max: " + n3);
                System.out.println("Min: " + n2);
            }
        } else {
            if (n2 > n3) {
                System.out.println("Max: " + n2);
                if (n1 > n3) {
                    System.out.println("Min: " + n3);
                } else {
                    System.out.println("Min: " + n1);
                }
            } else {
                System.out.println("Max: " + n3);
                System.out.println("Min: " + n1);
            }
        }

        //read number of HTTP Error (400, 401,402, ...) and write the name of this error

        System.out.println("Enter error code [400:409]: ");
        int a;
        a= sc.nextInt();
        switch (a) {
            case 400:
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HTTPError.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println(HTTPError.FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.NOT_FOUND);
                break;
            case 405:
                System.out.println(HTTPError.METHOD_NOT_ALLOWED);
                break;
            case 406:
                System.out.println(HTTPError.NOT_ACCEPTABE);
                break;
            case 407:
                System.out.println(HTTPError.PROXY_AUTHENTICATION_REQUIRED);
                break;
            case 408:
                System.out.println(HTTPError.REQUEST_TIMEOUT);
                break;
            case 409:
                System.out.println(HTTPError.CONFLICT_ERROR);
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}
