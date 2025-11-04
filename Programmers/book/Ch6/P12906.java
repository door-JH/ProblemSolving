package Programmers.book.Ch6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P12906 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr){     
            if(stack.isEmpty()){
                stack.push(i);
            }
            else if(stack.peek() != i){
                list.add(stack.pop());
                stack.push(i);
            }
        }
        
        if(!stack.isEmpty()){
            list.add(stack.pop());
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
