package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/22.
 */
public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input N:");
        float n = scanner.nextFloat();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += sum(i);
        }
        System.out.println(100 / Math.pow(2, n));
        System.out.println(sum);
    }

    static float sum(float n) {
        if (n == 1) {
            return 100;
        } else {
            n = 2 * (float) (100 / (Math.pow(2, n - 1)));
            return n;
        }
    }
}