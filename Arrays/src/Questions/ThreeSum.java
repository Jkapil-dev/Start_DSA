package DSA.Arrays.Questions;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> insideList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int i =0 , j=1 , k=2;
        int prevI=Integer.MIN_VALUE , prevJ=Integer.MIN_VALUE , prevK=Integer.MIN_VALUE;
        while (k<nums.length){
            if(nums[i]+nums[j]+nums[k]==0 && i!=prevI && i!=prevK && j!=prevK){
                result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                prevI = i ;
                prevJ = j ;
                prevK = k ;
                k++;
            }
            if(nums[i]+nums[j]+nums[k]==0 && i!=prevI && i!=prevK && j!=prevK){
                result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                prevI = i ;
                prevJ = j ;
                prevK = k ;
                j++;
            }
            if(nums[i]+nums[j]+nums[k]==0 && i!=prevI && i!=prevK && j!=prevK){
                result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                prevI = i ;
                prevJ = j ;
                prevK = k ;
                i++;
            }
        }
        return result;
    }
}
