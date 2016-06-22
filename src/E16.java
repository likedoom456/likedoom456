/**
 * Created by Administrator on 2016/6/22.
 */
public class E16 {
    public static void main(String[] args) {
        for (int x=1;x<10;x++) {
            System.out.println();
            for (int y = 1;y<10;y++) {
                if (y>x) {
                    continue;
                }
                System.out.printf(x+"*"+y+"="+x*y+"\t");
            }
        }
    }
}
