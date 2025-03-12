public class P181890 {
    
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        String forward = "";
        int cnt = 0;

        //l r 찾기, 방향에 따른 문자개수 카운팅
        for(int q = 0; q < str_list.length; q++){
            if(str_list[q].equals("l")){
                cnt = q;
                forward = str_list[q]; // l
                break;
            } else if(str_list[q].equals("r")){
                forward = str_list[q]; // r
                for(int w = q + 1; w < str_list.length; w++){
                    cnt++;
                }
                break;
            }
        }

        //배열 값 지정
        if(cnt == 0){
            return answer;
        } else {
            answer = new String[cnt];
            if(forward.equals("l")){
                for(int q = 0; q < cnt; q++){
                    answer[q] = str_list[q];
                }
                return answer;
            } else if(forward.equals("r")){
                int idx = 0;
                for(int w = str_list.length - cnt; w < str_list.length; w++){
                    answer[idx++] = str_list[w];
                }
                return answer;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"r", "u", "u"};
        
        solution(str);
        
    }

}
