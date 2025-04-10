package Programmers.beginner;

import java.math.BigInteger;

public class P120840 {
    public static int solution(int balls, int share) {

        BigInteger llongA = new BigInteger("1");

        long a = 1;
        long b = 1;

        for(int q = share + 1; q <= balls; q++){
            llongA = llongA.multiply(BigInteger.valueOf(q));
        }

        for(int w = 1; w <= balls - share; w++){
            b *= w;
        }
       
        
        return llongA.divide(BigInteger.valueOf(b)).intValue();
    }

    public static void main(String[] args) {
       System.out.println(solution(30, 15));
    }
}
