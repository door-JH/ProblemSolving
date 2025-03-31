public class P181936 {

    public static int solution(int number, int n, int m) {
        int answer = 0;
        
         if(number % n != 0){
            answer = 0;
        } else {
            if(number % m == 0) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //solution(0, 0, 0);
    }
}
