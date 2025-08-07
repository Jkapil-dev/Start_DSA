package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={5,3,6,8,3,1,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array){
        boolean swapped=false;
        for(int i=0;i< array.length;i++){
            //for each step max, item will come at the last respective index
            for(int j=1;j< array.length-i;j++){
                if(array[j-1]>array[j]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
