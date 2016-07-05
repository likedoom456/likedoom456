package collections;

import com.sun.org.apache.bcel.internal.classfile.DescendingVisitor;

import java.util.*;

/**
 * Created by Administrator on 2016/7/5.
 */
public class Test {
    public static void main(String[] args) {
       Map map= new TreeMap<>();

        map.put(0,1);
        map.put(1,2);
        map.put(2,2);
        System.out.println(map.get(3));
        System.out.println(map.size());

    }
}
