class StringEx1 {
	public static void main(String[] args) {
		String str1 = "test";
		String str2 = "test";
		String str3 = new String(str2);
		String str4 = new String("test");

		if(str1 == str2) System.out.println("���� �ν��Ͻ� ����"); //0
		else			 System.out.println("�ٸ� �ν��Ͻ� ����");
		if(str2 == str3) System.out.println("���� �ν��Ͻ� ����");
		else			 System.out.println("�ٸ� �ν��Ͻ� ����"); //0
		if(str1 == str3) System.out.println("���� �ν��Ͻ� ����");
		else			 System.out.println("�ٸ� �ν��Ͻ� ����"); //0
		if(str3 == str4) System.out.println("���� �ν��Ͻ� ����");
		else			 System.out.println("�ٸ� �ν��Ͻ� ����"); //0
		//�ν��Ͻ��� '=='�� ���� ��� �ȿ� �ִ� �����Ͱ� �ƴ� �ּҰ����� ���ϹǷ� ��Ȯ�� �񱳰� �����

		//�׷��Ƿ� ������ �ν��Ͻ��� �񱳴� compareTo()�� equal() �޼ҵ�� �ؾ� ��
		if(str1.compareTo(str2) == 0) System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str2.compareTo(str3) == 0) System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str1.compareTo(str3) == 0) System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str3.compareTo(str4) == 0) System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");

		if(str1.equals(str2))		  System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str2.equals(str3))		  System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str1.equals(str3))		  System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
		if(str3.equals(str4))		  System.out.println("������ ���ڿ�"); //0
		else						  System.out.println("�ٸ� ���ڿ�");
	}
}
