package Programmers.book;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] visit = new int[N + 1];
        
        double[] failure = new double[N];
        
        //방문 수
        for(int i : stages){
            visit[i - 1]++;
        }
        
        //실패울
        int total = stages.length;
        for (int q = 0; q < N; q++) {
            if (total == 0) {
                failure[q] = 0;
            } else {
                failure[q] = (double) visit[q] / total;
                total -= visit[q];
            }
        }


        //정답
        double temp = 0;
        int pos = 0;
        for(int q = 0; q < answer.length; q++){
            temp = -0.1;
            pos = 0;
            for(int w = 0; w < failure.length; w++){
                if(failure[w] > temp){
                    temp = failure[w];
                    pos = w;
                }
            }
            answer[q] = pos + 1;
            failure[pos] = -1.0;
        }
        
        return answer;
    }
}