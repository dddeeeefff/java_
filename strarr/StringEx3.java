class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";  String str2 = "testabc.com";
		String str3 = "test@abccom";   String str4 = "test.abc@com";

		emailTest(str1);  emailTest(str2);  emailTest(str3);  emailTest(str4);

	}

	public static void emailTest(String email){
	/*
	�޾ƿ� email�� �˻��Ͽ� �̸��� �ּҰ� �´��� ���
	1. �ݵ�� '@'�� �־�� �� : indexOf()�� -1�� �ƴ��� ����
	2. �ݵ�� '.'�� �־�� �� : indexOf()�� -1�� �ƴ��� ����
	3. �ݵ�� '@'�� '.'���� �տ� �־�� �� : indexOf()�� ��ġ�� ��
	*/

	//int dot = email.lastIndexOf('.');
	//int pop = email.lastIndexOf('@');
	//if(dot > pop && email.contains(".") && email.contains("@")){
	//	System.out.println(email +"�� �̸��� ����");
	//}else{
	//	System.out.println(email +"�� �̸��� �ƴ�");
	//}
	
	int at = email.indexOf('@'); // email���� '@'�� ��ġ �ε��� ��ȣ
	int dot = email.indexOf('.'); // email���� '.'�� ��ġ �ε��� ��ȣ

	if(at == -1){
		System.out.println(email + "�� '@'�� �����ϴ�.");
	}else if(dot == -1){
		System.out.println(email + "�� '.'�� �����ϴ�.");
	}else if(at > dot){
		System.out.println(email + "�� '@'�� '.'���� �ڿ� �ֽ��ϴ�.");
	}else{
		System.out.println(email + "�� �̸����� �½��ϴ�");
	}
}
}