public class P181871 {

    public int solution(String myString, String pat) {
        int answer = 0;

        int loop = myString.length() - pat.length() + 1;

        for(int i = 0; i < loop; i++){
            
            if(myString.substring(i, pat.length() + i).equals(pat)){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
    
}
