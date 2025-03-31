import java.util.ArrayList;
import java.util.List;

public class P181870 {

    public static String[] solution(String[] strArr) {
        String[] answer = {};

        List<String> list = new ArrayList<>();

        for(int q = 0; q < strArr.length; q++){

            if(!strArr[q].contains("ad")){
                list.add(strArr[q]);
            }

        }

        answer = new String[list.size()];

        for(int w = 0; w < list.size(); w++){
            answer[w] = list.get(w);
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
