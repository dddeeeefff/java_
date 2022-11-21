class BreakLabel 
{
	public static void main(String[] args) 
	{
		//i와 j의 값이 둘 다 짝수일 경우 출력을 멈춤
		for(int i =1; i < 4; i++){
			for(int j =1; j < 4; j++){
				System.out.println("[" + i + ", "+ j +"]");
				if(i % 2 == 0 && j % 2 == 0) break;
				// 중첩 루프문에서 break는 현재 속한 루프문만을 빠져나감
			}
		}
		System.out.println();



		//label없이 중첩 루프문 빠져나가기
		boolean isEven = false; // 둘 다 짝수인지 여부를 저장할 변수
		for(int i =1; i < 4; i++){
			for(int j =1; j < 4; j++){
				System.out.println("[" + i + ", "+ j +"]");
				if(i % 2 == 0 && j % 2 == 0){
					isEven = true;
					break; // 안쪽 빠져나가기
				} 
			}
			if (isEven) break; // 바깥쪽 빠져나가기
		}
		System.out.println();
		


		outerLoop: // 특정 루프문을 표시해주는 레이블(label)
		for(int i =1; i < 4; i++){
			for(int j =1; j < 4; j++){
				System.out.println("[" + i + ", "+ j +"]");
				if(i % 2 == 0 && j % 2 == 0) break outerLoop;
			}
		}

	}
}
