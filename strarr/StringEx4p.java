class StringEx4p {
	public static void main(String[] args) {
		String str1 = "890525-1234567";
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
		String year = str.substring(0,2);
		int syear = Integer.parseInt(year);
		if(syear >= 0 && syear <= 9 ){
		System.out.print("200"+ syear + "년 ");			
		}else if(syear >= 10 && syear <= 22){
		System.out.print("20"+ syear + "년 ");
		}else{
		System.out.print("19"+ syear + "년 ");
		}

		String m = str.substring(2,4);
		String d = str.substring(4,6);

		System.out.println(m + "월 " + d + "일 생");
	}

	//substring(int beginIndex, int endIndex) : beginIndex 부터 endIndex - 1 까지 잘라내어 새 문자열로 리턴
	//	str1.deleteCharAt(7);
	//	str2.deleteCharAt(7);
	public static void showGender(String str){
	//주민등록번호를 이용하여 성별을 출력하는 메소드
	//주민등록번호 앞 6자리 이용하여 "남자" 또는 "여자"로 출력	
		int i =7;
		if(str.indexOf('-') == -1) i = 6;
		if(str.length() == 13) i = 6;

		char gen = str.charAt(6);
		if(gen == '1' || gen == '3'){
			System.out.println("남자");
		}else if(gen == '2' || gen == '4'){
			System.out.println("여자");
		}
	}
}
//StringBuilder   deleteCharAt(int index) : index에 해당하는 문자 하나를 삭제한 후 리턴