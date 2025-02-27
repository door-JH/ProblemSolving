import java.util.Arrays;

public class P181913 {

    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] str_arr  = new char[my_string.length()];

        char[] temp;
        int cnt;

        for(int a = 0; a < my_string.length(); a++){
            str_arr[a] = my_string.charAt(a);
            System.out.println(str_arr[a]);
        }


        for(int i = 0; i < queries.length; i++){
            temp = new char[queries[i][1] - queries[i][0] + 1];

            cnt = 0;
            for(int q = queries[i][1]; q >= queries[i][0] ; q--){
                temp[cnt] = str_arr[q];
                cnt++;
            }

            cnt = 0;
            for(int w = queries[i][0]; w <= queries[i][1]; w++) {
                str_arr[w] = temp[cnt];
                cnt++;
            }
        }

        for(int c = 0; c < str_arr.length; c++){
            answer += str_arr[c];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        solution("rermgorpsam", arr);
    }
}
