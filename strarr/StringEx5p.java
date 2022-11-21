class StringEx5p {
	public static void main(String[] args) {
	// 1 ~ 1000 사이의 정수 중 8이 들어있는 숫자의 개수를 구하여 출력
		int intArr[] = new int[1001];
		int count = 0;
		for(int i = 0; i < intArr.length; i++){
			intArr[i] = i;
			String strArr = Integer.toString(intArr[i]);
			if(strArr.contains("8") == true) count++;

		}
		System.out.println("8이 들어있는 숫자의 개수 : " + count);
	}
}
