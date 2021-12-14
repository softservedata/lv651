package HW07.HomeWork;

/*
 * Create ContractEmployee which implement interface Payment and are inherited from the Employee class.
 * Describe hourly paid workers in the relevant classes
 * Include a description of federalTaxIdmember in the class of ContractEmployee.
 * */
//public class ContractEmployee extends Employee implements Payment {//????????
public class ContractEmployee extends Employee{
    private String federalTaxIdmember;
    private double salaryPerHour;
    private int workedHours;

    public ContractEmployee(String name) {
        super(name);
        setDefaultData();
//        this.federalTaxIdmember = "";
//        this.salaryPerHour = 0.0;
//        this.workedHours = 0;
    }

    public ContractEmployee(String name, Departments department) {
        super(name, department);
        setDefaultData();
    }

    public ContractEmployee(String name, Departments department, String position) {
        super(name, department, position);
        setDefaultData();
    }

    public ContractEmployee(String name, Departments department, String position, String federalTaxIdmember) {
        super(name, department, position);
        this.federalTaxIdmember = federalTaxIdmember;
        this.salaryPerHour = 0;
        this.workedHours = 0;
    }

    public ContractEmployee(String name, Departments department, String position, String federalTaxIdmember, double salaryPerHour) {
        super(name, department, position);
        this.federalTaxIdmember = federalTaxIdmember;
        this.salaryPerHour = salaryPerHour;
        this.workedHours = 0;
    }

    public ContractEmployee(String name, Departments department, String position, String federalTaxIdmember, double salaryPerHour, int workedHours) {
        super(name, department, position);
        this.federalTaxIdmember = federalTaxIdmember;
        this.salaryPerHour = salaryPerHour;
        this.workedHours = workedHours;
    }

    private void setDefaultData() {
        this.federalTaxIdmember = "";
        this.salaryPerHour = 0.0;
        this.workedHours = 0;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double calculatePay() {
        return getSalaryPerHour() * getWorkedHours();
    }

    /*@Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                ", workedHours=" + workedHours +
                '}';
    }*/
}
