package Programmers.beginner;
import java.util.*;

public class P120876 {
    
    public static boolean checkIsDuplicate(int num, int[][] lines){
        int cnt = 0;

        if(num > lines[0][0] && num <= lines[0][1]) cnt++;
        if(num > lines[1][0] && num <= lines[1][1]) cnt++;
        if(num > lines[2][0] && num <= lines[2][1]) cnt++;
        if(cnt >= 2) return true;

        return false;
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < lines.length; i++){
            start = Math.min(start, lines[i][0]);
            end = Math.max(end, lines[i][1]);
        }
        
        for(int i = start; i <= end; i++){
            if(checkIsDuplicate(i, lines)){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        
        int[][] arr = {{0,1}, {2,5}, {3,9}};

    

        solution(arr);

    }
}
