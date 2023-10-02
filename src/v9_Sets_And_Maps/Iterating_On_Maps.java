package v9_Sets_And_Maps;
// 9.7
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Iterating_On_Maps {
    public static void main(String[] args) {

        var map = new TreeMap<Integer , Double>();

        map.put(10 , Math.sqrt(100));
        map.put(20 , Math.sqrt(200));
        map.put(30 , Math.sqrt(300));
        map.put(40 , Math.sqrt(400));

        for (Map.Entry<Integer , Double> e : map.entrySet()){
            System.out.println(e);
        }
        System.out.println(map);

        System.out.println("------  ------");

        Iterator<Map.Entry<Integer, Double>> itr1 = map.entrySet().iterator();

        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
