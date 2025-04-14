package Programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P120852 {

    public static int[] solution(int n) {
        int[] answer = {};
        int div = 2;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = null;

        //약수 구하기
        while(n != 1){
            
            if(n % div == 0){
                list.add(div);
                n /= div;
            }

            if(n % div != 0){
                div++;
            }

        }
       //중복 제거
       set = new HashSet<>(list);

       //배열
       answer = new int[set.size()];
        
        for (int num : set) {
            answer[index++] = num;
        }
        //정렬
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(2);


        
    }
}
