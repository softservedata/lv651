package com.software.edu.hw08.homework1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

    class  Employee {
        protected String id;
        protected String name;
        protected int salary;
        private String employeeId;


        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee name: " + getName() + ", Employee ID Number: " + getId() + ", Employee payment: " + salary ;
        }
    }
    class Main{
    static class EmployeeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }

    }

    public static void main(String[] args) {
        Employee[] people= new Employee[]{
                new SalariedEmployee("ID 15454","David",15,24),
                new ContractEmployee("ID 45789","Sophia",798),
                new SalariedEmployee("ID 24555","Olga",20,15),
                new ContractEmployee("ID 73195","Ivan",135)
        };
        Arrays.sort(people,new EmployeeComparator());
        for (Object i : people) {
            System.out.println(i);
        }
    }

}
