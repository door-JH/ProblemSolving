package Programmers.book.Ch6;

import java.util.Stack;

public class P12909 {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>(); 
        char array[] = s.toCharArray();
        
        for(char c : array){
            
            if(c == '('){
                stack.push(c);
            } else {
	            if(stack.isEmpty()) return false; // 가장먼저 )가 나온다면 false;
	            stack.pop();
            }
            
        }
       
        

        return stack.isEmpty();
    }
}
