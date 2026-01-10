package practice;

public class binarySearchpractice {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6};
        int answer=binarySearch(array,6);
        System.out.println(answer);

    }
    static int binarySearch(int[] array, int targetElement){
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]>targetElement){
                start=mid+1;
            }else if(array[mid]<targetElement){
                end=mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
