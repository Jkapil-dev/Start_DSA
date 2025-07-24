public class MountainArrayPeakIndex {
    public static void main(String[] args){
        int[] mountainArray={0, 1, 4, 8, 12, 10, 6, 2};
        int answer=binarySearch(mountainArray);
        System.out.println("Peak element is at index:"+answer);
    }
    static int binarySearch(int[] mountainArray){
        int start=0;
        int end=mountainArray.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (mountainArray[mid] < mountainArray[mid+1] ) {
                start=mid+1;

            }else if( mountainArray[mid]<mountainArray[mid-1]){
                end=mid-1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
