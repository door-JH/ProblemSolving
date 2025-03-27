public class P181829 {
    
    public static int solution(int[][] board, int k) {
        int answer = 0;
        int num = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                num = board[i][j];
                if(i + j <= k) answer += num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
