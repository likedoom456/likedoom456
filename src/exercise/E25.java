package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/24.
 */
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
public class E25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个五位数:");
        E25_1 input=new E25_1((int)scanner.nextFloat());
        input.judge(input.n);
    }
}

class E25_1 {
    int n;

    public E25_1(int n) {
        this.n = n;
    }
    void judge(int a) {
        int n1,n2,n3,n4,n5;
        n1=a%10;
        a=a/10;
        n2=a%10;
        a=a/10;
        n3=a%10;
        a=a/10;
        n4=a%10;
        a=a/10;
        n5=a%10;
        a=a/10;
        if (n1 == n5 && n2 == n4) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
