public class P181836 {
    
    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        String temp = "";

        int index = 0;

        for(int q = 0; q < picture.length; q++){
            temp = "";
            for(int w = 0; w < picture[q].length(); w++){
                for(int e = 0; e < k; e++){
                    temp += picture[q].charAt(w);
                }
            }
            for(int r = 0; r < k; r++){
                answer[index++] = temp;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        String[] arr = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};       

        for (String string : solution(arr, 2)) {
            System.out.println(string);
            
        }
    }
}
