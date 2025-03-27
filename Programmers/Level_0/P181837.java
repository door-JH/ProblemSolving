public class P181837 {
    
    public static int solution(String[] order) {
        int answer = 0;
        
        int loop = 0;
        for(int i = 0; i < order.length; i++){
            
            loop = order[i].length() - 5 + 1;
            for(int s = 0; s < loop; s++){
                if(order[i].substring(s, s + 5).equals("latte")){
                    answer += 500;
                }
            }
            answer += 4500;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        solution(arr);
    }
}
