package Programmers.beginner;


public class P120883 {

    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
    

        for(int q = 0; q < db.length; q++){
            if(id_pw[0].equals(db[q][0])){
                answer = "wrong pw";
                if (id_pw[1].equals(db[q][1])) {
                    answer = "login";
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
