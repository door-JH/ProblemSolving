package Programmers.beginner;

public class P120956 {
    
    public static int solution(String[] babbling) {
        int answer = 0;
        
        String[] patterns = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < patterns.length; i++){
            for(int j = 0; j < babbling.length; j++){
                if(babbling[j].contains(patterns[i])){
                    babbling[j] = babbling[j].replaceFirst(patterns[i], " ");
                }
            }
        }

        for(String str : babbling){
            if(str.trim().isEmpty()){
                answer++;
            }
        }

        return answer;
    }



    public static void main(String[] args) {

        String[] arr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        solution(arr);
    }
}
