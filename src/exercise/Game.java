package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Game {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[][] a1 = new int[4][4];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a1[i][j] = a[(int) (Math.random() * a.length)];
                System.out.print(a1[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            a1 = run(a1);
            for (int[] anA1 : a1) {
                for (int k = 0; k < a1[0].length; k++) {
                    System.out.print(anA1[k] + "  ");
                }
                System.out.println();
            }
        }
        System.out.println("game over");

    }

    static int[][] run(int a1[][]) {
        Scanner a2 = new Scanner(System.in);
        int a3 = a2.nextInt();
        int[][] b1;
        b1 = a1;
        b1[0][0] = a3;
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a1[0].length - 1; j++) {
                change(b1, i, j, a3);
            }
        }
        return b1;
    }

    static int[][] change(int c1[][], int x, int y, int a3) {
        if (c1[x][y] == c1[x + 1][y]) {
            c1[x + 1][y] = a3;
        }
        if (c1[x][y] == c1[x][y + 1]) {
            c1[x][y + 1] = a3;
        }
        return c1;
    }

}
