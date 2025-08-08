package PracticeQuestions;
import java.util.Arrays;

public class CyclicSortPractice {
    public static void main(String[] args){
        int[] array={5,2,3,4,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] array){
       for(int i=0;i< array.length;i++) {
            int correctPosition = array[i] - 1;
            if(array[i] != array[correctPosition]){
                swap(array,i,correctPosition);
            }
        }
    }

    static  void swap(int[] array,int indexOne,int indexTwo){
        int temp=array[indexOne];
        array[indexOne]=array[indexTwo];
        array[indexTwo]=temp;
    }
}
