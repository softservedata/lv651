package HW07.HomeWork;

import java.util.Random;

public class HW_1 {
    /*
    Create Payment interface with the method calculatePay(),
    the base class Employee with a string variable employeeld.
    Create two classes SalariedEmployee and ContractEmployee,
       which implement interface and are inherited from the base class.
    Describe hourly paid workers in the relevant classes (one of the children),
    and fixed paid workers (second child).
    Describe the string variable socialSecurityNumber in the class SalariedEmployee .
    Include a description of federalTaxIdmember in the class of ContractEmployee.
    */
    public static void main(String[] args) {
        SalariedEmployee sam = new SalariedEmployee("Sam", Departments.Management, "Boss", 5000.00, "1987399999888");
        SalariedEmployee samanta = new SalariedEmployee("Samanta", Departments.HumanResource, "HR", 2000.99);
        SalariedEmployee smith = new SalariedEmployee("Smith", Departments.Marketing);
        SalariedEmployee mary = new SalariedEmployee("Mary", Departments.Finance, "Accountant");
        ContractEmployee max = new ContractEmployee("Max", Departments.Developers, "Team lead", "FFF55512345", 30, 150);
        ContractEmployee georg = new ContractEmployee("Georg", Departments.Developers, "Senior Java Developer", "GVB987623", 20);
        ContractEmployee bill = new ContractEmployee("Bill", Departments.Developers);
        ContractEmployee steve = new ContractEmployee("Steve", Departments.Developers);
        ContractEmployee john = new ContractEmployee("John", Departments.GeneralService);
        Employee[] company = new Employee[]{
                sam,
                samanta,
                smith,
                mary,
                max,
                georg,
                bill,
                steve,
                john
        };
        smith.setPosition("Marketer");
        smith.setSalary(999.99);

        mary.setSalary(3000.00);

        georg.setWorkedHours(170);

        bill.setPosition("Middle Java Developer");
        bill.setWorkedHours(192);
        bill.setSalaryPerHour(15);

        steve.setPosition("Junior Java Developer");
        steve.setWorkedHours(200);
        steve.setSalaryPerHour(10);

        john.setPosition("Cleaner");
        john.setWorkedHours(100);
        john.setSalaryPerHour(5);

        initNumbers(company);
        printListEmployee(company);

    }

    private static void printListEmployee(Employee[] company) {
        for (Employee e : company) {
            System.out.println(e);
        }
    }

    private static void initNumbers(Employee[] company) {
        for (Employee e : company) {
            if (e instanceof SalariedEmployee) {
                SalariedEmployee se = (SalariedEmployee) e;
                if (se.getSocialSecurityNumber().isEmpty()) {
                    se.setSocialSecurityNumber(new Random(1000000).toString());
                }
            } else if (e instanceof ContractEmployee) {
                ContractEmployee ce = (ContractEmployee) e;
                if (ce.getFederalTaxIdmember().isEmpty()) {
                    ce.setFederalTaxIdmember(new Random(1000000).toString());
                }
            }
        }
    }
}
