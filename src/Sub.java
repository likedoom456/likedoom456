/**
 * Created by Administrator on 2016/6/24.
 */
public class Sub extends Super {
    int b;

    public Sub(int i, int n) {
        super(i, n);
    }
    public Sub(int h) {
        super(h);
        this.b=20;
    }

    void m2() {
        System.out.println(b);
        m1();
    }
}

class Subtest {
    public static void main(String[] args) {
        Super test = new Super(1,2);
        System.out.println(test.i);
    }
}