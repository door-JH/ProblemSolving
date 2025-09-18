package Programmers.PCCE;
import java.util.Scanner;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 환자의 코드를 나타내는 문자열 code를 입력받아 위 표에 맞는 병과를 출력하도록 빈칸을 채워 코드를 완성해 주세요. 
// 위 표의 단어로 끝나지 않는다면 "direct recommendation"를 출력합니다.


public class P1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){ // 빈칸
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")){ // 빈칸
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals("infl")){ // 빈칸
            System.out.println("Orthopedics");
        }
        else if (lastFourWords.equals("skin")){ // 빈칸
            System.out.println("Dermatology");
        }
        else { // 빈칸
            System.out.println("direct recommendation");
        }
    }
}
