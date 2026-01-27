package Questions;

import java.util.Arrays;
import java.util.Stack;

public class UnixPathToCanonicalPath {
    public static void main(String[] args) {

    String path ="/home//foo/"
            ;
        String[] pathArray = path.split("/");
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(pathArray));
        Stack<String> st = new Stack<>();

        for(int i = 1 ; i< pathArray.length ; i++){

           if(pathArray[i].equals("..") && !st.isEmpty()){
               st.pop();
               continue;
           } else if (pathArray[i].equals("") || pathArray[i].equals(".")) {
               continue;
           }
            st.push(pathArray[i]);
        }
        while(!st.isEmpty()){
            String prefix ="/"+st.pop();
            sb.insert(0,prefix);
        }
        System.out.println(sb.toString());
    }
}
