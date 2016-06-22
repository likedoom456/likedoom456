/**
 * Created by Administrator on 2016/6/21.
 */
//将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        int a = 1000;
        System.out.printf(a + "=");
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.printf(i + "*");
                a = a / i;
                i = 1;
            }
        }
        System.out.println(a);
    }
}
