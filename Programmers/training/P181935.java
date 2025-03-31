public class P181935 {

    public static int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0){ 
            for(int i = 1; i <= n; i++ ){
                if(i % 2 == 0) answer += i*i;
            }
        } 
        
        if(n % 2 != 0){
            for(int i = 1; i <= n; i++ ){
               if(i % 2 != 0) answer += i;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //solution();
    }
}
