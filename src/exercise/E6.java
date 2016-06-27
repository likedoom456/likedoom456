package exercise;

/**
 * Created by Administrator on 2016/6/22.
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6 {
    public static void main(String[] args) {
        int m, n, a = 0, b = 0;
        m = 1000;
        n = 495;
        if (m >= n) {
            a = m;
            b = n;
        } else {
            a = n;
            b = m;
        }
        for (int i = b; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }
        for (int c = a; ; c++) {
            if (c % m == 0 && c % n == 0) {
                System.out.println(c);
                break;
            }
        }

    }

}
