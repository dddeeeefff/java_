import java.util.*;

class ExceptionUseTry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for(int i = 0; i < 3; i++){
			try{
				System.out.print("������ ���� �� : ");	int n1 = sc.nextInt();
				System.out.print("������ �� : ");		int n2 = sc.nextInt();

				System.out.print("��� ���� �ε��� : ");	int idx = sc.nextInt();

				arr[idx] = n1 / n2;
				System.out.println("������ ��� : " + arr[idx]);
				System.out.println("����� ��ġ : " + idx);
			}catch (ArithmeticException e){
			// try�� �ȿ��� ArithmeticException�� �߻����� ��� ó���ϴ� ����
				System.out.println("������ ���� 0�� �� �� �����ϴ�.");
				i--;
			}catch (ArrayIndexOutOfBoundsException e){
			// try�� �ȿ��� ArrayIndexOutOfBoundsException�� �߻����� ��� ó���ϴ� ����
				System.out.println("��ȿ���� ���� �ε��� �Դϴ�.");
				i--;
			}catch (Exception e){
			// try�� �ȿ��� Exception(��� ������ ����)�� �߻����� ��� ó���ϴ� ����
				System.out.println("����ġ ���� ���ܰ� �߻��߽��ϴ�.");
				i--;
			}
		}

 	}
}
