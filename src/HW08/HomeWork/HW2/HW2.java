package HW08.HomeWork.HW2;

public class HW2 {
    public static void main(String[] args) {
        Wrapper<Integer> wrIntegerA = new Wrapper<>(5);
        Wrapper<Integer> wrIntegerB = new Wrapper<>(5);
        Wrapper<String> wrString = new Wrapper<>("Hello");
        Wrapper<Boolean> wrBoolean = new Wrapper<>(true);

        int intA = wrIntegerA.getValue();
        int intB = wrIntegerB.getValue();
        String str = wrString.getValue();
        boolean isWorked = wrBoolean.getValue();

        if (isWorked){
            System.out.println("boolean worked.");
            if(intA+intB==10) {
                System.out.println("int was wrapped.");
            }
        }else{
            System.out.println("boolean don't work");
        }
        System.out.println("String is '" + str + "'");

    }
}
