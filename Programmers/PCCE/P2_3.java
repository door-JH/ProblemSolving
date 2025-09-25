package Programmers.PCCE;
import java.util.Scanner;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 한국식 나이 : 현재 연도 - 출생 연도 + 1
// 연 나이 : 현재 연도 - 출생 연도
// 출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 age_type이 주어질 때 
// 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요. 
// age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.


public class P2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) { // 빈칸
            answer = 2030 - year + 1; // 빈칸
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year; // 빈칸
        }

        System.out.println(answer);
    }
}
