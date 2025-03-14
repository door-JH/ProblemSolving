public class P181879 {
    
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){

            if(num_list.length >= 11){
                
                answer += num_list[i];

            } else {
                answer = answer == 0 ? 1 : answer; 
                answer *= num_list[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
