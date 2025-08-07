package cyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] array ={3,2,5,4,1};
        sortCyclic(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortCyclic(int[] array){
        int i=0;
        while(i< array.length){
            int correctIndex=array[i]-1;
            if(array[i] != array[correctIndex]){
                int temp=array[i];
                array[i]=array[correctIndex];
                array[correctIndex]=temp;
            }else{
                i++;
            }

        }
    }
}
