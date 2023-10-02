package v8_Lists;
// 9.3
import java.util.Arrays;
import java.util.LinkedList;

//8.3
public class Linkd_List {
    public static void main(String[] args) {
// LinkdList implements List interface.
// LinkdList elements are linked together using pointer.

        var list = new LinkedList<Double>();

        // add elements
        list.add(1.1);
        list.add(1.2);
        list.add(1.2);
        list.add(1.4);
        list.add(1.5);
        list.add(1.6);

        // get elements.
        System.out.println(list.get(2));

        // update elements..
        list.set(3 , 3.3);
        System.out.println(list.get(3));

        // clear
//        list.clear();
//        System.out.println(list.remove(0));
//        System.out.println(list.remove(1.6));

        // insert elements.
        list.add(3 , 9.3);

        System.out.println(list.indexOf(1.2));
        System.out.println(list.lastIndexOf(1.2));

        // contains method if value is present than true otherwise false.
        System.out.println(list.contains(9.5));
        System.out.println(list.contains(9.3));

        // size of list.
        System.out.println(list.size());
        // to array
//        System.out.println(Arrays.toString(list.toArray()));
        // check list is empty or not.
        System.out.println(list.isEmpty());

        //sublist of list
        System.out.println(list.subList(2,6));
        System.out.println(list);

        System.out.println("------- ");
        // modified for loop to print list.

        for (var x : list){
            System.out.println(x);
        }
            System.out.println("-------");

//            peek and poll methods.
            System.out.println(list.peekFirst());
            System.out.println(list.peekLast());

        // poll remove a head and tail element in list using First,Last.
//            System.out.println(list.pollFirst());
//            System.out.println(list.pollLast());
            System.out.println(list);

    }
}
