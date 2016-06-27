package exercise;

/**
 * Created by Administrator on 2016/6/22.
 */
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
public class E5 {
    public static void main(String[] args) {
        int a = 90;
        int b = a/10;
        char c;
        switch (b) {
            case 9:
                c = 'A';
                break;
            case 8:
            case 7:
            case 6:
                c = 'B';
                break;
            default:
                c = 'C';
        }
        System.out.println(c);
    }
}
