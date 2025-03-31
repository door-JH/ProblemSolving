import java.util.Arrays;

public class P181919 {

    public static int[] solution(int n) {
        int[] answer = new int[1000];
        int index = 1;
        answer[0] = n;
        while(n != 1){

            switch (n % 2) {
                case 0:
                    n = n / 2;
                    answer[index] = n;
                    index++;
                    break;

                case 1:
                    n = 3 * n + 1;
                    answer[index] = n;
                    index++;
                    break;
                
            }
        }

        answer = Arrays.copyOfRange(answer, 0, index);
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
