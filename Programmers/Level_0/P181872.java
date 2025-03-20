public class P181872 {

    public static String solution(String myString, String pat) {
        String answer = "";


        int loop = myString.length() - pat.length() + 1;

        int index = myString.length() - 1;

        for(int i = 0; i < loop; i++){

            if(myString.substring(index - pat.length() - i + 1, index - i + 1).equals(pat)){
                answer = myString.substring(0, index - i + 1);
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dEF"));
    }
    
}
