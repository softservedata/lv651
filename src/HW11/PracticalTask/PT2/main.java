package HW11.PracticalTask.PT2;

public class main {
    /*
    Create a class Plant, which includes fields int size, Color color and Type type,
    and constructor where these fields are initialized. Color and type are Enum. Override the method toString( ).
    Create classes ColorException and TypeException and describe there all possible colors and types of plants.
    In the method main create an array of five plants. Check to work your exceptions.
     */
    public static void main(String[] args) {
        Plant[] roses = new Plant[3];
        try {
            roses[0] = new Plant("wild", "blue", 5);
            roses[1] = new Plant("climbing", "red", 5);
            roses[2] = new Plant("modern", "black", 5);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }

        for (Plant pl : roses) {
            System.out.println(pl);
        }

    }
}
