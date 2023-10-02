package v9_Sets_And_Maps;
// 9.6
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        var map = new TreeMap<Character, Integer>();

        map.put('b', 1000);
        map.put('a', 2000);
        map.put('e', 3000);
        map.put('v', 6000);

        // contains value method
        System.out.println(map.containsValue(2000));
        System.out.println(map.containsValue(5000));

        // put is also use as replace.
        map.put('a', 7000);
        map.replace('e',8000);

        /*
        // check first and last entry of map
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        // only defines a key not value.
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
         */

        //pollFirstEntry and pollLastEntry and they remove from map.
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());


        System.out.println(map);



    }
}
