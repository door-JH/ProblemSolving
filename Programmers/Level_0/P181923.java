
//재풀이 필요
public class P181923 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
    
        for (int a = 0; a < queries.length; a++) {
            int s = queries[a][0];
            int e = queries[a][1];
            int k = queries[a][2];
    
            int minValue = Integer.MAX_VALUE; // 가장 작은 값을 찾기 위해 초기값을 최댓값으로 설정
    
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
    
            // 만약 값이 갱신되지 않았다면 -1을 저장
            answer[a] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
        }
    
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,4,3};
        int queries[][] = {{0, 4,2},{0, 3, 2},{0, 2, 2}};
        solution(arr, queries);
        //System.out.println(solution(arr, queries)[0]);
    }
}
