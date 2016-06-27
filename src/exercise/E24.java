package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/24.
 */
//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class E24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个五位以内的数:");
        E24_1 random = new E24_1((int)scanner.nextFloat());
        int a = random.judge(random.n);
        random.digit(a);
        random.print(a, random.n);
    }
}

class E24_1 {
    int n;

    public E24_1(int n) {
        this.n = n;
    }

    int judge(int a) {
        if (a < 10) {
            return 1;
        } else if (a < 100) {
            return 2;
        } else if (a < 1000) {
            return 3;
        } else if (a < 10000) {
            return 4;
        } else {
            return 5;
        }

    }

    void digit(int b) {
        switch (b) {
            case 1:
                System.out.println("1位数");
                break;
            case 2:
                System.out.println("2位数");
                break;
            case 3:
                System.out.println("3位数");
                break;
            case 4:
                System.out.println("4位数");
                break;
            default:
                System.out.println("5位数");
        }
    }

    void print(int d, int e) {

        for (int i = 1; i < d ; i++) {
            System.out.print((int)( e %10)+",");
            e= (e/10);
            if (e<10) {
                System.out.println(e);
                break;
            }
        }
    }
}
