package Questions;

import java.util.ArrayList;

public class SearchMultipleEntries {
    public static void main(String[] args){
        int[] array={2, 4, 2, 5, 2};
        System.out.println(search(array,2));
    }
    static ArrayList<Integer> search(int[] array, int targetElement){
        ArrayList <Integer> answer=new ArrayList<>();
        for (int i=0;i< array.length;i++){
            if(array[i]==targetElement){
                answer.add(i);
            }
        }
        return answer;
    }
}
