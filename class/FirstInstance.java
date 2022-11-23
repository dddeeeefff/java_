class NumberEx{
	int num = 0; // ��������� NumberEx���� �����Ӱ� ��밡��
	public void addNum(int n){
		num += n;
	}
	public int getNumber(){
		return num;
	}
}


class FirstInstance { // main() �޼ҵ尡 �ִ� ���� Ŭ���� �̸�
	public static void main(String[] args) {
		NumberEx nInst;
		//NumberEx�� �ν��Ͻ� nInst�� ����(�޸𸮿� ������ ���� �ʰ� �ּҸ� ����� ����)
		nInst = new NumberEx();
		// �����ߴ� NumberEx�� �ν��Ͻ� nInst�� ����(����� ��ϵ� �޸� �ּҿ� ���� ������ �־� ������ ����)
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber()); // 0
		// nInst.getNumber() : nInst �ν��Ͻ� �ȿ� �ִ� getNumber() �޼ҵ带 ȣǮ(����)�϶�� ���
		nInst.addNum(10);
		// nInst.addNum(10) : nInst �ν��Ͻ� �ȿ� �ִ� addNum() �޼ҵ带 10�� ������ ȣ��
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber()); // 10

		NumberEx nInst2 = new NumberEx();
		//NumberEx�� �ν��Ͻ� nInst2�� ���� �� ����

		nInst2.addNum(100);
		System.out.println("nInst2 : " + nInst2.getNumber());

		int test = 10;
		testMethod(test);
		System.out.println("test : " + test); // 10
		// �޼ҵ忡�� ����� �μ��� ����(�⺻ �ڷ���)�� ������ ��� ������ ���� �����ؼ� ������(���� ���� �Ұ�)

		testMethod2(nInst);
		System.out.println("nInst : " + nInst.getNumber()); // 22
		// �޼ҵ��� �μ��� �ν��Ͻ��� ������ ��� �ν��Ͻ��� ���� �ش��ϴ� �ּҰ��� �����ؼ� ������
		// �ּҸ� �������� ������ �� �ּҿ� �ش��ϴ� �ν��Ͻ��� ������ �����ϰ� ��(������ �����)
	}
	public static void testMethod(int num){
		num += 12;
	}

	public static void testMethod2(NumberEx num){
		num.addNum(12);
	}
}
