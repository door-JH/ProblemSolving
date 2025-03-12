public class P181883 {

    public static int[] solution(int[] arr, int[][] queries) {
        
        for(int q = 0; q < queries.length; q++){
            for(int w = 0; w < queries[q].length; w++){
                System.out.println(queries[q][w]);
                arr[queries[q][w]]++;
            }
        }
        
        for(int w = 0; w < arr.length; w++){
            System.out.println(arr[w]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int queries[][] = {{2,3}};
        solution(arr, queries);
    }
}
