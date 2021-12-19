package HW08.HomeWork.HW1;

public class HW1 {
    public static void main(String[] args) {
        Student max = new Student("Max", "Smirnoff", 18,1);
        Student den = new Student(new FullName("Denis","Kuzminov"), 19,2);
        System.out.println(max.info());
        System.out.println(max.activity());
        System.out.println(den.info());
        System.out.println(den.activity());
    }
}
