class FinallyTest {
	public static void main(String[] args) {
		boolean isDiv = divider(4, 2);
		if(isDiv) System.out.println("���� ����");
		else	  System.out.println("���� ����");

		isDiv = divider(4, 0);
		if(isDiv) System.out.println("���� ����");
		else	  System.out.println("���� ����");
	}

	// divider() �޼ҵ� �۾� : �� ���� ������ �޾� �������� �ϰ� �� ����� ��� �� true�� ����
	// ���� �߻��ÿ��� false�� ����
	public static boolean divider(int n1, int n2){
		try{
		int result = n1 / n2;
		System.out.println("������ ��� : " + result);
		return true;
		}
		catch (ArithmeticException e){
			e.printStackTrace();
			return false;
		}finally{
		// ���� �߻� �� return ���� ���ο� ������� �����ϴ� ����
			System.out.println("finally ���� ����");
		}
	
	}
}
