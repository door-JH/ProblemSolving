import java.util.Arrays;

public class P181851 {

    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[rank.length];
        int[] invite = new int[3];
        int index = 0;
        
        temp = Arrays.copyOfRange(rank, 0, rank.length);
        Arrays.sort(temp);
       
        for(int q = 0; q < temp.length; q++){
            
            for(int w = 0; w < rank.length; w++){
                if(temp[q] == rank[w] && attendance[w] && index < invite.length){
                    invite[index++] = w;  
                }
            }
        }

        answer = 10000 * invite[0] + 100 * invite[1] + invite[2];

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] arr2 = {false, true, true, true, true, false, false};
        solution(arr1, arr2);
    }
}
