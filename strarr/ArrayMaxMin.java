import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
			System.out.print(i + 1 + "��° ���� : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("�ּҰ� : " + minValue(arr));

		System.out.println("�ִ밪 : " + maxValue(arr));
	}

	/*
	����
	�迭�� �޴� �޼ҵ� ���� -> �ʱⰪ ���� -> foreach������ �� ��� �� �� ��� -> �������� ����
	*/

	// �迭�� �μ��� �޾� �����͵� �� �ּҰ��� ã�� �����ϴ� MinValue() �޼ҵ� �ۼ�
	public static int minValue(int[] arr){
		int min = arr[0];
		// arr�迭�� �ּҰ��� ó���� ������ �迭�� ù��° ���� �����Ͽ� �ٸ� ����� ���ϸ鼭 �۾��� ��
		for(int i = 1; i < arr.length; i++){
			if(min > arr[i]) min = arr[i];
			//�迭�� ���� ��(i�ε���)�� min������ ������ ������ min�� �迭�� ���� ���� ����
		}
		return min;
	}


	// �迭�� �μ��� �޾� �����͵� �� �ִ밪�� ã�� �����ϴ� MaxValue() �޼ҵ� �ۼ�
	public static int maxValue(int[] arr){
		int max = arr[0];
		// arr�迭�� �ִ밪�� ó���� ������ �迭�� ù��° ���� �����Ͽ� �ٸ� ����� ���ϸ鼭 �۾��� ��
		for(int num : arr){
			if(num > max){
				max = num;
				//�迭�� ���� ��(i�ε���)�� max������ ������ ũ�� max�� �迭�� ���� ���� ����
			}
		}
		return max;
	}

}
