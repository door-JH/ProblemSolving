public class P181915 {

    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i = 0; i < index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
