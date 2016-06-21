/**
 * Created by Administrator on 2016/6/21.
 */
//判断101-200之间有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
public class E2 {
    public static void main(String[] args) {
        int c = 0;
        for (int i=101;i<200;i++) {
            int a;
            int b = 0;
            for (a = i;a>0;a--) {
                if (i % a == 0) {
                    b++;
                }
            }
            if (b == 2) {
                c++;
                System.out.println(i);
            }
        }
        System.out.println(c);
    }
}
