package HW04.HomeTasks;

public class HT2_1 {
    public static void main(String[] args) {
        /*
        Сreate class Dog with fields name, breed, age.
            Declare enum for field breed.
            Create 3 instances of type Dog.
            Check if there is no two dogs with the same name.
            Display the name and the kind of the oldest dog.
        */
        Dog rex = new Dog("REX", Breed.BOXER, 5);
        Dog rex2 = new Dog("REX", Breed.COLLIE, 5);
        Dog pex = new Dog("PEX", Breed.COLLIE, 4);
        Dog fex = new Dog("FEX", Breed.SPANIEL, 3);

        System.out.println("rex has the same name as rex2: " + rex.equals(rex2));
        if (rex.olderThan(pex) && rex.olderThan(fex)){
            System.out.println("The oldest dog is " + rex.getName() + ". Age:" + rex.getAge());
        }
        if (pex.olderThan(rex) && pex.olderThan(fex)){
            System.out.println("The oldest dog is " + pex.getName() + ". Age:" + pex.getAge());
        }
        if (fex.olderThan(rex) && fex.olderThan(pex)){
            System.out.println("The oldest dog is " + fex.getName() + ". Age:" + fex.getAge());
        }
    }
}
