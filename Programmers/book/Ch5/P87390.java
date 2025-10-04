package Programmers.book.Ch5;

public class P87390 {
    class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);  // 구간 크기
        int[] answer = new int[size];
        
        for (long q = left; q <= right; q++) {
            int row = (int)(q / n);
            int col = (int)(q % n);
            answer[(int)(q - left)] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}
}
