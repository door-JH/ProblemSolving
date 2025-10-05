package Programmers.Recommend.String_Array;

public class P86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i : numbers){
            answer -= i;
        }
        
        return answer;
    }
}
