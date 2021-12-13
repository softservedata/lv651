package HW07.PracticalTask.PT2;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";
    private String groupName;

    public Student(String name, String groupName) {
        setName(name);
        this.groupName = groupName;
        System.out.println("Object type " + TYPE_PERSON + " was created.");
    }

    public Student(String name) {
        setName(name);
        this.groupName = "JavaCore_LV_651";
        System.out.println("Object type " + TYPE_PERSON + " was created.");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.print("I am a " + getName());
    }

}
