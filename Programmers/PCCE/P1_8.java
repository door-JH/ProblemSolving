package Programmers.PCCE;

// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 소문자 l을 대문자 I로 변경합니다.
// 소문자 w를 두 개의 소문자 v, 즉 vv로 변경합니다.
// 대문자 W를 두 개의 대문자 V, 즉 VV로 변경합니다.
// 대문자 O를 숫자 0으로 변경합니다.
// 수정된 닉네임의 길이가 4 미만일 경우 뒤에 소문자 o를 길이가 4가 될때까지 이어붙입니다.
// 수정된 닉네임의 길이가 8보다 클 경우 8번째 문자까지만 사용합니다.

// 주어진 solution 함수에는 위의 규칙 중 올바르게 적용되지 않는 것이 있습니다. 
// solution 함수가 올바르게 작동하도록 한 줄을 수정해주세요.


public class P1_8 {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        // if(answer.length() < 3){
        while(answer.length() < 4){ // 한 줄 수정
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
