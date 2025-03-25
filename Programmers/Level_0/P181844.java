import java.util.ArrayList;
import java.util.List;

public class P181844 {

    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        boolean is_delete = false;

        for(int q = 0; q < arr.length; q++){
            is_delete = false;
            for(int w = 0; w < delete_list.length; w++){
                if(arr[q] == delete_list[w]) is_delete = true;
            }
            if(!is_delete){
                list.add(arr[q]);
            }
        }
        
        answer = new int[list.size()];

        for(int e = 0; e < answer.length; e++){
            answer[e] = list.get(e);
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
