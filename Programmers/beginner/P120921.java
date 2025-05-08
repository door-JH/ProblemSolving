package Programmers.beginner;

public class P120921 {
    
    public static int solution(String A, String B) {
        int answer = 0;
        String temp = "";
        int cnt = 0;

        for(int q = A.length() - 1; q >= 0; q--){

            System.out.println((temp + A.substring(0, q+1)) + " " + B);

            if((temp + A.substring(0, q+1)).equals(B)){
                break;
            } else {
                temp += A.charAt(q);
                cnt++;
            }

            
        }

        answer = cnt == A.length() ? -1 : cnt;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(	"abc", "bca");
    }
}
