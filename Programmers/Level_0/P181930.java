public class P181930 {

    public static int solution(int a, int b, int c) {
        int answer = 0;
        int number = 1;
        int point = 0;
        
        if (a == b && b == c) {
            point = 3;
        } else if (a == b || b == c || c == a) {
            point = 2;
        } else {
            point = 1;
        }

        for(int i = 0; i < point; i++){
            number *= Math.pow(a, i + 1) + Math.pow(b, i + 1) + Math.pow(c, i + 1);
        }

        answer = number;
        

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
    }
}
