package com.softserve.edu.homework6;

public class Main {

    public static void main(String[] args) {

        Employee[] arr = {new SalariedEmployee("000001","Taras","JAVA Junior Developer",10,120),
                          new SalariedEmployee("000002","Olga", "JAVA Middle Developer",25,150),
                          new SalariedEmployee("000003","Ivan","JAVA Senior Developer",35, 200),
                          new ContractEmployee("010001", "Oleg","JAVA Junior Developer",1000),
                          new ContractEmployee("010002", "Viktoria","JAVA Middle Developer",3000),
                          new ContractEmployee("010003","Valentin","JAVA Senior Developer",6000)};

        System.out.println(arr[0]);
        System.out.println("The average monthly wage " + arr[0].calculatePay());
        System.out.println(arr[1]);
        System.out.println("The average monthly wage " + arr[1].calculatePay());
        System.out.println(arr[2]);
        System.out.println("The average monthly wage " + arr[2].calculatePay());
        System.out.println(arr[3]);
        System.out.println("The average monthly wage " + arr[3].calculatePay());
        System.out.println(arr[4]);
        System.out.println("The average monthly wage " + arr[4].calculatePay());
        System.out.println(arr[5]);
        System.out.println("The average monthly wage " + arr[5].calculatePay());
    }
}


