import java.util.Arrays;

//재풀이 필요
public class P181916 {

    public static int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        Arrays.sort(num);  // 정렬하여 패턴 판별을 쉽게 함

        // 모든 숫자가 동일한 경우
        if (num[0] == num[3]) {
            return 1111 * num[0];
        }

        // 3개가 같은 경우 (p, p, p, q)
        if (num[0] == num[2] && num[2] != num[3]) {
            return (int) Math.pow(10 * num[0] + num[3], 2);
        }
        if (num[1] == num[3] && num[0] != num[1]) {
            return (int) Math.pow(10 * num[1] + num[0], 2);
        }

        // 2개씩 같은 경우 (p, p, q, q)
        if (num[0] == num[1] && num[2] == num[3] && num[0] != num[2]) {
            return (num[0] + num[2]) * Math.abs(num[0] - num[2]);
        }

        // 2개만 같은 경우 (p, p, q, r)
        if (num[0] == num[1] && num[2] != num[3]) {
            return num[2] * num[3];
        }
        if (num[1] == num[2] && num[0] != num[3]) {
            return num[0] * num[3];
        }
        if (num[2] == num[3] && num[0] != num[1]) {
            return num[0] * num[1];
        }

        // 모든 숫자가 다를 경우
        return num[0];
    }
    
    public static void main(String[] args) {
        solution(2,5,2,6);
    }
    
}
