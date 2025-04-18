package Programmers.beginner;

public class P120808 {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;

        for(int i = answer[1]; i > 0; i--){
            if(answer[1] % i == 0 && answer[0] % i == 0){
                answer[0] /= i;
                answer[1] /= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        for (int i : solution(1,2,3,4)) {
            System.out.println(i);
        }
    }
}
