import java.util.*;

class CoinFlippingTestt {
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
		int amount = sc.nextInt();

		int[] arrNum = new int[amount];
		int even = 0, odd = 0;
		for(int i = 0; i < amount; i++){
			arrNum[i] = (int)(Math.random() * 50 + 1);
			System.out.print(arrNum[i] + " ");
			if(arrNum[i] % 2 == 0) even++;
			else	odd++;
		}
		System.out.println("\n¦�� : " + even + ", Ȧ�� : " + odd);
		

	}
}
