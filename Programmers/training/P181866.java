import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181866 {
    
    public static String[] solution(String myString) {
        String[] answer = {};
        String[] temp = myString.split("x");
        List<String> list = new ArrayList<>();

        for(int q = 0; q < temp.length; q++){
            if(!temp[q].equals("")){
                list.add(temp[q]);
            }
        }
        
        answer = new String[list.size()];

        for(int w = 0; w < list.size(); w++){
            answer[w] = list.get(w);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }

    public static void main(String[] args) {
        solution("axbxcxdx");
    }
}
