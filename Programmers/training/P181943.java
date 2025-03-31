public class P181943 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        int cnt = 0;
        String a = "";
        String b = "";
        String c = "";

        //기존 문자열 출력
        for(cnt = 0; cnt < my_string.length(); cnt++){

            //overwrite 위치까지 출력
            if(cnt >= s) break;

            a += my_string.charAt(cnt);
        }

        b = overwrite_string;

        if(cnt >= s){
            c = my_string.substring(s + overwrite_string.length());
        }

        answer = a + b + c;

        return answer;
    }

    public static void main(String[] args){
        //solution();
    }
}
