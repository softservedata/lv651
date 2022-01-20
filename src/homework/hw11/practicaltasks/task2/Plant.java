package homework.hw11.practicaltasks.task2;

public class Plant{

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String type, String color) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String color) throws TypeException{
        switch(color.toLowerCase()){
            case "tree" : return Type.Tree;
            case "flower" : return Type.Flower;
            case "mushroom" : return Type.Mushroom;
            default : throw new TypeException("Input only type tree, flower or mushroom");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size = " + size +
                ", color = " + color +
                ", type = " + type +
                '}';
    }
}
