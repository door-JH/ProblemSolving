public class P181874 {

    public static String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                
                answer += (myString.charAt(i) + "").toUpperCase();
            } else {
                answer += (myString.charAt(i) + "").toLowerCase();
            }

        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
