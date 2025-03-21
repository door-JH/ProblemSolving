import java.util.ArrayList;
import java.util.List;

public class P181862 {
    
    public static String[] solution(String myStr) {
        String[] temp = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        String[] answer = {};

        for(int q = 0; q < temp.length; q++){
            if(!temp[q].equals("")){
                list.add(temp[q]);
            }
        }

        if(list.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        } else {
            answer = new String[list.size()];
        }

        for(int w = 0; w < list.size(); w++){
            answer[w] = list.get(w);
        }
        return answer;
    }

    public static void main(String[] args) {
        for (String string : solution("baconlettucetomato")) {
            System.out.println(string);
        }
    }
}
