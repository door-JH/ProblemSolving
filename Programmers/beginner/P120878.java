package Programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class P120878 {
    
    public static boolean validationDivNum(int a, int b){
        if(a == 1 || a == 2 || a == 5 || b == 2 || b == 5){
            return true;
        } else {
            return false;
        }
    }

    public static int solution(int a, int b) {
        int answer = 1;

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        int maxdivnum = 1;

        //a와 b의 약수를 구한다.
        for(int q = 1; q <= a; q++){
            if(a % q == 0 && !listA.contains(q)){
                listA.add(q);
            }
        }

        for(int w = 1; w <= b; w++){
            if(b % w == 0 && !listB.contains(w)){
                listB.add(w);
            }
        }
        int index = 0;
        //공통의 최대공약수로 나눈다.
        for(int q = 0; q < listA.size(); q++){
            for(int w = 0; w < listB.size(); w++){
                if(listA.get(q) == listB.get(w)){
                    maxdivnum = listA.get(q);
                }
            }
        }

        a /= maxdivnum;
        b /= maxdivnum;
        
        //분모의 소인수를 검사한다.
        for(int q = 1; q <= b; q++){
            if(b % q == 0 && !listC.contains(q)){
                listC.add(q);
                System.out.println(q);
            }
        }

        for (int c : listC) {
            System.out.println(c);
           if(!validationDivNum(c, b)){
                answer = 2;
                break;
           }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        
        solution(7, 20);

    }
}
