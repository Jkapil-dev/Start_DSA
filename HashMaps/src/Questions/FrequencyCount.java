package Questions;

import java.util.HashMap;

public class FrequencyCount {
    static void main() {
        int[] array = {1, 2, 2, 3, 1, 1};
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i],frequencyMap.getOrDefault(array[i],0)+1);
            }else{
                frequencyMap.put(array[i],1);
            }
        }
        System.out.println(frequencyMap);
    }
}
