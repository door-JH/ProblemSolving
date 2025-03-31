import java.util.ArrayList;
import java.util.List;

public class P181869 {
    
    public static String[] solution(String my_string) {
        String[] answer = {};
        int cnt = 0;

        List<Integer> pos_list = new ArrayList<>();

        pos_list.add(0);

        for(int q = 0; q < my_string.length(); q++){
            if(my_string.charAt(q) == ' ') {
                cnt++;
                pos_list.add(q);
            }
        }

        pos_list.add(my_string.length());

        answer = new String[cnt + 1];

        for(int w = 0; w < answer.length; w++){
            answer[w] = my_string.substring(pos_list.get(w), pos_list.get(w + 1)).trim();
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
