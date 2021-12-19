package HW08.Examples.NestedClass;

//Non-static Nested Classes
public class Person {
    private FullName fullName = new FullName();
    private int age;

    public Person(String firsName, String lastName, int age) {
        fullName.firstName = firsName;
        fullName.lastName = lastName;
        this.age = age;
    }

    // getters and setters
    private class FullName {
        private String firstName;
        private String lastName;
    }
}
