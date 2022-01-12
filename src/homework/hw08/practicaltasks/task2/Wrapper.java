package homework.hw08.practicaltasks.task2;

public class Wrapper<T extends Shape>{

    private T obj;

    public Wrapper(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "obj = " + obj +
                '}';
    }
}
