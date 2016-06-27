package lesson;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Level2 {
    public static void main(String[] args) {
        int score = 88;
        int a = score / 10;
        char level;
        switch (a) {
            case 9:
                level = 'A';
                break;
            case 8:
                level = 'B';
                break;
            case 7:
                level = 'C';
            default:
                level = 'D';
        }
        System.out.println(level);
        for (int b = 0;b<10;b++) {
            System.out.println(b);
        }
    }

}
