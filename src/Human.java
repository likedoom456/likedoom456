/**
 * Created by Administrator on 2016/6/24.
 */
public class Human {
    String name;
    String gender;
    int age;
    double height;
    double weight;
    boolean isMarried;
    public Human() {

    }

    public Human(double height, int age, String gender, boolean isMarried, String name, double weight) {
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.name = name;
        this.weight = weight;
    }
    public void method0 () {
        System.out.println(10);
    }
}

