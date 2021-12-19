package HW08.Examples.Clone;

public class appClone {
    public static void main(String[] args) {
        Person person = new Person(new Person.FullName("Mike", "Green"), 25);
        try {
            Person copyOfPerson = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
