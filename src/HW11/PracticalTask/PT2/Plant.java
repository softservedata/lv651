package HW11.PracticalTask.PT2;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.BLUE;
            case "red" : return Color.RED;
            case "white" : return Color.WHITE;
            default : throw new ColorException("Input only color blue, red or white. You tried enter '" + color + "'");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "wild" : return Type.WILD;
            case "hybrid" : return Type.HYBRID;
            case "modern" : return Type.MODERN;
            case "climbing" : return Type.CLIMBING;
            default : throw new TypeException("Input only type wild, hybrid, modern, or climbing");
        }
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Rose type: '" + getType() + "' " +
                "color: " + getColor() + "' " +
                "size :" + getSize();
    }
}
