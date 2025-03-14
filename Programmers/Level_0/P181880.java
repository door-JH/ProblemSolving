public class P181880 {
    
    public int solution(int[] num_list) {
        int answer = 0;
        int cnt = 0;

        for(int q = 0; q < num_list.length; q++){

            cnt = 0;
            while (num_list[q] != 1 ) {

                if(num_list[q] % 2 == 1) num_list[q]--;

                num_list[q] /= 2;
                
                cnt++;
            }
            answer += cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
