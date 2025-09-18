package Programmers.PCCE;
import java.util.Scanner;

// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때, 
// 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다. 
// 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.

public class P1_2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle%360); // 한 줄 수정
    }
}
