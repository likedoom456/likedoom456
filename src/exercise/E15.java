package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/22.
 */
//输入三个整数x，y，z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input x:");
        System.out.println("input y:");
        System.out.println("input z:");
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        float z = scanner.nextInt();
        if (x < y && x < z) {
            System.out.println(x);
            if (y < z) {
                System.out.println(y);
                System.out.println(z);
            } else {
                System.out.println(z);
                System.out.println(y);
            }
        } else {
            if (y < x && y < z) {
                System.out.println(y);
                if (x < z) {
                    System.out.println(x);
                    System.out.println(z);
                }
            } else {
                System.out.println(z);
                if (x < y) {
                    System.out.println(x);
                    System.out.println(y);
                } else {
                    System.out.println(y);
                    System.out.println(x);
            }
                }
            }
        }
    }


