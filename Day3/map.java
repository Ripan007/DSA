package Day3;

import Day1.Main;

import java.util.HashMap;

// hasmap unique  key element
// unordered
public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("india",120);
        map.put("china",150);
        map.put("Usa",40);
        System.out.println(map);
        // updated
        // if key exists than updated
        // new pair is inserted
        map.put("china",160);
        System.out.println(map);

    }
}
