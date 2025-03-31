import java.util.Arrays;

public class P181897 {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        int cnt = 0;
        switch (n) {
            case 1:
                answer = new int[slicer[1] + 1];

                for(int i = 0; i <= slicer[1]; i++){
                    answer[i] = num_list[i];
                }

                break;
            case 2:
                answer = new int[num_list.length - slicer[0]];
                
                for(int i = slicer[0]; i < num_list.length; i++){
                    answer[cnt++] = num_list[i];
                }

                break;

            case 3:
                answer = new int[slicer[1] - slicer[0] + 1];

                for(int i = slicer[0]; i <= slicer[1]; i++){
                    answer[cnt++] = num_list[i];
                }
                
                break;
            //4, [2, 7, 3], [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            //기댓값 〉 [2, 5]
            case 4:
            int seperate = (slicer[1] - slicer[0] + 1) / slicer[2];
            if(seperate == 0) seperate = 1;
            answer = new int[seperate];

            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                answer[cnt++] = num_list[i];
            }
                
                break;
            default:
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
