public class P181842 {
    
    public int solution(String str1, String str2) {
        int answer = 0;

        int loop = str2.length() - str1.length() + 1;

        for(int q = 0; q < loop; q++){

            if(str2.substring(q, q + str1.length()).equals(str1)){
                return 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
