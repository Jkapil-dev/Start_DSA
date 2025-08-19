public class BinarySearch {
    public static void main(String[] args){
        int[] array={1,2,3,55,66,89};
        System.out.print(search(array,55,0,array.length-1));
    }
    static int search(int[] array,int targetElement, int s, int e){
        if( s > e ){
            return -1;
        }
        int m=s+(e-s)/2;
        if(array[m]==targetElement){
            return m;
        }
        if(targetElement < array[m]){
            return search(array,targetElement,s,m-1);
        }
        return search(array,targetElement,m+1,e);
    }
}
