package Programmers.book.Ch5;

import java.util.HashSet;
import java.util.Set;

public class P49994 {
    // 이동위치를 전역변수로
    int row_pos = 0;
    int col_pos = 0;
    
    // 이동로직
    public void move(char dir){
        switch(dir){
            case 'U':
                if(col_pos < 5) {
                    col_pos++;
                }
                break;
            case 'L':
                if(row_pos > -5){
                    row_pos--;
                }
                break;
            case 'R':
                if(row_pos < 5){
                    row_pos++;
                }
                break;
            case 'D':
                if(col_pos > -5){
                    col_pos--;
                }
                break;
        }

    }
    
    public int solution(String dirs) {
        int answer = 0;
        Set<String> pos = new HashSet<>();
        
        for(int q = 0; q < dirs.length(); q++){
            int prevRow = row_pos;
            int prevCol = col_pos;
            move(dirs.charAt(q));
            //위치 저장
            if (prevRow != row_pos || prevCol != col_pos) {
                String path = prevRow + "," + prevCol + "->" + row_pos + "," + col_pos;
                String revPath = row_pos + "," + col_pos + "->" + prevRow + "," + prevCol;
                pos.add(path);
                pos.add(revPath);
            }
        }
        //중복 간선 제거 (정방향 + 역방향)
        answer = pos.size() / 2;

        return answer;
    }
}
