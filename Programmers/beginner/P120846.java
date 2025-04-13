package Programmers.beginner;

public class P120846 {
    
    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int loop = n;
        //약수
        for(int q = loop; q > 3; q--){
            cnt = 0;
            for(int w = 1; w <= q / 2; w++){
                if(q % w == 0){
                    cnt++;
                }
            }
            
            if(cnt > 1){
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
       solution(10);
    }
}
