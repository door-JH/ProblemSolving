public class P181884 {

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++){
            if(answer > n) {
                return answer;
            } else {
                answer += numbers[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
