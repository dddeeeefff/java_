import java.util.*;

class ExceptionUseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		// �迭���� ������ ���� ������ ����?

		/*int num1, num2, div;

		System.out.println("������ ���� ���� �Է��Ͻÿ� : ");
		int num1  = sc.nextInt();

		System.out.println("������ ���� �Է��Ͻÿ� : ");
		int num2  = sc.nextInt();

		System.out.println(num1 / num2);*/

		// ������ ���� ���� ������ ���� �Է¹޾� ������ �۾� �� ������ �ε��� ��ȣ�� �޾� �迭�� ����(�� 3��)
		for(int i = 0; i < 3; i++){
			System.out.print("������ ���� �� : ");	int n1 = sc.nextInt();
			System.out.print("������ �� : ");		int n2 = sc.nextInt();

			if(n2 == 0){
				System.out.println("������ ���� 0�� �� �� �����ϴ�.");
				i--;
				continue;
			}

			System.out.print("��� ���� �ε��� : ");	int idx = sc.nextInt();

			if(idx < 0 || idx >= arr.length){
				System.out.println("��ȿ���� ���� �ε��� ��ȣ�Դϴ�.");
				i--;
				continue;
			}

			arr[idx] = n1 / n2;
			System.out.println("������ ��� : " + arr[idx]);
			System.out.println("����� ��ġ : " + idx);
		}

 	}
}
