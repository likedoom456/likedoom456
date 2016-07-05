package lesson;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/5.
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = String.valueOf(scanner.next());
        char[] a = s1.toCharArray();
        int eng=0,space=0,other=0,n=0;
        for (char c : a) {
            if (c >= 30 && c <= 39) {
                n++;
            } else if (c >= 65 && c <= 90) {
                eng++;
            } else if (c == 20) {
                space++;
            } else {
                other++;
            }
        }
            System.out.println("英文字母"+eng+"个");
            System.out.println("空格"+space+"个");
            System.out.println("数字"+n+"个");
            System.out.println("其他字符"+other+"个");

    }
}
