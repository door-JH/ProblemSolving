public class P181843 {
    
    public int solution(String my_string, String target) {
        int answer = 0;

        int loop = my_string.length() - target.length() + 1;

        for(int q = 0; q < loop; q++){

            if(my_string.substring(q, q + target.length()).equals(target)){
                return 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }

}
