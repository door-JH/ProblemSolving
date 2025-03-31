public class P181841 {
    
    public static String solution(String[] str_list, String ex) {
        String answer = "";
        boolean is_match = false;
        int loop = 0;
        for(int q = 0; q < str_list.length; q++){
            is_match = false;
            loop = str_list[q].length() - ex.length() + 1;

            for(int w = 0; w < loop; w++){
                if(str_list[q].substring(w, w + ex.length()).equals(ex)) is_match = true;
            }
            
            if(!is_match) answer += str_list[q];

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
