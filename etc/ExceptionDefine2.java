import java.util.*;

class AgeInputException extends Exception{
	public AgeInputException(){
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class ExceptionDefine2 {
	public static void main(String[] args) throws AgeInputException {
	// throws AgeInputException : �� �޼ҵ忡���� AgeInputException ���ܰ� �߻��ص� ó������ �ʰڴٴ� �ǹ�
	// ����ó���� �� �޼ҵ�(main())�� ȣ���� ��(JVM)���� �ѱ�� ���
		System.out.print("���� �Է� : ");
		int age = readAge();
		System.out.println("����� " + age + "�� �Դϴ�.");
	}
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 0){
			AgeInputException ex = new AgeInputException();
			throw ex;
		}
		return age;
	}
}
