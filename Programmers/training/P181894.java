import java.util.ArrayList;
import java.util.List;

public class P181894 {
    
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int cnt = 0;

        List<Integer> pos = new ArrayList<>();

        for(int q = 0; q < arr.length; q++){
            if(arr[q] == 2) {
                pos.add(q);
            }
        }

        if(pos.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        if(pos.size() == 1){
            answer = new int[1];
            answer[0] = 2;
        }

        if(pos.size() > 1){

            answer = new int[pos.get(pos.size() - 1) - pos.get(0) + 1];
            
            for(int w = pos.get(0); w <= pos.get(pos.size() - 1); w++){   
                answer[cnt++] = arr[w];
            } 
        }
        
        return answer;
    }

    public static void main(String[] args) {

        int arr[] = {10, 10, 10, 2, 1, 3, 2, 2, 6};

        solution(arr);
    }  
}
