/**
 * Created by Administrator on 2016/6/22.
 */
//企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
public class E12 {
    public static void main(String[] args) {
        float a=1000, b;
        if (a > 100) {
            b= (float) ((a-100)*0.01+40*0.015+20*0.03+20*0.05+10*0.075+1);
        } else {
            if (a > 60) {
                b = (float) ((a - 60)* 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 1);
            } else {
                if (a > 40) {
                    b = (float) ((a - 40) * 0.03 + 20 * 0.05 + 10 * 0.075 + 1);
                } else {
                    if (a > 20) {
                        b = (float) ((a - 20) * 0.05 + 1.75);
                    } else {
                        if (a > 10) {
                            b = (float) ((a - 10) * 0.75 + 1);
                        } else {
                            b = (float) (0.1 * a);
                        }
                    }
                }
            }
        }
        System.out.println(b);
    }
}

