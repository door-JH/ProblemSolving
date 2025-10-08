package Programmers.Recommend.Conditional_Statements;

public class P12921 {

    public int solution(int n) {
		boolean[] isNotPrime = new boolean[n + 1]; //false - 소수후보
		isNotPrime[0] = isNotPrime[1] = true; //0, 1은 소수가 아니다.
		
		for(int i = 2; i * i <= n; i++){ //제곱근까지만 확인 ex) 36 = 6 * 6
				if(!isNotPrime[i]) { // i가 소수라면
				// i의 배수를 모두 제거
					for(int j = i * i; j <= n; j += i){
						isNotPrime[j] = true;
					}
				}
		}
		
		int answer = 0;
		for(int i = 2; i <= n; i++){
			if(!isNotPrime[i]) answer++;
		}
		return answer;
	}
}
