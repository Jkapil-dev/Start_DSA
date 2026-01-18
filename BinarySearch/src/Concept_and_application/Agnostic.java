package Concept_and_application;

public class Agnostic {
    public static void main(String[] args) {
        int[] ascendingArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] descendingArray = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        int answer1=AgnosticBinarySearch(ascendingArray,3,0,ascendingArray.length-1);
        System.out.println("Ascending:"+answer1);
        int answer2=AgnosticBinarySearch(descendingArray,6,0,ascendingArray.length-1);
        System.out.println("Descending:"+answer2);
    }
    static int AgnosticBinarySearch(int[] array,int targetElement,int start, int end){
        boolean isAscending=array[end]<array[start];


        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==targetElement){
                return mid;
            }
            if(isAscending){//ascending
                if (targetElement < array[mid]) {
                    end=mid-1;
                }else if(targetElement>array[mid]){
                    start=mid+1;
                }


            }else{
                //decending
                if (targetElement < array[mid]) {
                    start=mid+1;

                }else if(targetElement>array[mid]){

                    end=mid-1;
                }
            }

        }
        return -1;//not found

    }
}
