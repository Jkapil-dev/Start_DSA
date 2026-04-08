package DSA.Arrays.Questions;

public class LargestInArray {
    public static void main(String[] args) {
        int max=0;
        int[] arr = {2,3,5,1,7,6};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
