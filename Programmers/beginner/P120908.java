package Programmers.beginner;

public class P120908 {

    public int solution(String str1, String str2) {
        int answer = 2;
        int loop = str1.length() - str2.length() + 1;

        for(int i = 0; i < loop; i++){
            if(str1.substring(i, i + str2.length()).equals(str2)) answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
