public class P181892 {
    
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int cnt = 0;
        for(int i = n - 1; i < num_list.length; i++){
            answer[cnt++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int num_list1[] = {2,1,6};
        int num_list2[] = {5,2,1,7,5};
        solution(num_list2, 3);
    }
}
