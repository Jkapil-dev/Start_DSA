package concept;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<Integer,Integer> marks = new HashMap<>();
        marks.put(1,10);
        marks.put(2,20);
        System.out.println(marks.get(1));

        //check if key exists
        if(marks.containsKey(2)){
            System.out.println("map has key 2");
        }
        System.out.println("Size of map: "+marks.size());

        System.out.println("Keys in map are: ");
        for(Integer key : marks.keySet()){// loop to
            System.out.println(key + ":" + marks.get(key));
        }

        //different way to iterate
        System.out.println("Another way to iterate");
        for (Map.Entry<Integer,Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }

}