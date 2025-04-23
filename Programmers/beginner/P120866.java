package Programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P120866 {
    
    public static int solution(int[][] board) {
        int answer = board.length * board.length;

        //폭탄위치저장
        List<int[]> list = new ArrayList<>();
        for(int y = 0; y < board.length; y++){
            for(int x = 0; x < board[y].length; x++){
                if(board[y][x] == 1){
                    list.add(new int[]{x, y});
                }
            }
        }

        //위험지역저장
        List<int[]> map = new ArrayList<>();
        for (int[] point : list) {
            
            map.add(new int[]{point[0], point[1]});
            
            map.add(new int[]{point[0] - 1, point[1]});
            
            map.add(new int[]{point[0] - 1, point[1] + 1});
            map.add(new int[]{point[0], point[1] + 1});
            map.add(new int[]{point[0] + 1, point[1] + 1});

            map.add(new int[]{point[0] + 1, point[1]});

            map.add(new int[]{point[0] + 1, point[1] - 1});
            map.add(new int[]{point[0], point[1] - 1});
            map.add(new int[]{point[0] - 1, point[1] - 1});

        }
        
        // 중복 제거 및 음수 필터링
        Set<String> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int[] p : map) {
            int x = p[0];
            int y = p[1];

            if (x < 0 || y < 0 || x > board.length - 1 || y > board.length - 1) continue;

            String key = Arrays.toString(p);
            if (seen.add(key)) {
                result.add(p);
            }
        }
        
        answer = answer - result.size() > 0 ? answer -= result.size() : 0;
        return answer;
    }

    public static void main(String[] args) {
        
        int[][] arr = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}
        };

        solution(arr);

    }
}
