package hero;

/**
 * Created by Administrator on 2016/6/29.
 */
public abstract class Fish implements Swimmer{
    @Override
    public abstract void swim();
}

class Shark extends Fish {
private String name;

    public Shark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("游行");
    }
}