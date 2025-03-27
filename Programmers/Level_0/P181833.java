public class P181833 {
    
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int q  = 0; q < answer.length; q++){

            for(int w = 0; w < answer[q].length; w++){
                if(q == w){
                    answer[q][w] = 1;
                } else {
                    answer[q][w] = 0;
                }
            }    

        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
