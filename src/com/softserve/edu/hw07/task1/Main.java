package com.softserve.edu.hw07.task1;

public class Main {
    public static void main(String args[]) {
        ContractEmployee emp1 = new ContractEmployee("55555587", 2000);
        ContractEmployee emp2 = new ContractEmployee("84516516", 2500);
        SalariedEmployee emp3 = new SalariedEmployee("46548425", 17, 54);
        SalariedEmployee emp4 = new SalariedEmployee("65485151", 22, 55);
        SalariedEmployee emp5 = new SalariedEmployee("48478132", 30, 56);

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
