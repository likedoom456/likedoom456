package lesson;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Test000 {
    public static void main(String[] args) throws IOException {
       String a1="abc",b1="def",c1="ABC",d1="this is %d%d",e1="abcacb"; int f1=3;
        System.out.println("1：a1的第三个字母："+a1.charAt(2));
        System.out.println("2：a1和b1接起来："+a1.concat(b1));
        System.out.println("3：a1里面是否有g："+a1.contains("g"));
        System.out.println("4：a1是否以c结尾："+a1.endsWith("c"));
        System.out.println("5：a1和c1是不是一样："+a1.equals(c1));
        System.out.println("6：a1和c1是不是一样（不区分大小写）："+a1.equalsIgnoreCase(c1));
        System.out.println("7：整数方式输出d1："+String.format(d1,10,10));
        System.out.println("8：c1转成byte数组："+Arrays.toString(c1.getBytes()));
        System.out.println("9：e1里第一个a的下标："+e1.indexOf("a"));
        System.out.println("10：a1是否是空"+a1.isEmpty());
        System.out.println("11：e1里最后一个c的下标："+e1.lastIndexOf("c"));
        System.out.println("12：a1字符串长度："+a1.length());
        System.out.println("13：跟字符串abc比较："+a1.matches("abc"));
        System.out.println("14：a1里的b变成f："+a1.replace('b','f'));
        System.out.println("15：bc变成mn："+a1.replaceAll("bc","mn"));
        System.out.println("16：e1里第一个b变成g："+e1.replaceFirst("b","g"));
        System.out.println("17：e1按c的位置分割成字符串："+Arrays.toString(e1.split("c")));
        System.out.println("18：a1中b的索引是不是1："+a1.startsWith("b",1));
        System.out.println("19：e1索引3位置开始的字符串："+e1.substring(3));
        System.out.println("20：a1字符变成字符数组："+ Arrays.toString(a1.toCharArray()) +" ");
        System.out.println("21：变成小写："+c1.toLowerCase());
        System.out.println("22：变成大写:"+a1.toUpperCase());
        System.out.println("23：f1变成整型:"+String.valueOf(f1));
    }
}
