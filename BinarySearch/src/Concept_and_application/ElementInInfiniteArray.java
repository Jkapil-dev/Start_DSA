package Concept_and_application;

public class ElementInInfiniteArray {

    public static void main(String[] args) {
        int [] array= {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };
        int targetElement=50;
        System.out.println("index of targetElement: "+answer(array,targetElement));
    }
    static int answer(int[] array,int targetElement){
        //first find the range
        //starting with the box of size 2
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(targetElement>array[end]){
            int temp=end+1;//to store start value
            end=end+(end-start+1)*2;//we are doubling the size of the part of array exponentially to find the required element,
            // +1 because array indexing is from 0 .eg to find array len you do .length-1 so here +1
            start=temp;
        }
        return SearchElement(start,end,array,targetElement);
    }
   public static int SearchElement(int start,int end,int[] array ,int targetElement){
     int count=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (targetElement < array[mid]) {
                count++;
                end=mid-1;
            }else if(targetElement>array[mid]){
                count++;
                start=mid+1;
            }else{

                System.out.println("this is count: "+count);
                return mid;

            }
        }
        return -1;
    }
}
