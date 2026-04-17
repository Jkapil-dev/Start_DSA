package DSA.Arrays.Questions;

import java.util.Arrays;
import java.util.HashMap;


public class FrequencyOfElements {

    public static void main(String[] args) {
        int[] arr = {1,4,2,7,1,2,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : arr){
           if(map.containsKey(element)){
               map.put(element,map.getOrDefault(element,0)+1);
           }else{
               map.put(element,1);
           }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=map.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
