package Programmers.book.Ch6;

import java.util.ArrayDeque;

public class P42584 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        stack.push(0);
        
        for(int i = 1; i < n; i++){
            
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int j = stack.pop();
                answer[j] = i - j;
            }
            
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }
        
        return answer;
    }
}
