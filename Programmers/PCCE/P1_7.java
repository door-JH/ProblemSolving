package Programmers.PCCE;

// 빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
// 빈칸을 제외한 기본 코드는 수정할 수 없습니다.
// 빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 주어진 solution함수는 버스의 좌석 개수 seat, 
// 기점에서 출발한 버스가 순서대로 방문한 정거장에서 승객이 승/하차한 정보를 담은 2차원 문자열 리스트 passengers가 주어질 때, 
// 버스에 남아있는 좌석의 개수를 return 하는 함수입니다. 
// solution 함수가 올바르게 작동하도록 빈칸을 채워 solution함수를 완성해 주세요.


public class P1_7 {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func4(passengers[i]); // 빈칸
            num_passenger -= func3(passengers[i]); // 빈칸
        }
        int answer = func1(seat - num_passenger); // 빈칸
        return answer;
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
