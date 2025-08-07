package selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] array={4,3,2,0,5,8,0};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

     static int returnMax(int[] array , int startPosition,int endPosition ){
        int max=startPosition;
         for (int i = 1; i <=endPosition ; i++) {
             if(array[max]<array[i])max=i;
         }
         return max;
     }
     static  void swap(int[] array,int elementOne,int elementTwo){
         int temp=array[elementOne];
         array[elementOne]=array[elementTwo];
         array[elementTwo]=temp;
     }

     static void selectionSort(int[] array){
         for (int i = 0; i < array.length ; i++) {
             int endPosition= array.length-i-1;
            int greatestElementIndex= returnMax(array,0,endPosition);
            swap(array,greatestElementIndex,endPosition);
         }

     }
}
