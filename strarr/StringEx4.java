class StringEx4 {
	public static void main(String[] args) {
		String str1 = "880525-1234567";
		String str2 = "890515-2234567";
		String str3 = "0105253234567";
		String str4 = "0205154234567";
		
		showBirth(str1);		showBirth(str2);
		showGender(str1);		showGender(str2);
		showBirth(str3);		showBirth(str4);
		showGender(str3);		showGender(str4);


	}
	public static void showBirth(String str){
	//주민등록번호를 이용하여 생년월일을 출력하는 메소드
	//주민등록번호 앞 6자리 이용하여 "yyyy년 mm월 dd일 생"으로 출력
		int i =7; // 성별구분자 인덱스 번호를 저장할 인덱스
		if(str.indexOf('-') == -1) i = 6; //주민번호에 하이픈이 없으면 성별구분자 인덱스는 6
		if(str.length() == 13) i = 6; //주민번호에 하이픈이 없으면 성별구분자 인덱스는 6
		char g = str.charAt(i); // 성별구분자 추출

		int tmp = 19;
		if(g == '3' || g == '4') tmp = 20;
		if(g > '2') tmp = 20;

		String year = tmp + str.substring(0,2);
		String month = str.substring(2,4);
		String day = str.substring(4,6);
		System.out.println(year + "년 " + month + "월 " + day + "일 생");

	}



	public static void showGender(String str){
	//주민등록번호를 이용하여 성별을 출력하는 메소드
	//주민등록번호 앞 6자리 이용하여 "남자" 또는 "여자"로 출력	
		int i =7;
		if(str.indexOf('-') == -1) i = 6;
		if(str.length() == 13) i = 6;

		char gen = str.charAt(i);
		if(gen % 2 == 1){
			System.out.println("남자");
		}else if(gen % 2 == 0){
			System.out.println("여자");
		}
	}
}
