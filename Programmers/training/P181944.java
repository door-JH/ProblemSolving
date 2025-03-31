import java.util.Scanner;

public class P181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bool = (n % 2 == 0) ? " is even" :  " is odd";
        System.out.print(n + bool);

    }
}
