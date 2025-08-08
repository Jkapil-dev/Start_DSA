package PracticeQuestions;

import java.util.Arrays;

public class selectionsortPractice {
    public static void main(String[] args){
        int[] array={7,2,6,8,1,0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int [] array){
        for(int i=0;i< array.length;i++){
            int end= array.length-1-i;
            int max=returnMax(array,end);//brings max value in given array
            int temp=array[max];
            array[max]=array[end];
            array[end]=temp;
        }
    }

    static int returnMax(int[] array,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(array[i]>array[max]){
              int temp=array[i];
                array[i]=array[max];
                array[max]=temp;
            }
        }
        return max;
    }
}
