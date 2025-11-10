package Programmers.book.Ch7;

import java.util.ArrayDeque;
import java.util.Queue;

public class P42586 {

    public static int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> answer = new ArrayDeque<>();

    int n = progresses.length;
    // 각 작업이 완료되는 데 필요한 '남은 일수' 계산
    int[] daysLeft = new int[n];
    for (int i = 0; i < n; i++) {
        // (100 - progresses[i]) / speeds[i] 의 올림값
        daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
    }

    // 첫 번째 작업을 기준으로 묶기 시작
    int count = 0;            // 현재 묶어서 배포될 작업 수
    int maxDay = daysLeft[0]; // 현재 배포 기준(같이 배포 가능한 최대 허용일)

    for (int i = 0; i < n; i++) {
        if (daysLeft[i] <= maxDay) {
            // 이 작업은 현재 기준 배포일에 포함될 수 있다.
            count++;
        } else {
            // 이 작업은 기준을 벗어났으므로 지금까지 카운트한 묶음을 큐에 넣고
            // 새로운 기준으로 다시 시작
            answer.add(count);
            count = 1;               // 현재 작업부터 새 묶음 시작(자기 자신 포함)
            maxDay = daysLeft[i];    // 기준을 현재 작업의 완료일로 업데이트
        }
    }

    // 마지막으로 남은 묶음 추가
    answer.add(count);

    // Queue<Integer> 를 int[] 로 변환하여 반환
    return answer.stream().mapToInt(Integer::intValue).toArray();
}

    public static void main(String[] args) {
        
    }
}
