package exercise;

/**
 * Created by Administrator on 2016/6/22.
 */
//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
public class E13 {
    public static void main(String[] args) {
        for (int i=1;;i++) {
            if (ping(i + 100) == 1 && ping(i + 168) == 1) {
                System.out.print(i);
            }
                        }
    }

    static int ping(int n) {
        for (int i=1;i<n+1;i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }
}
