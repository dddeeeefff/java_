class RuntimeExceptionCase {
	public static void main(String[] args) {
		try{
			int arr[] = new int[3];
			arr[-1] = 20;
		}
		catch (ArrayIndexOutOfBoundsException e){
		// 배열의 인덱스 번호가 범위를 벗어났을 경우 발생하는 예외
			System.out.println(e.getMessage()); // -1
		}

		try{
			Object obj = new int[10];
			String str = (String)obj;
		}
		catch (ClassCastException e){
		// 형변환이 불가능한 객체를 형변화 시킬 때 발생하는 예외
			System.out.println(e.getMessage()); // [I cannot be cast to java.lang.String
		}

		try{
			int arr[] = new int[-10];
		}
		catch (NegativeArraySizeException e){
		// 배열의 크기를 음수로 입력했을 때 발생하는 에러
			System.out.println(e.getMessage()); // null
		}

		try{
			String str = null;
			int len = str.length();
		}
		catch (NullPointerException e){
		// 객체가 비어있을 때 객체를 사용하는 경우 발생하는 예외
			System.out.println(e.getMessage()); // null
		}
	}
}
