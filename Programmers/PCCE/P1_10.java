package Programmers.PCCE;

// 지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 
// 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다. 
// 예를 들어 지민이가 가지고 있는 돗자리의 한 변 길이가 5, 3, 2 세 종류이고, 
// 사람들이 다음과 같이 앉아 있다면 지민이가 깔 수 있는 가장 큰 돗자리는 3x3 크기입니다.

// 지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 
// 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가 주어질 때 
// 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 
// 아무런 돗자리도 깔 수 없는 경우 -1을 return합니다.


public class P1_10 {
    public static int solution(int[] mats, String[][] park) {
        int answer = -1;

        for(int q = 0; q < mats.length; q++){
            int size = mats[q];
            for(int w = 0; w <= park.length - size; w++){
                for(int e = 0; e <= park[0].length - size; e++){
                    boolean allMinusOne = true;
                    for(int r = 0; r < size; r++){
                        for(int c = 0; c < size; c++){
                            if(!park[w + r][e + c].equals("-1")){
                                allMinusOne = false;
                                break;
                            }
                        }
                        if(!allMinusOne) break;
                    }
                    if(allMinusOne){
                        answer = Math.max(answer, size);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] mats = {5,3,2};
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
                            {"A", "A", "-1", "B", "B", "B", "B", "-1"}, 
                            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                            {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, 
                            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, 
                            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};

        solution(mats, park);
    }
    
}
