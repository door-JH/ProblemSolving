import java.util.ArrayList;
import java.util.List;

public class P181860 {

    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int q = 0; q < arr.length; q++){

            if(!flag[q] && list.size() != 0){
                
                for(int w = 0; w < arr[q]; w++){
                    list.remove(list.size() - 1);
                }

            } else {
                for(int e = 0; e < arr[q] * 2; e++){
                    list.add(arr[q]);
                }
            }

        }

        answer = new int[list.size()];

        for(int r = 0; r < list.size(); r++){
            answer[r] = list.get(r);    
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
