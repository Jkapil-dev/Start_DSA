public class LinearSearch {
    public static void main(String[] args){
        int[] numbers={2,3,6,8,2};
        int answer=linearSearch(numbers,3);
        System.out.println(answer);
    }
    static int linearSearch(int[] arr, int targetElement){
        if(arr.length==0){
            return -1;
        }
        // check for each element in array=targerElement
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]==targetElement){
                return targetElement;
            }

        }
        return -1;
    }
}
