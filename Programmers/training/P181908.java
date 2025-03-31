import java.util.Arrays;

public class P181908 {

    /*
     * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
     * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
    문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
     */

     public static int solution(String my_string, String is_suffix) {
        int answer = 0;

        int length = my_string.length();

        String[] strs = new String[length];

        String str = "";

        for(int i = 0; i < length; i++){

            str = "";
            for(int q = i; q < length; q++){

                str += my_string.charAt(q);
            }

            strs[i] = str;
        }
        
        for(int q = 0; q < strs.length; q++){
            System.out.println(strs[q]);
            if(strs[q].equals(is_suffix)){
                answer = 1;
            }
        }

        
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("banana", "ana");
    }
    
}
