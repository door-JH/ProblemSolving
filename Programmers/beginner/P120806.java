package Programmers.beginner;

public class P120806 {
    
    public int solution(int num1, int num2) {
        double d1 = num1;
        double d2 = num2;

        double a = d1 / d2 * 1000;

        return (int)Math.floor(a);
    }

    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 3;

        double a = num1 / num2 * 1000;

        System.out.println((int)Math.floor(a));
    }
}
