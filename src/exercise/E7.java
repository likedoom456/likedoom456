package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/5.
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一行字符");
        String s1=scanner.nextLine();int a1=0,b1=0,c1=0,d1=0;
        for (char c : s1.toCharArray()) {
            if (c>='A'&&c<='Z'||c>='a'&&c<='z'){
                a1++;
            } else if (c>='0'&&c<='9') {
                b1++;
            } else if (c == ' ') {
                c1++;
            } else {
                d1++;
            }

        }
        System.out.println(a1+"个英文字母"+b1+"个数字"+c1+"空格"+d1+"个其他字符");
    }
}
