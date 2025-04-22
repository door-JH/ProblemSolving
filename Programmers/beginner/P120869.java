package Programmers.beginner;

import java.util.Arrays;

public class P120869 {
    
    public static int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String cmp = String.join("", dic);
        char[] str_arr = {};
        int answer = 2;
        String dicStr = "";


        for(int q = 0; q < dic.length; q++){
            str_arr = dic[q].toCharArray();
            Arrays.sort(str_arr);
            dicStr = new String(str_arr);
            System.out.println(cmp + " " + dicStr);
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        solution(arr, dic);
    }
}
