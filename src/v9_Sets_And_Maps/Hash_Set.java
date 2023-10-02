package v9_Sets_And_Maps;
// 9.1
import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {

        var set1 = new HashSet<Integer>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(10);
        set1.add(20);

        /*
        set1.remove(20);
        set1.clear();
        System.out.println(set1.contains(10));
        System.out.println(set1.size());
        System.out.println(set1);
        */

        var set2 = new HashSet<Integer>();
        set2.add(10);
        set2.add(60);
        set2.add(30);
        set2.add(70);
        set2.add(20);

        /* Union and Intersection of sets
        set1.addAll(set2);
        set1.retainAll(set2);
        System.out.println(set1);
        */

        var list = new ArrayList<Integer>(set2);
//        list.addAll(set1);
        System.out.println(list);



    }
}
