public class P181905 {

    public static String solution(String my_string, int s, int e) {
        String answer = "";
        
        int cnt = 0;
        
        for(int i = 0; i < my_string.length(); i++){

            if(i == s){

                for(int u = e; u >= s; u--){
                    answer += my_string.charAt(u);
                    cnt++;
                }
                i += cnt - 1;

            } else {
                answer += my_string.charAt(i);
            }  

        }
        
        return answer;
    }

    public static void main(String[] args) {
        solution("Progra21Sremm3", 6, 12);
    }
}
