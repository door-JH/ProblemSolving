public class P181942 {

    public static String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length() * 2; i++) {

            if (i % 2 == 0) {
                answer += str1.charAt(i / 2);
            } else {
                answer += str2.charAt(i / 2);
            }

        }
        return answer;
    }

    public static void main(String[] args){
        //solution("","");
    }

}
