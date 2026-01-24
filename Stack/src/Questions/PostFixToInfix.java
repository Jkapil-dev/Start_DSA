package Questions;

import java.util.Stack;

public class PostFixToInfix {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String value=tokens[i];
            if(!value.equals("+") && !value.equals("-") && !value.equals("*") && !value.equals("/")){
                st.push(Integer.parseInt(value));
            }else{
                int numOne = (st.pop()) , numTwo = (st.pop());
                switch(value){
                    case "+" :st.push(numTwo+numOne); break;
                    case "-" :st.push(numTwo-numOne); break;
                    case "*" :st.push(numTwo*numOne); break;
                    case "/" :st.push(numTwo/numOne); break;
                }
            }
        }
        return st.pop();
    }
}
