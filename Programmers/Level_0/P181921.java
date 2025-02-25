import java.util.Arrays;

public class P181921 {

    public static int[] solution(int l, int r) {
        int[] temp = new int[200000];

        int[] answer = {};
        

        String str_num;
        int cnt = 0;
        int err = 0;
        for(int i = l; i <= r; i++){
        
           str_num = String.valueOf(i);
           err = 0;
           for(int s = 0; s < str_num.length(); s++){
                
             if(!(str_num.charAt(s) == '5' || str_num.charAt(s) == '0')){
                err++;
             } 
           }

           if(err == 0){
            temp[cnt] = Integer.parseInt(str_num);
            cnt++;
           }
        }
        
        answer = Arrays.copyOfRange(temp, 0, cnt);


        if(cnt == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(5, 55);
    }
}
