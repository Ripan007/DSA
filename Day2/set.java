package Day2;
// HashSet wont allow duplicate
// sel elements are unique
// time complexity
// insert/add => 0(1)
// search/contains => 0(1)
// delete/remove => 0(1)
// has set  unordered

import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args) {
        // creating a hashSet
        HashSet<Integer> set  = new HashSet<>();
        // adding elements
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // search / contains
        if(set.contains(1)){
            System.out.println("print present");
        }
        if(!set.contains(8)){
            System.out.println("print not present");
        }
        // size
        System.out.println(set.size());
        // remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("print 1 is remove");
        }
        // print whole
        System.out.println(set);
        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
