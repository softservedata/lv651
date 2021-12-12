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
                new Eagle(true,true),
                new Swallow(false,true),
                new Penguin(true, false),
                new Chicken(false,false)
        };

        printListBirds(zoo);
    }

    private static void printListBirds(Bird[] zoo) {
        for (Bird b : zoo) {
            //System.out.println("I am a " + b.getName() + " " + b.fly());
            System.out.println(b + " " + b.fly());
        }
    }
}

abstract class Bird {
    boolean feathers;
    boolean layEggs;

    abstract String fly();

    abstract String getName();

    @Override
    public String toString() {
        return "I am a " + getName() +
                " I " + (feathers ? " have " : " haven't ") + "feathers" +
                " and I " + (layEggs ? " can " : " can't ") + "layEggs."
                ;
    }
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
}

class Eagle extends FlyingBird {
    private String name;

    public Eagle() {
        super(true, true);
        name = "Eagle";
    }

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        name = "Eagle";
    }

    public String getName() {
        return name;
    }

   /* @Override
    public String toString() {
        return "I am an " + getName() +
                "I " + (feathers ? " have " : "") + "feathers" +
                " and I " + (layEggs ? " can " : " can't ") + "layEggs."
                ;
    }*/
}

class Swallow extends FlyingBird {
    private String name;

    public Swallow() {
        super(true, true);
        name = "Swallow";
    }

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        name = "Swallow";
    }

    public String getName() {
        return name;
    }

    /*@Override
    public String toString() {
        return "I am an " + getName() +
                "I " + (feathers ? " have " : "") + "feathers" +
                " and I " + (layEggs ? " can " : " can't ") + "layEggs."
                ;
    }*/
}

class Penguin extends NonFlyingBird {
    private String name;

    public Penguin() {
        super(true, true);
        name = "Penguin";
    }

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        name = "Penguin";
    }

    public String getName() {
        return name;
    }

    /*@Override
    public String toString() {
        return "I am an " + getName() +
                "I " + (feathers ? " have " : "") + "feathers" +
                " and I " + (layEggs ? " can " : " can't ") + "layEggs."
                ;
    }*/
}

class Chicken extends NonFlyingBird {
    private String name;

    public Chicken() {
        super(true, true);
        name = "Chicken";
    }

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        name = "Chicken";
    }

    public String getName() {
        return name;
    }

    @Override
    String fly() {
        return super.fly() + " But I'm beautiful;)";
    }

    /*@Override
    public String toString() {
        return "I am an " + getName() +
                "I " + (feathers ? " have " : "") + "feathers" +
                " and I " + (layEggs ? " can " : " can't ") + "layEggs."
                ;
    }*/
}