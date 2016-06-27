package exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/22.
 */
//输入某年某月某日，判断这一天是这一年的第几天？(闰年： 西元年份除以400余数为0的，或者除以4为余数0且除以100不为余数0的，为闰年。)
public class E14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date:");
        E14_1 date = new E14_1(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (date.month<=2||date.year%4==0) {
            System.out.println(date.counter());
        } else  {
            System.out.println(date.counter()-1);
        }
    }
}

class E14_1 {
    int year,month,day;

    public E14_1(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int counter() {
        float sum = 0;
        switch ((int)month) {
            case 1:
                sum=day;
                break;
            case 2:
                sum = 31 + day;
                break;
            case 3:
                sum = 31+29+day;
                break;
            case 4:
                sum = 31+29+31+day;
                break;
            case 5:
                sum = 31 + 29 + 31 + 30 + day;
                break;
            case 6:
                sum = 31 + 29 + 31 + 30 +31+day;
                break;
            case 7:
                sum=31 + 29 + 31 + 30 +31+30+day;
                break;
            case 8:
                sum=31 + 29 + 31 + 30 +31+30+31+day;
                break;
            case 9:
                sum=31 + 29 + 31 + 30 +31+30+31+31+day;
                break;
            case 10:
                sum = 31 + 29 + 31 + 30 +31+30+31+31+30+day;
                break;
            case 11:
                sum=31 + 29 + 31 + 30 +31+30+31+31+30+31+day;
                break;
            case 12:
                sum=31 + 29 + 31 + 30 +31+30+31+31+30+31+30+day;
                break;
        }
        return (int)sum;

    }

}