package v8_Lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {
    public static void main(String[] args) {
/*
list Iterator is used when we want to enumerate elements of list
It can be used both on Arraylist and linkedList.
 */
        var list = new ArrayList<Double>();

        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        list.add(1.5);

        ListIterator itr = list.listIterator(list.size());

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
