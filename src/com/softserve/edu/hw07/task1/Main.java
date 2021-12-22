package com.softserve.edu.hw07.task1;


public class Main {
    public static void main(String args[]) {
        ContractEmployee emp1 = new ContractEmployee("1122354fd", 3000);
        ContractEmployee emp2 = new ContractEmployee("542af123r", 3500);
        SalariedEmployee emp3 = new SalariedEmployee("98as3258", 20, 72);
        SalariedEmployee emp4 = new SalariedEmployee("12345678", 30, 48);
        SalariedEmployee emp5 = new SalariedEmployee("a12d5q65", 45, 100);

        Employee[] arr = {emp1, emp2, emp3, emp4, emp5};
            Employee tmp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].calculatePay() > arr[j].calculatePay()) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

        for (int i = 0; i < 5; i++)
            System.out.println(arr[i]);
        }

    }
