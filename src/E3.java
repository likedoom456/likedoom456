/**
 * Created by Administrator on 2016/6/21.
 */
//打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
public class E3 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int d = 0;
        for (a=0;a<10;a++) {
            for (b=0;b<10;b++) {
                for (c=0;c<10;c++) {
                  d=a*a*a+b*b*b+c*c*c;
                    if ((a * 100 + b*10 + c == d) && (d>100)) {
                        System.out.println(d);
                }
            }
            }
        }
    }
}
