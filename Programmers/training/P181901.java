public class P181901 {

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(15, 5);
    }
}
