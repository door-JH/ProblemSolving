public class P181929 {

    public static int solution(int[] num_list){
        int answer = 0;
        int num1 = 1;
        int num2 = 0;
        
        for(int i = 0; i < num_list.length; i++){
            num1 *= num_list[i];
            num2 += num_list[i];
        }

        answer = (num1 < Math.pow(num2,2)) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        
    }
}