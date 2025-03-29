public class P181832 {

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int loop = n * 2 - 1;

        boolean width_search = false;
        boolean height_search = false;

        int index = 0;

        int cnt = 1;

        for(int q = 0; q < loop; q++){
            
            for(int w = 0; w < n; w++){
                if(!width_search  && !height_search){
                    if(answer[index][w] ==  0){
                        answer[index][w] = cnt++;
                    }

                } else if(width_search  && !height_search){
                    if(answer[w][n - 1 - index] == 0) {
                        answer[w][n - 1 - index] = cnt++;
                    }

                } else if(width_search  && height_search){
                    if(answer[n - 1 - index][(n - 1) - w] == 0) {
                        answer[n - 1 - index][(n - 1) - w] = cnt++;
                    }
                } else if(!width_search  && height_search){
                    if(answer[(n - 1) - w][index] == 0){
                        answer[(n - 1) - w][index] = cnt++;
                    }
                }
                if(w == n) cnt--;
            }

            

            if(!width_search  && !height_search){
                width_search = true;
            } else if(width_search  && !height_search){
                height_search = true;
            } else if(width_search  && height_search){
                width_search = false;
            } else if(!width_search  && height_search){
                height_search = false;
                index++;
            }
            
        }

        

        return answer;
    }

    public static void main(String[] args) {
        int n = 4;

        int arr[][] = solution(n);

        for(int q = 0; q < n; q++){
            for(int w = 0; w < n; w++){
                System.out.print(arr[q][w] + "  ");
            }
            System.out.println();
        }
    }
}
