package HW06.HomeWork;

public class HW_1 {
    /*
    Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
    Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
    Create array Bird and add different birds to it.
    Call fly() method for all of it. Output the
    information about each type of created bird
    */
    public static void main(String[] args) {
        Bird[] zoo = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Chicken()
        };

        printListBirds(zoo);
    }

    private static void printListBirds(Bird[] zoo) {
        for (Bird b : zoo) {
            System.out.println("I am a " + b.getName() + " " + b.fly());
        }
    }
}

abstract class Bird {
    boolean feathers;
    boolean layEggs;

    abstract String fly();

    abstract String getName();
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super.feathers = feathers;
        super.layEggs = layEggs;
    }

    @Override
    String fly() {
        return "I can fly!";
    }

    public String getName() {
        return "";
    }

    ;
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super.feathers = feathers;
        super.layEggs = layEggs;
    }

    @Override
    String fly() {
        return "I can't fly!";
    }

    public String getName() {
        return "";
    }

    ;
}

class Eagle extends FlyingBird {
    private String name;

    public Eagle() {
        super(true, true);
        name = "Eagle";
    }

    public String getName() {
        return name;
    }
}

class Swallow extends FlyingBird {
    private String name;

    public Swallow() {
        super(true, true);
        name = "Swallow";
    }

    public String getName() {
        return name;
    }
}

class Penguin extends NonFlyingBird {
    private String name;

    public Penguin() {
        super(true, true);
        name = "Penguin";
    }

    public String getName() {
        return name;
    }
}

class Chicken extends NonFlyingBird {
    private String name;

    public Chicken() {
        super(true, true);
        name = "Chicken";
    }

    public String getName() {
        return name;
    }

    @Override
    String fly() {
        return super.fly() + " But I'm smart;)";
    }
}