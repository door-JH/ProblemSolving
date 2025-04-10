package Programmers.beginner;

public class P120843 {
    //index = 0
    // k * 2 - 1
    // 5 % arr.length - 1 
    //1, 2, 3, 1, 2, 3
    //1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3
    public static int solution(int[] numbers, int k) {
        int index = (k * 2 - 1) % numbers.length - 1;
        if(index < 0) index = numbers.length - 1;

        return numbers[index];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        solution(arr, 5);
    }
}
