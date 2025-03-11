public class P181896 {
    public static int solution(int[] num_list) {
        int answer = -1;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0) return i;
        }

        return answer;
    }
    public static void main(String[] args) {
        
    }
}
