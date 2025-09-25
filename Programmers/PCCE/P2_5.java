package Programmers.PCCE;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 여름이는 강아지를 산책시키려고 합니다. 
// 여름이는 2차원 좌표평면에서 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책시킵니다. 
// 산책루트가 담긴 문자열 route가 주어질 때, 
// 도착점의 위치를 return하도록 빈칸을 채워 solution함수를 완성해 주세요.
// route는 "N", "S", "E", "W"로 이루어져 있습니다.
// "N"은 북쪽으로 1만큼 움직입니다.
// "S"는 남쪽으로 1만큼 움직입니다.
// 북쪽으로 -1만큼 움직인 것과 같습니다.
// "E"는 동쪽으로 1만큼 움직입니다.
// "W"는 서쪽으로 1만큼 움직입니다.
// 동쪽으로 -1만큼 움직인 것과 같습니다.


public class P2_5 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++; // 빈칸
                    break;
                case 'W':
                    east--; // 빈칸
                    break;  // 빈칸
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
