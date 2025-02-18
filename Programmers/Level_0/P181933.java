public class P181933 {

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(flag){
            answer = a + b;
        } else {
            answer = a - b;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //solution(0, 0, false);
    }
}
