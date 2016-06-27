package exercise;

/**
 * Created by Administrator on 2016/6/22.
 */
public class E1 {
    public static void main(String[] args) {
        int a = 7, b = 3, c = 0, d = 0;
        int i;
        if (a > 3) {

            for (; a > 3; a -= 3) {

                for (i = 1; i <= a - 3; i++) {
                    c++;
                }
                d++;
            }
            System.out.println((c + b*d)*2 );
        } else {
            System.out.println(1*2);
        }
    }
}
