public class P181914 {

    public static int solution(String number) {
        int answer = 0;
        for(int i = 0; i < number.length(); i++){
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        answer %= 9;
        return answer;
    }

    public static void main(String[] args) {
        solution("78720646226947352489");
    }
}
