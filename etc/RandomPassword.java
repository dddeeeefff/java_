import java.util.*;

class RandomPassword {
	public static void main(String[] args) {
		// �� 10���� �ӽ� ��ȣ ����(���� + ����) : ù���ڴ� ������ ����
		// ���� -> 1. String �迭����   2. �Է� �޼ҵ� �߰�
		Random rnd = new Random();

		char[] arr = {'a','b','c','d','e','f','g','h','i','g','k','l','m','n','o','p',
		'q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		String pwd = arr[rnd.nextInt(26)] + ""; // ù���ڸ� arr�迭�� �����ڵ� �߿��� ����
		for(int i = 1; i < 10; i++){
			pwd += arr[rnd.nextInt(arr.length)];
		}
		System.out.println(pwd.toUpperCase());
		

		// 1~10 ������ ������ �� 3���� �������� ���� : ��, Ȧ���� ¦������ 2�� ���� Ȯ���� ���;� ��
		int[] arrInt = {1,2,3,4,5,6,7,8,9,10,1,3,5,7,9};
		for(int i = 0; i < 3; i++){
			System.out.print(arrInt[rnd.nextInt(arrInt.length)] + " ");
		}
	}
}
