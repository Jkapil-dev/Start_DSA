package Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArrays {
    ArrayList<Integer> intersectionOfArray(){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        int[] A = {1,2,2,1};
        int[] B ={2,2};
        for(int element : A){
            set.add(element);
        }
        for (int i = 0; i < B.length; i++) {
            if(set.contains(B[i])){
                result.add(B[i]);
            }
        }
        return result;

    }
}
