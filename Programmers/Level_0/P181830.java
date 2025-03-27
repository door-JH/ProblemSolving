import java.util.ArrayList;
import java.util.List;

public class P181830 {

    public static int[][] solution(int[][] arr) {
        int[][] answer = {};
        int length = 0;
        for(int q = 0; q < arr.length; q++){
            if(arr[q].length > length){
                length = arr[q].length;
            }
        }
        
        length = arr.length > length ? arr.length : length;

        answer = new int[length][length];

        for(int w = 0; w < arr.length; w++){
            for(int e = 0; e < arr[w].length; e++){
                answer[w][e] = arr[w][e];
            }
            for(int r = arr[w].length; r < length; r++){
                answer[w][r] = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
        int[][] arr1 ={{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        solution(arr1);
    }
}
