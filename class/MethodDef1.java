class MethodDef1 {
	public static void main(String[] args){ //main�޼ҵ尡 �ִ°�� static�� ��� �Ѵ�
	
		System.out.println("���α׷��� ����");

		testMethod(33); // 33�̶�� ���� ������ testMethod()�� ȣ��

		System.out.println("���α׷��� ����");

	}
	public static void testMethod(int age){
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
	}
}
