public class P181886 {

    public String[] solution(String[] names) {
        int length = names.length / 5;
        if(names.length % 5 != 0) length++;

        String[] answer = new String[length];
        int cnt = 0;
        for(int i = 0; i < length; i++){
            answer[i] = names[cnt];
            cnt += 5;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
