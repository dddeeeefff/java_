class MethodReturn2 {
	public static void main(String[] args) {
		divide(4, 2); // 2
		divide(0, 2); // 0
		divide(4, 0); // 예외발생으로 작업 중단
	}
	public static void divide(int n1, int n2){
		if(n2 == 0){
			System.out.println("0으로는 나눌 수 없습니다.");
			return; // void 메소드에서 사용될 경우 메소드를 강제로 종료
		}
		System.out.println("나눗셈 결과 : " + n1 / n2);
	}
}
