import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


/**
 * Created by Administrator on 2016/6/20.
 */
public class test {
    public static void main(String[] args) {

        float a = Float.MAX_VALUE;
        float b = Float.MIN_VALUE;
        System.out.printf("byte:%d~%d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short:%d~%d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int:%d~%d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long:%d~%d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float:");
        System.out.print(a);
        System.out.printf("~");
        System.out.println(b);
//        System.out.println(c);
//        System.out.printf("double:%d~%d%n",Double.MIN_EXPONENT,Double.MAX_EXPONENT);
        System.out.printf("character:%h~%h%n", Character.MIN_VALUE, Character.MAX_VALUE);
//        System.out.printf("boolean:%b~%b%n",Boolean.TRUE,Boolean.FALSE);
        float c, d, e;
        c = 18.1f;
        d = 11.5f;
        e = c % d;
        System.out.println((c > d) || (d++ > c));
        System.out.println(d);
        float g = (c > d) ? (c + d) : (c - d);
        System.out.println(g);
        double h = 88.2;
        double k = 2 * 3.14 * h * h;
        System.out.println(-Integer.MAX_VALUE == Integer.MIN_VALUE);
        for (int number = 0; number != 5; number = (int) (Math.random() * 10)) {
            System.out.println(number);
        }
    }


}
