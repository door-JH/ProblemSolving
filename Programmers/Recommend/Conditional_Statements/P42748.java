package Programmers.Recommend.Conditional_Statements;
import java.util.stream.IntStream;

public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = {};
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < commands.length; i++){
            start = commands[i][0] - 1;
            end = commands[i][1];
            temp = IntStream.range(start, end)
                            .map(idx -> array[idx])
                            .sorted()
                            .toArray();
            answer[i] = temp[commands[i][2] - 1];
            
        }
        
        return answer;
    }
}
