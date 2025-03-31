
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class P181858 {
    
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .collect(Collectors.toList());

        // 중복 제거 후 순서 유지
        List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));

        // 필요한 만큼 -1 추가
        for(int i = uniqueList.size(); i < k; i++){
            uniqueList.add(-1);
        }

        // k개의 요소를 정답 배열에 저장
        for(int n = 0; n < k; n++){
            answer[n] = uniqueList.get(n);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1};
        for (int i : solution(arr, 4)) {
            //System.out.println(i);
        };
    }
}
