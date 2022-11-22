class Aa{
	public void testC(){  }
	public void testA(){System.out.println("Aa's test");}
	public void rideMethod(){System.out.println("Aa's method");}
	public void loadMethod(){System.out.println("void method");} // -
}

class Bb extends Aa{
	public void testB(){System.out.println("Bb's test");}
	public void rideMethod(){System.out.println("Bb's method");}			// �������̵�
	public void loadMethod(int n){System.out.println("int method");}		// �����ε�
}

class Cc extends Bb{
	public void testC(){System.out.println("Cc's test");}
	public void rideMethod(){System.out.println("Cc's method");}			// �������̵�  -
	public void loadMethod(double n){System.out.println("double method");}	// �����ε�
}

class RideAndLoad {
	public static void main(String[] args) {
		Aa ref1 = new Cc();		Bb ref2 = new Cc();		Cc ref3 = new Cc();
		// ����Ŭ���������� �ν��Ͻ��� ���� �� ����Ŭ���������� ������ �� ����
		// ��, ����Ŭ���������� ������ �ν��Ͻ����� ����Ŭ������ �ν��Ͻ��� ����� �� ���� 
		// JVM���� ���� �ν��Ͻ��� �ڷ����� ����Ŭ������ �ƴ� ������ ����Ŭ������ �ڷ������� �ν��Ͽ� ����Ŭ������ �޼ҵ�鸸 ��밡��
		// ��, �������̵��� �޼ҵ忡 ���ؼ��� ����Ŭ������ �޼ҵ尡 �����
		/*
		ref1.testA(): ���డ��
		ref1.testB(), ref1.testC() : ����Ұ�
		 - ref1�� AaŬ���������� JVM�� �νĵǹǷ� AaŬ���� �޼ҵ常 �ν�
		
		
		
		ref2.testA()�� ref2.testB() : ���డ��
		ref2.testC() : ����Ұ� - ref2�� BbŬ���������� JVM�� �νĵǹǷ� BbŬ���� �޼ҵ常 �ν�
		

		ref3�ν��Ͻ��δ� ref3.testA(), ref3.testB(), ref3.testC() ��� ���డ��
		*/

		ref1.rideMethod();		ref2.rideMethod();		ref3.rideMethod();
		//Cc's Method			Cc's Method				Cc's Method
		// ����Ŭ������ �����ϰ� ����Ŭ������ ������ �ν��Ͻ��� ����Ŭ������ �޼ҵ忡�� ������ �����ϳ�
		// �������̵��� �޼ҵ忡�� ���������� ������Ŭ������ �������̵��� �޼ҵ尡 �����
	
		ref3.loadMethod();		ref3.loadMethod(1);		ref3.loadMethod(3.14);
		//void method			int method				double method
		//������ Ŭ������ �ν��Ͻ����� ����Ŭ�������� �����Ͽ� �̸��� ���� �����ε��� �޼ҵ���� ����� �� ����

		// Cc Ŭ������ testC() �޼ҵ带 ref1 �ν��Ͻ��� �̿��Ͽ� �����Ŵ (Aa�� �߰��Ͽ� ����)
		ref1.testC();
		System.out.println();

		Cc ref4 = (Cc)ref1;
		// ref1�� Cc�� �ν��Ͻ��� ����ȯ
		ref3.testC();

	}
}
