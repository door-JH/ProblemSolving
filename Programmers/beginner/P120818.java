package Programmers.beginner;

public class P120818 {
    public static int solution(int price) {

      


        if(price >= 500000){
            return (int) (price - Math.ceil((double) 100010 / 100 * 20));
        } else if(price >= 300000){
            return (int) (price - Math.ceil((double) 100010 / 100 * 10));
        } else if(price >= 100000){
            return (int) (price - Math.ceil((double) 100010 / 100 * 5));
        } else {
            return price;
        }

    }

    public static void main(String[] args) {
        System.out.println(Math.ceil((double) 100010 / 100));
        System.out.println(solution(150000));
    }
}
