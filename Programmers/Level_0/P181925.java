public class P181925 {

    public String solution(int[] numLog) {
        String answer = "";

        for(int i = 0; i < numLog.length - 1; i++){
            
            switch (numLog[i] - numLog[i + 1]) {
                case -1:
                    answer += 'w';
                    break;
                case 1:
                    answer += 's';
                    break;
                case -10:
                    answer += 'd';
                    break;
                case 10:
                    answer += 'a';
                    break;
                default:
                    break;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
    
}
