public class P181838 {
    
    public static int solution(int[] date1, int[] date2) {
        int answer = 0;

        String date1_str = "";
        String date2_str = "";

        for(int i = 0; i < date1.length; i++){
            date1_str += Integer.toString(date1[i]);
            date2_str += Integer.toString(date2[i]);
        }

        if(Integer.parseInt(date1_str) < Integer.parseInt(date2_str)) return 1;

        return answer;
    }

    public static void main(String[] args) {

        int[] date1 = {2022, 1, 1};
        int[] date2 = {2021, 12, 31};

        solution(date1, date2);
    }
}
