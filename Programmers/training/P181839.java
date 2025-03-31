
public class P181839 {
    
    public static int solution(int a, int b) {
        int answer = 0;

        boolean is_a_even = false;
        boolean is_b_even = false;
        
        if(a % 2 == 0) is_a_even = true;
        if(b % 2 == 0) is_b_even = true;

        if(!is_a_even && !is_b_even){
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if(is_a_even ^ is_b_even){
            answer = 2 * (a + b);
        } else if(is_a_even && is_b_even){
            answer = Math.abs(a - b);
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
