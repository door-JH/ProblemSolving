import java.util.Arrays;

public class P181909 {

    public static String[] solution(String my_string) {
        int length = my_string.length();

        String[] answer = new String[length];

        String str = "";

        for(int i = 0; i < length; i++){

            str = "";
            for(int q = i; q < length; q++){

                str += my_string.charAt(q);
            }

            answer[i] = str;
        }
        
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
