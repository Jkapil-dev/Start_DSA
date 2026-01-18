package Questions;

import java.util.ArrayList;

public class FindAllMissingNO {
    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int len=nums.length;
        int i=0;
        while(i< len){
            int correctIndex=nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else{
                i++;
            }

        }

        for(int j=0; j<len ; j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;

    }

}
