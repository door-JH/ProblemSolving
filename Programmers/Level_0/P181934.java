public class P181934 {

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">")){
            if(eq.equals("=")){
                answer = (n >= m) ? 1 : 0;
            } else {
                answer = (n > m) ? 1 : 0;
            }
        } else {
            if(eq.equals("=")){
                answer = (n <= m) ? 1 : 0;
            } else {
                answer = (n < m) ? 1 : 0;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //solution(null, null, 0, 0);
    }
}
