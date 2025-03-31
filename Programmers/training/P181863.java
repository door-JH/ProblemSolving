import java.util.ArrayList;
import java.util.List;

public class P181863 {
    
    public static String solution(String rny_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for(int q = 0; q < rny_string.length(); q++){
            if(rny_string.charAt(q) == 'm'){
                list.add('r');
                list.add('n');
            } else {
                list.add(rny_string.charAt(q));
            }
        }

        for(int w = 0; w < list.size(); w++){
            answer += list.get(w);
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
