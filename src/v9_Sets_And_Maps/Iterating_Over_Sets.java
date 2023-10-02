package v9_Sets_And_Maps;
// 9.4

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterating_Over_Sets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();

        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(500);

//        print as an iterative loop
        for (int x : set1){
            System.out.println(x);
        }

        System.out.println("------");

        var set2 = new TreeSet<String>();

        set2.add("Sun");
        set2.add("mon");
        set2.add("Tue");
        set2.add("Wed");
        set2.add("Thr");
        set2.add("Fri");
        set2.add("Sat");

        Iterator<String> itr1 = set2.iterator();

        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }


    }
}
