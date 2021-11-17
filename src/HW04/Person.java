package HW04;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    private static int countPerson;

    public Person(String firstName, String lastName) {
        countPerson++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        countPerson++;
        this.firstName = "firstName_" + countPerson;
        this.lastName = "lastName_" + countPerson;
    }

    public Person(String firstName, String lastName, int birthYear) {
        countPerson++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        return 2021-birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                (birthYear == 0 ? "" :", birthYear=" + birthYear) +
                (birthYear == 0 ? "" : ", age=" + getAge()) +
                '}';
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

    public void changeName(String fn){
        setFirstName(fn);
    }
}
