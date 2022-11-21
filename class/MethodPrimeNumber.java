class MethodPrimeNumber{
	public static void main(String[] args) {
		/*
		1~100������ ������ �� �Ҽ��� ���Ͽ� ���
		��, ���޵� ���� �Ҽ����� ���θ� �Ǵ��ϴ� �޼ҵ带 �����Ͽ� �۾�
		*/
		for(int i = 1; i <= 100; i++){
			if(isPrime(i)){
				System.out.print(i +"  ");				
			}
		}

	}
	public static boolean isPrime(int n){
	// �޾ƿ� ����(n)�� �Ҽ����� ���θ� �����ϴ� �޼ҵ� -> �ƴѰͺ��� ó��
		if(n == 1 || (n != 2 && n % 2 == 0 )){
		// n�� ���� 1�̰ų� 2�� �ƴϸ鼭 ¦���� ���� �Ҽ��� �ƴ�
			return false;
		}
		for(int i = 2; i <= n / 2; i++){
		//���� �������� �ݺ��� �۾ƾ� �ϹǷ� /2
			if(n % i == 0) return false;
		}
		return true;
	}
}
