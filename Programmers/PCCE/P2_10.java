package Programmers.PCCE;

import java.util.*;

// 정렬한 데이터들이 담긴 이차원 정수 리스트 data와 
// 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext, 
// 뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 
// 정보를 정렬할 기준이 되는 문자열 sort_by가 주어집니다.

// data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, 1
// sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여   2 
// return 하도록 solution 함수를 완성해 주세요.         3
// 단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.


public class P2_10 {

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] schema = {"code", "date", "maximum", "remain"};
        List<Integer> index = new ArrayList<>();
        int[] pos = new int[2]; //pos1 - ext | pos2 - sort
        int cnt = 0;

        for(int i = 0; i < schema.length; i++){
            if(ext.equals(schema[i])) pos[0] = i;
            if(sort_by.equals(schema[i])) pos[1] = i;
        }

        for(int q = 0; q < data.length; q++){
            if(data[q][pos[0]] < val_ext) index.add(q);
        }

        int[][] answer = new int[index.size()][4];
        
        for (int i : index) {
            for(int j = 0; j < 4; j++){
                answer[cnt][j] = data[i][j];
            }
            cnt++;
        }

        Arrays.sort(answer, (a,b) -> Integer.compare(a[pos[1]], b[pos[1]]));
        

        return answer;
    }



    public static void main(String[] args) {
        //code data max remain
        int[][] data = {
            {1, 20300104, 100, 80},
            {2, 20300804, 847, 37},
            {3, 20300401, 10, 8}
        };

        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        solution(data, ext, val_ext, sort_by);

    }
}
