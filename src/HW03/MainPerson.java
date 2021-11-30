package HW03;

public class MainPerson {
    public static void main(String[] args) {

        Person pMax = new Person("Max", "Fridman");
        Person pMarta = new Person("Marta", "Simon");
        //pMax.setBirthYear(1998);
        pMarta.setBirthYear(2000);

        Person pIvan = new Person("Ivan", "Kozak", 2001);
        Person pStepan = new Person("Stepan", "Galushka", 2005);
        Person pTaras = new Person("Taras", "Bulba", 2007);


        System.out.println(pMax);
        System.out.println(pMarta);
        System.out.println(pIvan);
        System.out.println(pStepan);
        System.out.println(pTaras);
    }
}
