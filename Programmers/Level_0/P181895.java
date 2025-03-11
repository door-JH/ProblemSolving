public class P181895 {

    public static int[] solution(int[] arr, int[][] intervals) {
        
        
        int arr_len = (intervals[0][1] - intervals[0][0] + 1) +
                        (intervals[1][1] - intervals[1][0] + 1);
        
        int[] answer = new int[arr_len];
        int cnt = 0;
        for(int i = 0; i < intervals.length; i++){
            
            for(int q = intervals[i][0]; q <= intervals[i][1]; q++){
                answer[cnt++] = arr[q];
            }

        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
