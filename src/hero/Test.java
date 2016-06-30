package hero;

import lesson.Human;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Test {
    public static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
    public static void doSwim(Submarine submarine) {
        submarine.swim();
    }
    public static void main(String[] args) {
        doSwim(new Shark("memeda"));
    }
}
