package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/24.
 */
//求100之内的素数。
public class E27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("需要多少以内的素数？");
        E27_1 sushu=new E27_1((int)scanner.nextFloat());
        System.out.println("一共有"+sushu.prime(sushu.n)+"个素数");
    }

}

class E27_1 {
    int n;

    public E27_1(int n) {
        this.n = n;
    }

    int prime(int m) {
        int contianer=0;
        for (int i = 2; i < m+1; i++) {
            boolean b=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                contianer++;
                System.out.println(i);
            }
        }
        return contianer;
    }
}
