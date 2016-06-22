/**
 * Created by Administrator on 2016/6/22.
 */
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
public class E20 {
    public static void main(String[] args) {
        float b = 0;
        for (int i=1;i<21;i++) {

            b=b+(fen(i+2)/fen(i+1));
        }
        System.out.println(b);
    }
    static float fen(float n) {
        if (n == 1||n==2) {
            return 1;
        } else {
            n=fen(n-1)+fen(n-2);
            return n;
        }
    }
}
