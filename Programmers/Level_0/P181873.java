public class P181873 {

    public static String solution(String my_string, String alp) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == alp.charAt(0)){
                answer += (my_string.charAt(i) + "").toUpperCase();
            } else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
