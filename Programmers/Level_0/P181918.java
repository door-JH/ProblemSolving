import java.util.ArrayList;
import java.util.List;

public class P181918 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        int size = 0;
        List<Integer> stk = new ArrayList<>();


        while(i < arr.length){

            size = stk.size() - 1;
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            } else {
                if(stk.get(size) < arr[i]){
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(size);
                }
            }
           
        }

        
        answer = new int[stk.size()];

        for(int a = 0; a < stk.size(); a++){
            answer[a] = stk.get(a);
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,2,5,3};
        System.out.println(solution(arr));
    }
}
