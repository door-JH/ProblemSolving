public class P181924 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int swap = 0;

        for(int i = 0; i < queries.length; i++){
            swap = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = swap;
        }
        
        answer = arr;

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
