public class P181917 {

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        answer = (x1 || x2) && (x3 || x4);

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
