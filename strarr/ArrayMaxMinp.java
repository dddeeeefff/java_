class ArrayMaxMinp {
	public static void main(String[] args) {
		int[] arr = {2, 5, 3, 7, 6};


		System.out.println("�ּҰ� : " + minValue(arr));

		System.out.println("�ִ밪 : " + maxValue(arr));
	}

	/*
	����
	�迭���� �޴� �޼ҵ� ���� -> �ʱⰪ ���� -> foreach������ �� ��� �� -> �������� ����
	*/

	// �迭�� �μ��� �޾� �����͵� �� �ּҰ��� ã�� �����ϴ� MinValue() �޼ҵ� �ۼ�

	public static int minValue(int[] arr){
		int min = arr[0];
		for(int num : arr){
			if(num < min){
				min = num;
			}
		}
		return min;
	}


	// �迭�� �μ��� �޾� �����͵� �� �ִ밪�� ã�� �����ϴ� MaxValue() �޼ҵ� �ۼ�

	public static int maxValue(int[] arr){
		int max = arr[0];
		for(int num : arr){
			if(num > max){
				max = num;
			}
		}
		return max;
	}

}
