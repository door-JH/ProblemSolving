public class P181906 {

    public int solution(String my_string, String is_prefix) {
        int answer = 0;

       String[] strs = new String[my_string.length()];

       for(int i = 0; i < my_string.length(); i++){

           strs[i] = my_string.substring(0, i + 1);
           
       }
       

       for(int i = 0; i < my_string.length(); i++){

           if(strs[i].equals(is_prefix)){
               return 1;
           }

       }

       return answer;
   }

    public static void main(String[] args) {
        
    }
}
