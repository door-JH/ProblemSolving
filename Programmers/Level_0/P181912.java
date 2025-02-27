import java.util.ArrayList;
import java.util.List;

public class P181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
       

        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++){
            if(k < Integer.parseInt(intStrs[i].substring(s, s+l))){
                temp.add(Integer.parseInt(intStrs[i].substring(s, s+l)));
                
            }
        }

        answer = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("0123456789".substring(5,10));
    }
}
