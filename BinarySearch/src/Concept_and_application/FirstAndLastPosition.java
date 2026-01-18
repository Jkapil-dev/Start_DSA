package Concept_and_application;

public class FirstAndLastPosition {
    public static void main(String[] args){
    }
    static int[] searchRange(int[] nums, int target){
        int[] answer={-1,-1};
        answer[0]=SerchPosition(nums,target,true);
        answer[1]=SerchPosition(nums,target,false);

        return answer;


    }
    static int SerchPosition(int[] nums,int target, boolean isFirstPosition){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end =mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(isFirstPosition){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
