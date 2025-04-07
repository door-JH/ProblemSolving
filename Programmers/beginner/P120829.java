package Programmers.beginner;

import java.util.stream.IntStream;

public class P120829 {
    
    public int solution(int n) {
        return IntStream.range(0, n+1)
                        .filter(num -> num % 2 == 0)
                        .sum();
    }

    public static void main(String[] args) {
        
    }
}
