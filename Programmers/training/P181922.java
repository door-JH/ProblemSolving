public class P181922 {

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int a = 0; a < queries.length; a++){
            int s = queries[a][0];
            int e = queries[a][1];
            int k = queries[a][2];

            for(int i = 0; i < arr.length; i++){

                if(s <= i && i <= e && i % k == 0 && k > 0){
                    arr[i] += 1;
                }

            }

        }
        
        answer = arr;
        return answer;
    }

    public static void main(String[] args) {   
        int arr[] = {0,1,2,4,3};
        int queries[][] = {{0,4,1},{0,3,2},{0,3,3}};
        int answer[] = solution(arr, queries);

        for(int i = 0; i < arr.length; i++){
            System.out.println(answer[i]);
        }

        
    }
}
