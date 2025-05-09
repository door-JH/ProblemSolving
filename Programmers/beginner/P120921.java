package Programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class P120921 {
    
    public static int solution(String A, String B) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        String cmpStr = "";
        int cnt = 0;
        
        while(cnt < A.length()){

        //오른쪽으로 밀어버린 문자열
        for(int q = list.size() - 1; q >= 0; q--){
            cmpStr += list.get(q);
        }
        
        //..을 제외한 기존 문자열
        for(int w = 0; w < A.length() - list.size(); w++){
            cmpStr += A.charAt(w);
        }

        
        if(cmpStr.equals(B)){
            break;
        } else {
            list.add(A.charAt(A.length() - cnt++ - 1));
        }
        cmpStr = "";
    }

        answer = !cmpStr.equals(B) ? -1 : cnt;
        
        return answer;
    }

    public static void main(String[] args) {
        solution(	"hello", "ohell");
    }
}
