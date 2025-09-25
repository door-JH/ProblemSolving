package Programmers.PCCE;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 상우가 설정한 가습기의 모드를 나타낸 문자열 mode_type, 
// 현재 공기 중 습도를 나타낸 정수 humidity, 
// 설정값을 나타낸 정수 val_set이 주어질 때 현재 가습기가 몇 단계로 작동 중인지 
// return하도록 빈칸을 채워 solution 함수를 완성해 주세요.


public class P2_7 {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3; // 빈칸
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else    // 빈칸
            return 5; // 빈칸
        
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0; // 빈칸
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}
