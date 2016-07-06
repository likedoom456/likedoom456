package lesson;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/7/6.
 */
public class ArraysList<E> {
    private Object[] list;
    private int next;

    public ArraysList(int capacoity) {
        list = new Object[capacoity];
    }

    public ArraysList() {
        this(16);
    }
    public void add(E o) {
        if (next==list.length) {
            list= Arrays.copyOf(list,list.length+1);
        }
        list[next++]=0;
    }
    public E get(int index) {
        return (E) list[index];
    }
    public int size() {
        return next;
    }
}
