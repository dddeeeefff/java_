import java.util.*;

class CoinFlippingTest {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");

		// ������ �Է¹޾� ������ŭ�� ���� ����(50)�� ����� �� ¦���� Ȧ���� �� ������ ���

		/*
		��� ��
		1 2 3 4 5 6 7 8 9 10
		¦�� : 5 / Ȧ�� : 5
		*/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // ���� �Է�
		int arr[] = new int[num]; // �Է��� ������ŭ ���ڸ� ���� �迭 ����
		Random ran = new Random(); // �����Լ� �ν��Ͻ� ����
		for(int i = 0; i < arr.length; i++){
			int tmp = ran.nextInt(50); // 1 ~ 100���� �������ڴ� tmp�� ����
			arr[i] = tmp; // tmp�� ���� �迭�� �߰�
			System.out.print(arr[i] + " ");
		}
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				count1++;
			}else if(arr[i] % 2 == 1){
				count2++;
			}
		}
		System.out.println();
		System.out.println("¦�� : " + count1 + "/ Ȧ�� : " + count2);
	}
}
