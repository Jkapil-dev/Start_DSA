package creating;
import java.util.Stack;
public class InbuiltStackFunction {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,8};
        int answer=kthMissing(arr,11);
        System.out.println(answer);
    }
    public static int kthMissing(int[] arr, int k) {
        Stack<Integer> s=new Stack<>();
        int i=1,j=0;
        while(s.size()!=k ){

                if(i==arr[j]){
                    i++;
                    if(j+1 < arr.length) j++;
                    continue;
                }else{
                    s.push(i);
                }

            i++;
        }
        int ans=s.peek();
        return ans;
    }

}
