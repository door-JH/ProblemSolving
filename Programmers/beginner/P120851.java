package Programmers.beginner;

public class P120851 {
    public static int solution(String my_string) {
        int answer = 0;
        String str = "";
        int cnt = 0;

        for(int q = 0; q < my_string.length(); q++){
            if((int) my_string.charAt(q) > 47 && (int) my_string.charAt(q) < 58){
                cnt++;
                str += my_string.charAt(q);
            }
        }
        
        for(int w = 0; w < cnt; w++){
            answer +=  (int)str.charAt(w) - '0';
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
