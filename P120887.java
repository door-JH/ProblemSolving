class P120887{

    public static int solution(int i, int j, int k) {
        int answer = 0;
        String strNum = "";
        for(int q = i; q <= j; q++){
            strNum = Integer.toString(q);
            for(int w = 0; w < strNum.length(); w++){
                if(strNum.charAt(w) == Integer.toString(k).charAt(0)) answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        solution(1, 13, 1);

    }
}