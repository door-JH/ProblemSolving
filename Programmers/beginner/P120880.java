package Programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120880 {

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        List<Integer> list = new ArrayList<>();


        //배열 정렬 및 초기화
        Arrays.sort(numlist);
        int[] calArr = Arrays.copyOf(numlist, numlist.length);


        //거리 계산
        for(int i = 0; i < calArr.length; i++){
            calArr[i] = Math.abs(calArr[i] - n);
        }


        for(int q = 0; q < 10000; q++){
            for(int w = numlist.length - 1; w >= 0; w--){
                if(q == calArr[w]){
                    list.add(numlist[w]);
                }
            }
        }
        
        for(int q = 0; q < answer.length; q++){
            answer[q] = list.get(q);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        solution(arr, 4);
    }
}
