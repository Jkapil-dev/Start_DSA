package Practice_2;

public class FloorNo {
    public static int floorNo(int[] arr , int target){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0)return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
