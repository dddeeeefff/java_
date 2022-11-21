class MethodExam {
	public static void main(String[] args) {
		// 두 개의 정수를 전달받아 두 수의 차를 절대값으로 출력해주는 메소드 작성
		printAbs(10, 5); // 두 수의 차는 5입니다.
		printAbs(10, 25); // 두 수의 차는 15입니다.
	}

	public static void printAbs(int num1, int num2){
		int def = 0; // 두 수의 차를 저장할 변수
//		if(num1 > num2){
//			def = num1 - num2;
//		}else{
//			def = num2 - num1;
//		}
		def = num1 > num2 ? num1 - num2 : num2 - num1;
		System.out.println("두 수의 차는 " + def + "입니다." );
	}
}
