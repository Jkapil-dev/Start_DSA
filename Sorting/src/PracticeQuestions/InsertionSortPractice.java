package PracticeQuestions;

import java.util.Arrays;

public class InsertionSortPractice {
    public static void main(String[] args){
        int[] array={7,2,6,8,1,0,9,34};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static  void swap(int[] array,int indexOne,int indexTwo){
        int temp=array[indexOne];
        array[indexOne]=array[indexTwo];
        array[indexTwo]=temp;
    }
}
