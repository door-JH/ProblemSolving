package Programmers.PCCE;

import java.util.Scanner;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 첫 달에 저축하는 금액을 나타내는 정수 start, 
// 두 번째 달 부터 70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 before, 
// 100만 원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 after가 주어질 때, 
// 100만 원 이상을 모을 때까지 걸리는 개월 수를 출력하도록 빈칸을 채워 코드를 완성해 주세요.


public class P2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {    
            money += before;    // 빈칸
            month++;
        }
        while ( money < 100) {  // 빈칸
            money += after; // 빈칸
            month++;
        }

        System.out.println(month);
    }
}
