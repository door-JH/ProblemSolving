package Programmers.beginner;

public class P120902 {
    
    public static int solution(String my_string) {
        int answer = 0;
        int index = 1; // 연산자 위치
        String[] cal_arr = my_string.split(" ");
        
        //3+4-5  1..3..5..7..
        for(int q = 0; q < cal_arr.length / 2; q++){
            index = q * 2 + 1;
            
            switch (cal_arr[index]) {
                case "+":
                    answer += Integer.parseInt(cal_arr[index + 1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(cal_arr[index + 1]);
                    break;
            }

            if(q == 0) answer += Integer.parseInt(cal_arr[0]);

        }

        return answer;
    }

    public static void main(String[] args) {
        solution("3 + 4 - 7 + 3");
    }
}
