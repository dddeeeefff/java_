class NumberEx1{
		int num;
		public NumberEx1(){
			num = 10;
			System.out.println("������ ȣ��!!");
		}
		//public NumberEx1(){} // ����Ʈ �����ڷ� �����ڸ� ���� �������� ������ JVM�� �ڵ����� ������ִ� ������
		public int getNumber(){ return num; }
}

class NumberEx2{
		int num;
		public NumberEx2(int n){
			num = n;
			System.out.println("������ ȣ��2!!");
		}
		public int getNumber(){ return num; }
}


class ConstructorEx {
	public static void main(String[] args) {
		NumberEx1 num1 = new NumberEx1();
		// NumberEx1�� �ν��Ͻ� num1�� ���� �� ����(NumberEx1 Ŭ������ ������ ȣ��)
		System.out.println("num1 : " + num1.getNumber());

		NumberEx2 num2 = new NumberEx2(17);
		System.out.println("num2 : " + num2.getNumber());
	}
}
