package exercise;

public class E33_1 {
     int n = 10;

     public E33_1(int n) {
         this.n = n;
     }

     public void yanghui() {
         for (int l = n + 2; l >= 0; l--) {
             System.out.print(" ");
         }
         System.out.println(1);
         for (int i = 2; i < n + 1; i++) {
             for (int k = (n + 1 - i); k >= 0; k--) {
                 System.out.print(" ");
             }
             System.out.print(1 + " ");
             for (int j = 2; j < i + 1; j++) {
                 System.out.print(" " + line(j, i) + " ");
             }
             System.out.println(" " + 1);
         }
     }

     int line(int x, int y) {
         if (y == 1 || x == 1) {
             return 1;
         } else if (y == 2) {

             if (x == 2) {
                 return 2;
             } else if (x == 3) {
                 return 1;
             }
         } else if (x < y + 1) {
             int a;
             a = line(x - 1, y - 1) + line(x, y - 1);
             return a;
         }
         return 1;
     }

 }
