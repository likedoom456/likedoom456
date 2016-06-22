/**
 * Created by Administrator on 2016/6/22.
 */
public class E21 {
    public static void main(String[] args) {
        int a=0;
        for (int i =1;i<21;i++) {
            a=a+chen(i);
        }
        System.out.println(a);
    }
    static int chen(int n) {
        int b=1;
        for (int i=1;i<n+1;i++) {
            b=b*i;
        }
        return b;
    }
}
