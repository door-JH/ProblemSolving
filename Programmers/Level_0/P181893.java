import java.util.Arrays;
//재풀이 필요
public class P181893 {
    public static int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i] 인덱스 뒤를 자름
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                // 홀수 인덱스: query[i] 인덱스 앞을 자름
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {0,1,2,3,4,5};
        int query[] = {4,1,2};

        solution(arr, query);
    }
}
