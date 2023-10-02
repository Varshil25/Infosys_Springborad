package v9_Sets_And_Maps;
// 9.5
import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        // add elements
        map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "Mar");
        map.put(4, "Apr");
        map.put(5, "May");

        // how to find element.
        System.out.println(map.get(2));
        System.out.println(map.get(25));

        // if element is present in map then gives true otherwise false.
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(23));

        // update value.
        map.put(4, "July");

        /*
        Remove elements using their Value and Key
        map.remove(2);
        map.remove(3, "Mar");

        map.clear();

         */

//        convert map into set
        var set1 = map.keySet();
        var set2 = map.values();
        var set3 = map.entrySet();

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        System.out.println(map);



    }
}
