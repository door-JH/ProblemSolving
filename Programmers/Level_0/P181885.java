import java.util.ArrayList;
import java.util.List;

public class P181885 {

    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};

        List<String> str_list = new ArrayList<>();

        for(int q = 0; q < finished.length; q++){
            if(!finished[q]) str_list.add(todo_list[q]);
        }

        answer = new String[str_list.size()];

        for(int w = 0; w < answer.length; w++){
            answer[w] = str_list.get(w);
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
