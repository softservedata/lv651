package HW08.HomeWork.HW1;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public String info() {
        return "Person{" +
                "firstName=" + fullName.firstName +
                " ,lastName=" + fullName.lastName +
                ", age=" + age +
                '}';
    }

    public abstract String activity();

    public static class FullName {
        protected String firstName;
        protected String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}