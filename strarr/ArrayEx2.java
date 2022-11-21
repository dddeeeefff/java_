class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5, 6};
		//배열은 선언 및 생성과 동시에 초기화 시킬 수 있음

		//arrInt 배열을 2, 4, 6으로 출력(가로로)

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
		
		//str의 값을 배열(!)로 만들어 2 4 6 으로 출력
		String[] arrStr = str.substring(2).split(", "); // 배열생성
		for(int i = 0; i < arrStr.length; i++){
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();

		//arrInt 배열을 역순으로 출력(가로로)
		for(int i = arrInt.length-1; i >= 0; i--){
			System.out.print(arrInt[i] + " ");
		}


	}
}
