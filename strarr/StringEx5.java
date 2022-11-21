class StringEx5 {
	public static void main(String[] args) {
		// 1 ~ 1000 사이의 정수 중 8이 들어있는 숫자의 개수를 구하여 출력

		int count = 0; //8이 들어있는 숫자의 개수를 저장할 변수
		for(int i = 1; i <= 1000; i++){
			String tmp = i + "";
			if(tmp.indexOf('8') >= 0) count++;
			//tmp 문자열에 '8'이 있으면 count변수 1증가
		}
		System.out.println("8이 들어있는 숫자의 개수 : " + count);
		//특정 숫자를 추출하는 함수?(!)
		


		// 1 ~ 1000 사이의 정수 중 8의 총 개수를 구하여 출력
		count = 0; //8의 총 개수를 저장할 변수
		for(int i = 1; i <= 1000; i++){
			String tmp = i + "";
			for(int j = 0; j < tmp.length(); j++){
			//tmp 문자열의 첫 글자부터 마지막 글자까지 루프를 좀
				if(tmp.charAt(j) == '8') count++;
			}
		}
		System.out.println("8의 총 개수 : " + count);
	}
		
		



	
}




/*
로직
정수의 데이터 배열을 초기화
8이 포함된 숫자 선별 후 개수구하기

8의 낱개 구하기
*/