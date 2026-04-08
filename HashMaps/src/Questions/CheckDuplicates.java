package Questions;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicates {
    static boolean checkDuplicate() {
        Map<Integer,Integer> duplicateCount = new HashMap<>();
        int[] array = {1, 2, 3, 4, 2};
       for(int element : array){
           if(duplicateCount.containsKey(element)){
               return true;
           }else{
               duplicateCount.put(element,0);
           }
       }
       return false;
    }
}
