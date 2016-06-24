import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2016/6/22.
 */
public class E19 {
    public static void main(String[] args) {
        E_19 test = new E_19();
        test.blankAndA(10);
    }
}

class E_19 {
    void blankAndA(int n) {
        for (int i = -n; i < n + 1; i++) {
            int a = Math.abs(i);
            for (int b = 1; b < a + 1; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c < 2 * (n + 1 - a); c++) {
                if (c == 2 * (n + 1 - a) - 1) {
                    System.out.println("*");
                    break;
                }
                System.out.print("*");
            }
        }
    }
}