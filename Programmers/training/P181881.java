public class P181881 {
    
    public static int solution(int[] arr) {
        int answer = 0;
        
        int idx = 0;
        int cnt = 0;
        while (true) {
            //연산횟수
            cnt = 0;
            
            //값 갱신
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    cnt++;
                    
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] *= 2;
                    arr[i]++;
                    cnt++;
                    
                }
            }
            
            //연산이 발생하지 않았다면
            if(cnt == 0){
                answer = idx;
                break;
            } else {
                idx++;
            }
           
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {63};
        solution(arr);
    }

}
