package Programmers.book.Ch6;

import java.util.Stack;

public class P120853 {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(String str : arr){
                        
            if(str.equals("Z")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
            
        }
        
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        
        return answer;
    }
}
