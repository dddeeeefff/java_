class StringEx5p {
	public static void main(String[] args) {
	// 1 ~ 1000 ������ ���� �� 8�� ����ִ� ������ ������ ���Ͽ� ���
		int intArr[] = new int[1001];
		int count = 0;
		for(int i = 0; i < intArr.length; i++){
			intArr[i] = i;
			String strArr = Integer.toString(intArr[i]);
			if(strArr.contains("8") == true) count++;

		}
		System.out.println("8�� ����ִ� ������ ���� : " + count);
	}
}
