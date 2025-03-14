public class P181878 {

    public static int solution(String myString, String pat) {
        int answer = 0;
        boolean is_same = true;
        String temp = "";

        if(myString.length() < pat.length()) return 0;

        
        for(int q = 0; q < myString.length() - pat.length() + 1; q++){
            is_same = true;
            for(int w = 0; w < pat.length(); w++){
                
                
                if(pat.charAt(w) < 'a'){
                    temp = (myString.charAt(w) + "").toUpperCase();
                } else if(pat.charAt(w) > 'Z') {
                    temp = (myString.charAt(w) + "").toLowerCase();
                } else {
                    temp = (myString.charAt(w) + "");
                }

                if(temp.charAt(0) != pat.charAt(w)) is_same = false;

            }
            if(is_same) return 1;
        }


        return answer;
    }


    public static void main(String[] args) {
      
        System.out.println(solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz"));
    }
}
