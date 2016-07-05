package lesson;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/5.
 */
//求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt(),c=2;
        System.out.print("s=2");
        if (a == 1) {
            System.exit(0);
        }
        for (int i=1;i<a+1;i++) {
            if (i == 1) {
                c = 2;
            } else {
                c=c+fx(i);
                System.out.print("+"+fx(i));
            }

        }
        System.out.println("="+c);
    }
    static int fx(int b) {
        if (b==1) {
            return 2;
        }
        return (int) (2*Math.pow(10,b-1)+fx(b-1));
    }
}
