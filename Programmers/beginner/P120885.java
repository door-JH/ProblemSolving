package Programmers.beginner;

public class P120885 {

    public static String solution(String bin1, String bin2) {
        String temp = "";
        String addStr = "";
        String answer = "";

        int sum = 0;
        boolean isUpper = false; // 올림 수

        //계산 자릿수 맞추기
        if(bin1.length() > bin2.length()){
            for(int q = 0; q < bin1.length() - bin2.length(); q++){
                addStr += "0";
            }
            bin2 = addStr + bin2;
        } else {
            for(int w = 0; w < bin2.length() - bin1.length(); w++){
                addStr += "0";
            }
            bin1 = addStr + bin1;
        }
        
        //계산
        for(int e = bin1.length() - 1; e >= 0; e--){
            sum = ((int) bin1.charAt(e) - '0') + ((int) bin2.charAt(e) - '0');
            if(isUpper) sum++;
            switch (sum) {
                case 3:
                    temp += "1";
                    isUpper = true;
                    break;
                case 2:
                    temp += "0";
                    isUpper = true;
                    break;
                case 1:
                    temp += "1";
                    isUpper = false;
                    break;
                case 0:
                    temp += "0";
                    isUpper = false;
                    break;
                default:
                    break;
            }
        }
        if(isUpper) temp += "1"; //마지막 올림 수 처리

        //출력의 정상화는 역시나 신창섭
        for(int r = temp.length() - 1; r >= 0; r--){
            answer += temp.charAt(r);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        solution("10", "11");
    }
}
