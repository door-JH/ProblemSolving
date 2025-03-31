public class P181834 {
    
    public String solution(String myString) {
        String answer = "";

        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) <= 'l'){
                answer += 'l';
            } else {
                answer += myString.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println('a' < 'l');
    }
}
