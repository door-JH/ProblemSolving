public class P181856 {

    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        //배열 길이가 다를 때
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            //배열 길이가 같을 때
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }

            if(sum1 == sum2){
                answer = 0;
            } else {
                answer = sum1 > sum2 ? 1 : -1;
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        
    }
}
