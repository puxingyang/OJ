package OJ;

import java.util.Stack;

public class BackplaceCompare {

    public boolean backspaceCompare(String S, String T) {
        return Compare(S).equals(Compare(T));
    }

    public String Compare(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                stack.push(ch);
            }else if (!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
