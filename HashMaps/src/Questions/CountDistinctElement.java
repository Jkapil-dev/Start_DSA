package Questions;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElement {
    int distinctElement(){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1, 2, 2, 3, 4, 4};
        for(int element : arr){
                map.put(element,1);
        }
        return  map.size();
    }
    int distinctElementUsingHashSet(){
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 2, 3, 4, 4};
        for(int element : arr){
            set.add(element);
        }
        return set.size();
    }
}
