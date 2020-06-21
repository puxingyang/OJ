package LeetCode;

import java.util.Stack;

//根据逆波兰表示法，求表达式的值。
//有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，
//也可以是另一个逆波兰表达式。
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(s.equals("/")){
                int num = stack.pop();
                stack.push(stack.pop() / num);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
