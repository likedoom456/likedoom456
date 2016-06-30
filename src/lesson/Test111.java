package lesson;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2016/6/29.
 */


public class Test111 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Justin");
        String c2 = "justin";
        some(c1);
        System.out.println(c1.name);
        other(c2);
        System.out.println(c2);
    }

    static void some(Customer c) {
        c.name = "John";
    }

    static void other(String c) {
        c="Bill";
    }
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }
}

