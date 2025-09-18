package Programmers.PCCE;

// 디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
// 1줄만 수정하여 버그를 고치세요.
// 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.

// 현재 저수지에 저장된 물의 양을 나타내는 정수 
// storage와 지난 달 물 사용량을 나타내는 정수 usage, 
// 월별 물 사용량이 전 달 대비 어떻게 변하는지 저장된 정수 리스트 change가 주어질 때 
// 몇 달 뒤 물이 부족해지는지 return 하도록 solution 함수를 작성하려 합니다. 
// 코드가 올바르게 작동하도록 한 줄을 수정해 solution 함수를 완성해 주세요. 
// 가뭄이 끝날때 까지 저수지의 물이 남아 있다면 -1을 return합니다.


public class P1_6 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            // usage = total_usage * change[i] / 100; //한 줄 수정
            usage += usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
