import java.util.*;

class AgeInputException extends Exception{
// Exception Ŭ������ ��ӹ޾����Ƿ� AgeInputException Ŭ������ ���� Ŭ������ ��
	public AgeInputException(){
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
		//getMessage() �޼ҵ�� ������ ���� �޽����� �Ű������� �Ͽ� ����Ŭ����(Exception) �����ڸ� ȣ��
	}
}

class ExceptionDefine1 {
	public static void main(String[] args) {
		System.out.print("���� �Է� :");

		try{
			int age = readAge();
			System.out.println("����� " + age + "�� �Դϴ�.");
		}
		catch (AgeInputException e){
			System.out.println(e.getMessage());
		}
	}
	public static int readAge() throws AgeInputException{
	// throws AgeInputException : �� �޼ҵ忡���� AgeInputException ���ܰ� �߻��ص� ó������ �ʰڴٴ� �ǹ�
	// ����ó���� �� �޼ҵ带 ȣ���� ������ �ѱ�� ����� throws - ����ó���� try-catch�� �ؾ� ��
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 0){
			AgeInputException ex = new AgeInputException();
			// AgeInputException �� �ν��Ͻ� ex�� ����(���ܰ� �����Ȱ����� ���� �߻��� �ƴ�)
			throw ex;
			// ex�� ����ִ� AgeInputException ���ܰ� �߻��ߴٰ� JVM���� �˸��� ����
			// throws�� ����Ǹ� JVM�� ����ó���� �����ϰ� �� 
		}
		return age;
	}
}
