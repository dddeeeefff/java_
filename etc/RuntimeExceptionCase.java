class RuntimeExceptionCase {
	public static void main(String[] args) {
		try{
			int arr[] = new int[3];
			arr[-1] = 20;
		}
		catch (ArrayIndexOutOfBoundsException e){
		// �迭�� �ε��� ��ȣ�� ������ ����� ��� �߻��ϴ� ����
			System.out.println(e.getMessage()); // -1
		}

		try{
			Object obj = new int[10];
			String str = (String)obj;
		}
		catch (ClassCastException e){
		// ����ȯ�� �Ұ����� ��ü�� ����ȭ ��ų �� �߻��ϴ� ����
			System.out.println(e.getMessage()); // [I cannot be cast to java.lang.String
		}

		try{
			int arr[] = new int[-10];
		}
		catch (NegativeArraySizeException e){
		// �迭�� ũ�⸦ ������ �Է����� �� �߻��ϴ� ����
			System.out.println(e.getMessage()); // null
		}

		try{
			String str = null;
			int len = str.length();
		}
		catch (NullPointerException e){
		// ��ü�� ������� �� ��ü�� ����ϴ� ��� �߻��ϴ� ����
			System.out.println(e.getMessage()); // null
		}
	}
}
