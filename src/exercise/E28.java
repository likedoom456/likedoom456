package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/5.
 */
//对10个数进行排序。
public class E28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] a1 = new int[10];
        for (int i=0;i<a1.length;i++) {
            a1[i]=scanner.nextInt();
        }

        Arrays.sort(a1);
        for (int i=0;i<a1.length;i++) {
            System.out.print(a1[i]);
        }
    }
}
