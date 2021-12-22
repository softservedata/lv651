package com.company.edu.hw7.task1;

public class Head {

    public static void main(String[] args) {

Employee emp1 = new SalariedEmployee("2093ry", 23, 12);
        Employee emp2 = new SalariedEmployee("0923hy", 34, 23);
        Employee emp3 = new SalariedEmployee("dj3289", 12, 12);
        Employee emp4 = new ContractEmployee("j20gk", 2000);
        Employee emp5 = new ContractEmployee("20jgk", 3400);
        System.out.println(emp2);
        Employee[] arr=new Employee[]{emp1, emp2, emp3, emp4, emp5};

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
        System.out.println("There is employees ordered by salaries: ");
        for (Employee employee : arr) {
            System.out.println(employee.toString());
        }



    }
}


