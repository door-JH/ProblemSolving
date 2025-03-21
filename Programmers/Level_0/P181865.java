public class P181865 {
    
    public static int solution(String binomial) {
        int answer = 0;
        String[] formula = binomial.split(" ");
        int a = Integer.parseInt(formula[0]);
        int b = Integer.parseInt(formula[2]);
        String op = formula[1];

        switch (op) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            default:
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
