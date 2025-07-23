public class FloorNumber {
    public static void main(String[] args){
        int[] array= {2, 4, 7, 10, 15, 18, 21, 25, 30};
        try {
            int answer = floorNumber(array, 30);
            System.out.println("floor Element :" + answer);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Element not found!");
        }

    }

    static int floorNumber(int[] array,int targetElement){
        int start=0;
        int end=array.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if (targetElement < array[mid]) {
                end=mid-1;
            }else if(targetElement>array[mid]){
                start=mid+1;
            }else if(targetElement==mid){
                return array[mid];
            }
        }
        return array[end];
    }
}
