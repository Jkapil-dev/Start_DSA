package cyclicSort;

public class AllDuplicates {
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
