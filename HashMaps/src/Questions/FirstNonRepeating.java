package Questions;

import java.util.HashMap;
import java.util.Map;


public class FirstNonRepeating {
    int firstNonRepeating(){
        HashMap< Integer , Integer > map = new HashMap<>();
        int[] arr={4, 5, 1, 2, 1, 2};
       for(int element : arr){
            if(map.containsKey(element)){
                map.put(element,map.getOrDefault(element,0)+1);
            }else{
                map.put(element,1);
            }
       }
       for(int element : arr){
           if(map.get(element)==1){
               return element;
           }
       }
       return -1;
    }
}
