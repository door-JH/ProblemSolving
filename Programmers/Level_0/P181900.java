import java.util.Arrays;

public class P181900 {
    
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        
        boolean is_print = true;

        Arrays.sort(indices);
        for(int i = 0; i < my_string.length(); i++){
            is_print = true;
            for(int q = 0; q < indices.length; q++){
                if(i == indices[q]) is_print = false;
            }
            if(is_print) answer += my_string.charAt(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
