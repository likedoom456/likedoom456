package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Game {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,5,6,7};
        int[][] a1 = new int[20][20];
        for (int i = 1; i < a1.length - 1; i++) {
            for (int j = 1; j < a1[0].length - 1; j++) {
                a1[i][j] = a[(int) (Math.random() * a.length)];
                System.out.print(a1[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            a1 = run(a1);
            for (int j=1;j<a1.length-1;j++) {
                for (int k = 1; k < a1[0].length - 1; k++) {
                    System.out.print(a1[j][k] + "  ");
                }
                System.out.println();
            }
            if (charge(a1) == 0) {
                System.out.println("go on and "+(19-i)+" Steps left");
            } else {
                System.out.println("you win");
                System.exit(0);
            }
        }
        System.out.println("game over");

    }

    static int[][] run(int a1[][]) {
        Scanner a2 = new Scanner(System.in);
        int a3 = a2.nextInt();
        int[][] b1=new int[a1.length][a1[0].length];int[][] c1=new int[a1.length][a1[0].length];
        for (int m=0;m<a1.length;m++) {
            for (int n=0;n<a1[0].length;n++) {
                b1[m][n]=a1[m][n];
                c1[m][n]=a1[m][n];
            }
        }
        b1[1][1] = a3;c1[1][1]=100;
        int i,j;
        for ( i = 1; i < a1.length - 1; i++) {
            for ( j = 1; j < a1[0].length - 1; j++) {
                if (c1[i][j]==100&&a1[i][j]==a1[1][1]&&a1[i][j]==a1[i][j+1]) {//right
                    c1[i][j+1]=100;b1[i][j+1]=a3;
                }
                if (c1[i][j]==100&&a1[i][j]==a1[1][1]&&a1[i][j]==a1[i+1][j]) {//down
                    c1[i+1][j]=100;b1[i+1][j]=a3;
                }
                if (c1[i][j]==100&&a1[i][j]==a1[1][1]&&a1[i][j]==a1[i][j-1]&&c1[i][j-1]!=100) {//left
                    c1[i][j-1]=100;b1[i][j-1]=a3;
                    j-=2;

                }
                if (c1[i][j]==100&&a1[i][j]==a1[1][1]&&a1[i][j]==a1[i-1][j]&&c1[i-1][j]!=100) {//top
                    c1[i-1][j]=100;b1[i-1][j]=a3;
                    i-=2;
                }
            }
        }
        return b1;
    }
    static int charge(int d1[][]) {
        for (int i=1;i<d1.length-1;i++) {
            for (int j=1;j<d1[0].length-1;j++) {
                if (d1[i][j]!=d1[1][1]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
