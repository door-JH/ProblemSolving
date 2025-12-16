package Programmers.book.Ch6;

import java.util.ArrayDeque;

public class P64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayDeque<Integer>[] lanes = new ArrayDeque[board.length];
        
        for(int q = 0; q < lanes.length; q++){
            lanes[q] = new ArrayDeque<>();
        }
        
        for(int q = board.length - 1; q >= 0; q--){
            for(int w = 0; w < board[q].length; w++){
                if(board[q][w] > 0){
                    lanes[w].push(board[q][w]);
                }
            }
        }
        
        ArrayDeque<Integer> bucket = new ArrayDeque<>();
        
        for(int move : moves){
            if(!lanes[move - 1].isEmpty()){
                int doll = lanes[move - 1].pop();
                if(!bucket.isEmpty() && bucket.peek() == doll){
                    bucket.pop();
                    answer += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }
        
        return answer;
    }
}
