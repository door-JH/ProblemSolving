import java.util.ArrayList;
import java.util.List;

public class P181861 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int q = 0; q < arr.length; q++){

            for(int w = 0; w < arr[q]; w++){
                list.add(arr[q]);
            }

        }

        answer = new int[list.size()];

        for(int w = 0; w < list.size(); w++){
            answer[w] = list.get(w);
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
