package practice;
//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.


public class FindElementInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        int start=0 , end = nums.length-1;
        int mid=(start+(end-start))/2;
        while(start <= end ){
            mid = (2*start+(end-start))/2;
            if(nums[mid]<target){
                end=mid-1;
            }else if(nums[mid]>target){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return mid;
    }
}
