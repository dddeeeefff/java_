class MethodPrimeNumber{
	public static void main(String[] args) {
		/*
		1~100사이의 정수들 중 소수를 구하여 출력
		단, 전달된 값이 소수인지 여부를 판단하는 메소드를 제작하여 작업
		*/
		for(int i = 1; i <= 100; i++){
			if(isPrime(i)){
				System.out.print(i +"  ");				
			}
		}

	}
	public static boolean isPrime(int n){
	// 받아온 정수(n)가 소수인지 여부를 리턴하는 메소드 -> 아닌것부터 처리
		if(n == 1 || (n != 2 && n % 2 == 0 )){
		// n의 값이 1이거나 2가 아니면서 짝수인 경우는 소수가 아님
			return false;
		}
		for(int i = 2; i <= n / 2; i++){
		//몫은 나눌수의 반보다 작아야 하므로 /2
			if(n % i == 0) return false;
		}
		return true;
	}
}
