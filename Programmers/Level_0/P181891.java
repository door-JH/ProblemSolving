public class P181891 {

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;

        for(int q = n;  q < num_list.length; q++){
            answer[cnt++] = num_list[q];
        }

        for(int w = 0; w < n; w++){
            answer[cnt++] = num_list[w];
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
