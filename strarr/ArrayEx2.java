class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5, 6};
		//�迭�� ���� �� ������ ���ÿ� �ʱ�ȭ ��ų �� ����

		//arrInt �迭�� 2, 4, 6���� ���(���η�)

//		for(int i = 0; i < arrInt.length; i++){
//			if(arrInt[i] % 2 == 0){
//				System.out.print(arrInt[i]);
//			}else if(arrInt[i] % 2 == 1 && arrInt[i] > 1){
//				System.out.print(", ");
//			}
//			
//		}
		String str = "";
		for(int i = 1; i < arrInt.length; i += 2){
//			str += arrInt[i] + ", " ;
			str += ", " + arrInt[i];
		}
//			System.out.print(str.substring(0, str.length()-2));
			System.out.print(str.substring(2));
			System.out.println();
		
		//str�� ���� �迭(!)�� ����� 2 4 6 ���� ���
		String[] arrStr = str.substring(2).split(", "); // �迭����
		for(int i = 0; i < arrStr.length; i++){
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();

		//arrInt �迭�� �������� ���(���η�)
		for(int i = arrInt.length-1; i >= 0; i--){
			System.out.print(arrInt[i] + " ");
		}


	}
}
