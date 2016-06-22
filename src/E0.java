/**
 * Created by Administrator on 2016/6/22.
 */
public class E0 {
    public static void main(String[] args) {
        int n = 5;
        int a=compute(n);
        System.out.println(a);
    }

    static int compute(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else { int a;
            a = compute(n - 1) + compute(n - 2);
            return a;
        }
    }
}
