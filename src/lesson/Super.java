package lesson;

/**
 * Created by Administrator on 2016/6/24.
 */
public class Super {
    int i;

    public Super(int i) {
        this.i = 10;
    }

    public Super(int i, int n) {
        System.out.println("super");

    }

    void m1() {
        System.out.println("hehe");
    }
}
