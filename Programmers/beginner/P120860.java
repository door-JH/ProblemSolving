package Programmers.beginner;

public class P120860 {
    
    public int solution(int[][] dots) {
        int answer = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        //x
        for(int q = 0; q < dots.length; q++){
            if(x != dots[q][0]){
                x = Math.abs(x - dots[q][0]);
                break;
            }
        }
        //y
        for(int w = 0; w < dots.length; w++){
            if(y != dots[w][1]){
                y = Math.abs(y - dots[w][1]);
                break;
            }
        }

        answer = x * y;

        return answer;
    }

    public static void main(String[] args) {

    }
}
