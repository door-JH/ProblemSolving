package Programmers.book.Ch7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tutorial {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        int first = queue.poll();
        System.out.println(first);

        queue.add(4);
        queue.add(5);

        first = queue.poll();
        System.out.println(first);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        first = deque.pollFirst();
        System.out.println(first);
    }
}
