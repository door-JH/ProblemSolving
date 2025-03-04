public class P181898 {
    public static int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i = 0; i < arr.length; i++){

            if(i == idx && arr[i] == 1) return i;

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
       
        System.out.println( solution(arr, 1));
    }
}
