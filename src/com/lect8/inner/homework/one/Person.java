package com.lect8.inner.homework.one;

public abstract class Person extends FullName{
    FullName fullName = new FullName();
    private int age;
    public Person (int age, String firstName, String lastName){
        this.age = age;
        this.firstName = getFirstName();
        this.lastName = getLastName();
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        System.out.println("info()");
        return "Age: "+ age +"\nFirst name: "+ firstName+ "\nLast name: "+ lastName+".";
    }
    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName=" + fullName +
                ", age=" + age +
                '}';
    }
}
