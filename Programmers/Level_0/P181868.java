import java.util.ArrayList;
import java.util.List;

public class P181868 {

    public static String[] solution(String my_string) {
        String[] answer = {};

        String[] temp = my_string.split(" ");

        int cnt = 0;

        List<String> list = new ArrayList<>();

        for(int q = 0; q < temp.length; q++){
            if(!temp[q].isEmpty()) {
                list.add(temp[q]);
                cnt++; 
        } 
    }
        answer = new String[cnt];

        for(int w = 0; w < cnt; w++){
            answer[w] = list.get(w);
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
