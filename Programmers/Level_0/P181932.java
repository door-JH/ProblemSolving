public class P181932 {

    public static String solution(String code){

        code = "abc1abc1abc";

        String answer = "";
        boolean mode = false;


        for(int i = 0; i < code.length(); i++){
            
            mode = (code.charAt(i) == '1') ? !mode : mode;
            
            if(code.charAt(i) != '1'){
                if(i % 2 == 0 && !mode) answer += code.charAt(i);

                if(i % 2 != 0 && mode) answer += code.charAt(i);
            }

            

        }

        if(answer.equals("")) return "EMPTY";

        return answer;
    }


    public static void main(String[] args) {

         
        System.out.println(solution(""));
    }


}
