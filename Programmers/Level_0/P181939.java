public class P181939 {
    public static int solution(int a, int b) {
        int answer = 0;

        int val1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

        int val2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        answer = (val1 > val2) ? val1 : val2;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(9,91));


    }

}
