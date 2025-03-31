public class P181847 {
    
    public static String solution(String n_str) {
        String answer = "";
        boolean del_zero = true;

        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0' && del_zero) {
                del_zero = false;
                answer += n_str.substring(i, n_str.length());
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
