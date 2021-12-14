package HW07.HomeWork;

import HW05.HomeTask.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Company {
    // We initialize static variables inside a static block.
    static private Comparator<Employee> ascSalary;
    static private Comparator<Employee> descSalary;

    static {
        ascSalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.calculatePay(), e2.calculatePay());
            }
        };

        descSalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.calculatePay(), e1.calculatePay());
            }
        };
    }

    private Employee[] company;

    public Company(Employee[] company) {
        this.company = company;
    }

    public Employee[] getCompany() {
        return company;
    }

    public void sortAscBySalary() {
        Arrays.sort(company, ascSalary);
    }

    public void sortDescBySalary() {
        Arrays.sort(company, descSalary);
    }

    @Override
    /*public String toString() {
        return "CarSet{" +
                "carSet=" + Arrays.toString(carSet) +
                '}';
    }*/
    public String toString() {
        String result = "";
        for (Employee e : company) {
            result = result + e + "\n";
        }
        return result;
    }

    public void initNumbers() {
        for (Employee e : company) {
            if (e instanceof SalariedEmployee) {
                SalariedEmployee se = (SalariedEmployee) e;
                if (se.getSocialSecurityNumber().isEmpty()) {
                    se.setSocialSecurityNumber(getRndNum());
                }
            } else if (e instanceof ContractEmployee) {
                ContractEmployee ce = (ContractEmployee) e;
                if (ce.getFederalTaxIdmember().isEmpty()) {
                    ce.setFederalTaxIdmember(getRndNum());
                }
            }
        }
    }

    private String getRndNum(){
        Random num = new Random();
        int rnd = num.nextInt(100000000);
        return "GEN_" + rnd;
    }

    public void printList() {
        for (Employee e : company) {
            System.out.println(e);
        }

    }
}
