package Programmers.beginner;



public class P120894 {

    public static long solution(String numbers) {
        long answer = 0;
        String num_str = "";
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        int index = 0;
        int length = 2;
        String cmp = "";

        boolean isFind = false;
        
        while(index != numbers.length()){
            cmp = numbers.substring(index, index + length);
            for(int q = 0; q < arr.length; q++){
                if(cmp.equals(arr[q])){
                    isFind = true;
                    num_str += q;
                }
            }

            if(isFind){
                index += length;
                length = 2;
                isFind = false;
                
            } else {
                length++;
            }
        }
        answer = Long.parseLong(num_str);

        return answer;
    }
    
    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");
    }
}
