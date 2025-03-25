import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P181846 {

    public static String solution(String a, String b) {
        String answer = "";

        HashMap<Character, Integer> map =  new HashMap<>();
        List<Integer> list = new ArrayList<>();

        String temp = "";
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        boolean round = false;

        if(a.length() > b.length()){
            map.put('a', a.length());
            for(int q = 0; q < a.length() - b.length(); q++){
                temp += "0";
            }
            temp += b;
            b = temp;
        } else {
            map.put('b', b.length());
            for(int w = 0; w < b.length() - a.length(); w++){
                temp += "0";
            }
            temp += a;
            a = temp;
        }

        for(int e = a.length() - 1; e >= 0; e--){
            num1 = Integer.parseInt(a.charAt(e) + "");
            num2 = Integer.parseInt(b.charAt(e) + "");

            sum = num1 + num2;

            if(round){
                sum++;
                round = false;
            }

            if(sum > 9){
                round = true;
                list.add(sum - 10);
            } else {
                list.add(sum);
                round = false;
            }

        }

        if(round) answer += "1";

        for(int r = list.size() - 1; r >= 0;  r--){
            answer += Integer.toString(list.get(r));
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
        solution("582", "734");//20 21


    }
}
