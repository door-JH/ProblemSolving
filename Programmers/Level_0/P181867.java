public class P181867 {
    
    public static int[] solution(String myString) {
        String[] temp = myString.split("x");
        int[] answer = {};


        if(myString.charAt(myString.length() - 1) == 'x'){
            answer = new int[temp.length + 1];
        } else {
            answer = new int[temp.length];
        }

        

        for(int i = 0; i < temp.length; i++){
            answer[i] = temp[i].length();
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("oxooxoxxox");
    }
}
