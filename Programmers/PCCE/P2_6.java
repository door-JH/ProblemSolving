package Programmers.PCCE;

// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 성적을 문의하려는 학생들의 번호가 담긴 정수 리스트 numbers와 
// 가채점한 점수가 성적을 문의하려는 학생 순서대로 담긴 정수 리스트 our_score, 
// 실제 성적이 번호 순서대로 담긴 정수 리스트 score_list가 주어집니다. 
// 주어진 solution 함수는 가채점한 점수가 실제 성적과 동일하다면 "Same"을, 
// 다르다면 "Different"를 순서대로 리스트에 담아 return하는 함수입니다. 
// solution 함수가 올바르게 작동하도록 한 줄을 수정해 주세요.


public class P2_6 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            // if (our_score[i] == score_list[i]) {
            if (our_score[i] == score_list[numbers[i] - 1]) { // 한 줄 수정
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
