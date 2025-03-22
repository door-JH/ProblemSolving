import java.util.Arrays;

public class P181855 {
    
    public static int solution(String[] strArr) {
        int answer = 0;

        int[] str_length = new int[31];

        for(int q = 0; q < strArr.length; q++){
            str_length[strArr[q].length()]++;
        }

        Arrays.sort(str_length);
        
        answer = str_length[str_length.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
