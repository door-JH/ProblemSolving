package Programmers.beginner;

public class P120862 {
    
    public int solution(int[] numbers) {
        int answer = 0;

        for(int q = 0; q < numbers.length - 1; q++){

            for(int w = q + 1; w < numbers.length; w++){
                if(answer < numbers[q] * numbers[w] || (answer == 0 && q == 0)){
                    answer = numbers[q] * numbers[w];
                }
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
