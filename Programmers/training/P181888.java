public class P181888 {

    public static int[] solution(int[] num_list, int n) {
        int length = num_list.length / n;
        if(num_list.length % n != 0) length++;

        int[] answer = new int[length];
        int cnt = 0;
        for(int i = 0; i < length; i++){
            answer[i] = num_list[cnt];
            cnt += n;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,1,5,2};
        solution(arr, 4);
    }
}
