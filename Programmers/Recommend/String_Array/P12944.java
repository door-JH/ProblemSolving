package Programmers.Recommend.String_Array;

public class P12944 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){
            answer += i;
        }
        
        return answer / arr.length;
    }
}
