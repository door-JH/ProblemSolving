public class P181902 {
    
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        int index = 0;
        int pos = 0;
        for(int i = 0; i < my_string.length(); i++){
            pos = (int) my_string.charAt(i);
            index =  pos < 97 ? pos - 65 : pos - 71;
            answer[index]++;
        }

        return answer;
    }

    public static void main(String[] args) {
       
    }
}
