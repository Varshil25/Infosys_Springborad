package v9_Sets_And_Maps;

import java.util.Set;
import java.util.TreeSet;

// 9.3
public class Tree_Set {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<String>();

        set1.add("Candy");
        set1.add("Bob");
        set1.add("Rocky");
        set1.add("ABC");

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<Integer>();

        set2.add(0);
        set2.add(100);
        set2.add(30);
        set2.add(10);

        System.out.println(set2);

    }
}
