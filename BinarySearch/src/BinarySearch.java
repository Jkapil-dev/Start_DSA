public class BinarySearch {
  public static void main(String[] args){
      int[] array= {2, 4, 7, 10, 15, 18, 21, 25, 30};
      int answer= binarySearch(array,10);
      if (answer>=0){
          System.out.println("Element is at index:"+answer);
      }else{
          System.out.println("Element not present!");
      }
  }
    static int binarySearch(int[] array,int targetElement){
        int start=0;
        int end=array.length-1;

       while(start<=end){
           int mid=start+(end-start)/2;
           if (targetElement < array[mid]) {
               end=mid-1;
           }else if(targetElement>array[mid]){
               start=mid+1;
           }else{
               return mid;
           }
       }
        return -1;
    }
}
