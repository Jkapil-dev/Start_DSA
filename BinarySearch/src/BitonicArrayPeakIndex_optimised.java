public class BitonicArrayPeakIndex_optimised {
    public static void main(String[] args){
        int[] mountainArray = {0, 1, 4, 8, 12, 10, 6, 2};
        int answer = findPeakIndex(mountainArray);
        System.out.println("Peak element is at index: " + answer);
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Compare mid with mid+1 only, safe since start < end
            if (arr[mid] < arr[mid + 1]) {
                // we are in the increasing part
                start = mid + 1;
            } else {
                // we are in the decreasing part (or at the peak)
                end = mid;
            }
        }

        // start == end -> peak index
        return start;
    }

}
