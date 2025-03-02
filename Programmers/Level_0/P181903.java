public class P181903 {

    public static String solution(int q, int r, String code) {
        String answer = "";


        for(int i = 0; i < code.length(); i++){
            
            if(i % q == r){
                answer += code.charAt(i);
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(1 % 1);
    }
}
