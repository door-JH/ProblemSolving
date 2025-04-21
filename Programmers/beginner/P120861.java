package Programmers.beginner;

public class P120861 {
    
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0; 
        int y = 0;

        for (String str : keyinput) {
            
            switch (str) {
                case "left":
                    if(x - 1 >= board[0] / 2 * -1) x--; 
                    break;
                case "right":
                    if(x + 1 <= board[0] / 2) x++; 
                    break;
                case "up":
                    if(y + 1 <= board[1] / 2) y++; 
                    break;
                case "down":
                    if(y - 1 >= board[1] / 2 * -1) y--; 
                    break;
            }

        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
