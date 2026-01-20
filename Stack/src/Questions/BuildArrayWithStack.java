package Questions;

import java.util.Stack;
import java.util.ArrayList;

public class BuildArrayWithStack {
    public ArrayList<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int j=0;

        for(int i=1 ; i<=n && j<target.length ;i++){
            ans.add("Push");
            if(i==target[j]){

                j++;
            }else{
                ans.add("Pop");
            }
        }

        return ans;
    }
}
