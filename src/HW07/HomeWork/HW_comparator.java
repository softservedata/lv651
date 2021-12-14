package HW07.HomeWork;

public class HW_comparator {
    /*
    * HW_7.1:using comparator for sorting array
    * */
    public static void main(String[] args) {

        Company company = new Company(new Employee[]{
                new SalariedEmployee("Sam    ", Departments.Management, "Boss", 5000.00, "1987399999888"),
                new SalariedEmployee("Samanta", Departments.HumanResource, "HR", 2000.99),
                new SalariedEmployee("Smith  ", Departments.Marketing, "Marketer",999.99),
                new SalariedEmployee("Mary   ", Departments.Finance, "Accountant",3000.66),
                new ContractEmployee("Max    ", Departments.Developers, "Team lead", "FFF55512345", 30, 150),
                new ContractEmployee("Georg  ", Departments.Developers, "Senior Java Developer", "GVB987623", 20,170),
                new ContractEmployee("Bill   ", Departments.Developers, "Middle Java Developer","",192,15),
                new ContractEmployee("Steve  ", Departments.Developers,"Junior Java Developer","",200,10),
                new ContractEmployee("John   ", Departments.GeneralService, "Cleaner", "",100,5)
        });

        company.initNumbers();
        for (Employee e : company.getCompany()) {
            System.out.println(e);
        }

        System.out.println("\nSorting by salary");
        company.sortAscBySalary();
        company.printList();
    }
}
