package DSA.Arrays.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfDistances {
    public long[] distance01(int[] nums) {
        int len = nums.length;
        long[] resultArr = new long[len];

        for(int i = 0 ; i < len ; i++){
            int sum=0;
            for(int j = 0 ; j < len ; j++){
                if(i==j)continue;
                if(nums[i]==nums[j]){
                    sum+=Math.abs(i-j);
                }
                resultArr[i]=sum;
            }
        }
        return resultArr;
    }//brute force appraoach

    public long[] distance(int[] nums) {
        int len = nums.length;
        long[] resultArr = new long[len];
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> pos : map.values()) {

            int size = pos.size();
            long[] prefix = new long[size];


            prefix[0] = pos.get(0);
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + pos.get(i);
            }


            for (int k = 0; k < size; k++) {
                int currentIndex = pos.get(k);

                long leftSum = (k == 0) ? 0 : prefix[k - 1];
                long rightSum = prefix[size - 1] - prefix[k];

                long leftDist = (long) k * currentIndex - leftSum;
                long rightDist =
                        rightSum - (long) (size - k - 1) * currentIndex;

                resultArr[currentIndex] = leftDist + rightDist;
            }
        }

        return resultArr;
    }

}
