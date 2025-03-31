public class P181835 {

    public static int[] solution(int[] arr, int k) {
        boolean is_even = k % 2 == 0 ? true : false;
        
        for(int i = 0; i < arr.length; i++){
            if(is_even){
                arr[i] += k;
            } else {
                arr[i] *= k;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        
    }
}
