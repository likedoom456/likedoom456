package lesson;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/27.
 */
public class Calculator {
    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    double sub(double x, double y) {
        return x - y;
    }

    int mul(int x, int y) {
        return x * y;
    }

    double mul(double x, double y) {
        return x * y;
    }

    int div(int x, int y) {
        return x / y;
    }

    double div(double x, double y) {
        return x / y;
    }
}

class Test {
    public static void main(String[] args) {
        Calculator test = new Calculator();
        double x, y;
        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input:");
        x = scanner.nextDouble();
        a = scanner.next();
        y = scanner.nextDouble();
//        lesson.test.add(3,4);
//        lesson.test.add(3.0,4.0);
//        lesson.test.sub(3,4);
//        lesson.test.sub(3.0,4.0);
//        lesson.test.mul(3,4);
//        lesson.test.mul(3.0,4.0);
//        lesson.test.div(3,4);
//        lesson.test.div(3.0,4.0);
        if (a.compareTo("+")==0) {
            System.out.println(test.add(x, y));
        } else if (a.compareTo("-") == 0) {
            System.out.println(test.sub(x, y));
        } else if (a.compareTo("*")==0) {
            System.out.println(test.mul(x, y));
        } else if(a.compareTo("/")==0){
            System.out.println(test.div(x, y));
        }
    }
}
