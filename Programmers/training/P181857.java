public class P181857 {
    
    public static int[] solution(int[] arr) {
        int[] answer = {};

        for(int q = 1; q <= 10; q++){
            if((int)Math.pow(2, q) == arr.length || arr.length == 1){
                return arr;
            } else if((int)Math.pow(2, q) > arr.length){
                answer = new int[(int)Math.pow(2, q)];
                for(int w = 0; w < arr.length; w++){
                    answer[w] = arr[w];
                }
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        solution(arr);
    }
}
