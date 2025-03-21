public class P181864 {
    
    public static int solution(String myString, String pat) {
        int answer = 0;
        int length = myString.length() - pat.length() + 1;
        int cnt = 0;

        for(int q = 0 ; q < length; q++){
            cnt = 0;
            for(int w = 0; w < pat.length(); w++){
                if(myString.charAt(w + q) != pat.charAt(w))cnt++;
            }

            if(cnt == pat.length()) return 1;
        }
        

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
