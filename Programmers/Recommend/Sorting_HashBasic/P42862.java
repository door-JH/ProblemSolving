package Programmers.Recommend.Sorting_HashBasic;

public class P42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //0번부터 n번까지.
        int[] status = new int[n + 2];
        
        // -1 : 없음, 0: 있음, 1:여벌 있음
        for(int x : lost){
            status[x]--;
        }
        
        for(int x : reserve){
            status[x]++;
        }
        
        for(int i = 1; i <= n; i++){
            if(status[i] == 1){
                if(status[i - 1] == -1){
                    status[i]--;
                    status[i - 1]++;
                }else if(status[i + 1] == -1){
                    status[i]--;
                    status[i + 1]++;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(status[i] >= 0){
                answer++;
            }
        }
        
        return answer;
    }
}
