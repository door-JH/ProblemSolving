public class P181854 {

    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if(arr.length % 2 == 0){
            for(int q = 0; q < arr.length; q++){
                if(q % 2 == 1) arr[q] += n;
                answer[q] = arr[q];
            }
        } else {
            for(int w = 0; w < arr.length; w++){
                if(w % 2 == 0) arr[w] += n;
                answer[w] = arr[w];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
