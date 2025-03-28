public class P181832 {

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int index = 0;
        int cnt = 1;
        int width = 0;
        int height = 0;

        boolean width_search = false;
        boolean height_search = false;

        for(int q = 0; q < n; q++){
            
            for(int w = 0; w < n; w++){
                
                if(!width_search && !height_search){
                    if(answer[height + index][width + w] == 0){
                        answer[height + index][width + w] = cnt++;
                    }
                } else if(width_search && !height_search){
                    if(answer[height + w][width + index] == 0){
                        answer[height + w][width + index] = cnt++;
                    }
                } else if(width_search && height_search){
                    if(answer[height + index][width + w] == 0){
                        answer[height + index][width + w] = cnt++;
                    }
                } else if(!width_search && height_search){
                    if(answer[height + index][width + w] == 0){
                        answer[height + index][width + w] = cnt++;
                    }
                }
            
            }



            
            index++;

        }
        

        return answer;
    }

    public static void main(String[] args) {
        solution(5);
    }
}
