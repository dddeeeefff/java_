import java.util.*;

class RandomEx {
	public static void main(String[] args) {
		Random rand = new Random();

		// 0�̻� 100�̸��� ���� 10���� �������� ���
		for(int i = 0; i < 10; i++){
			int rndNum = rand.nextInt(100);
			// 0�̻� 100�̸��� ������ int������ ����
			System.out.print(rndNum + " ");
		}
		System.out.println();

		// �ּҰ��� �ִ밪�� �Է¹޾� �ּҰ� �̻� �ִ밪 ������ ������ 5�� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("�ּҰ� : "); int num1 = sc.nextInt();
		System.out.print("�ִ밪 : "); int num2 = sc.nextInt();
		 for(int i = 0; i < 5; i++){
			int num = rand.nextInt(num2-num1+1);
			num += num1;
			System.out.print(num + " ");
		 }

	}
}
