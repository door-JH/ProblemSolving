package Programmers.beginner;




public class P120838 {
    static final String[] morses = {
    ".-","-...","-.-.","-..",".","..-.",
    "--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-",
    "-.--","--.."
    };
    

    public static String solution(String letter) {
        String answer = "";
        String[] letterArr = letter.split(" ");
        
        for(int q = 0; q < letterArr.length; q++){
            
            for(int w = 0; w < morses.length; w++){
                
                if(letterArr[q].equals(morses[w])){
                    answer += (char) (97 + w);
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
       solution(".... . .-.. .-.. ---");
    }
}
