package homework.hw07.tasks.task1;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee>{

    private int federalTaxIdmember;
    private double salary;
    private double fixedMonthlyPayment = 10000;

    // Constructors
    public ContractEmployee() {
        this.federalTaxIdmember = 0;
        this.salary = calculatePay();
    }

    public ContractEmployee(int employeeId, String name, int federalTaxIdmember) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.salary = calculatePay();
    }

    public ContractEmployee(int employeeId, String name, double salary, int federalTaxIdmember) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = salary;
        this.salary = calculatePay();
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getSalary() {
        return salary;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    //----------
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * federalTaxIdmember * (int) (salary * fixedMonthlyPayment);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEmployee that = (ContractEmployee) o;
        return federalTaxIdmember == that.federalTaxIdmember && Double.compare(that.salary, salary) == 0 && Double.compare(that.fixedMonthlyPayment, fixedMonthlyPayment) == 0;
    }

    @Override
    public double calculatePay() {
        if (fixedMonthlyPayment <= 0) {
            return 0;
        } else {
            return fixedMonthlyPayment;
        }
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "ID = " + getEmployeeId() +
                ", name = " + getName() +
                ", FTaxID = " + federalTaxIdmember +
                ", salary = " + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return -Double.compare(calculatePay(), employee.calculatePay());
    }
}
