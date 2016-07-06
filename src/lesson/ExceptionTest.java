package lesson;

import com.sun.xml.internal.ws.api.model.ExceptionType;

/**
 * Created by Administrator on 2016/7/6.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        try {
            for (int i = 0; i < 20; i++) {
                a[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException b) {;
            System.out.println("异常是"+b);

        }finally {
            System.out.println("好的没事了");
        }
        System.out.println("hi");
    }

}