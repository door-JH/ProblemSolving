package Programmers.beginner;

public class P120904 {

    public int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);

        for(int i = 0; i < numStr.length(); i++){
            if((numStr.charAt(i) + "").equals(Integer.toString(k)) ){
                answer = i + 1;
                break;
            }
        }
        

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
