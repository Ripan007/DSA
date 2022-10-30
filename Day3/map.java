package Day3;

import Day1.Main;
import Day2.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// hasmap unique  key element
// unordered
public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("india",120);
        map.put("china",150);
        map.put("china",150);
        map.put("Usa",40);
       // System.out.println(map);
        // updated
        // if key exists than updated
        // new pair is inserted
//        map.put("china",160);
//        System.out.println(map);
       // System.out.println(map.get("china"));
//        System.out.println(map.get(150));
      //  System.out.println(map.containsKey("india"));
       // System.out.println(map.containsKey("brazil"));
//        System.out.println(map);

        // Iterator
//        for(Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//        System.out.println(map.keySet());
//        Set<String> keys = map.keySet();
//        for(String key:keys){
//            System.out.println(key + " "+map.get(key));
//        }

        map.remove("china");
        System.out.println(map);



    }
}
