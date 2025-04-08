package Programmers.beginner;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class P120836 {
    public int solution(int num) {
        AtomicInteger streamInt = new AtomicInteger(0);

        IntStream.range(1, num + 1)
                 .filter(n -> num % n == 0)
                 .forEach(n -> streamInt.incrementAndGet());

        return streamInt.get();
    }

    public static void main(String[] args) {
        
    }
}
