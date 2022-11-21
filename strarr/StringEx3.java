class StringEx3 {
	public static void main(String[] args) {
		String str1 = "test@abc.com";  String str2 = "testabc.com";
		String str3 = "test@abccom";   String str4 = "test.abc@com";

		emailTest(str1);  emailTest(str2);  emailTest(str3);  emailTest(str4);

	}

	public static void emailTest(String email){
	/*
	받아온 email을 검사하여 이메일 주소가 맞는지 출력
	1. 반드시 '@'가 있어야 함 : indexOf()로 -1이 아닌지 여부
	2. 반드시 '.'이 있어야 함 : indexOf()로 -1이 아닌지 여부
	3. 반드시 '@'가 '.'보다 앞에 있어야 함 : indexOf()로 위치값 비교
	*/

	//int dot = email.lastIndexOf('.');
	//int pop = email.lastIndexOf('@');
	//if(dot > pop && email.contains(".") && email.contains("@")){
	//	System.out.println(email +"은 이메일 맞음");
	//}else{
	//	System.out.println(email +"은 이메일 아님");
	//}
	
	int at = email.indexOf('@'); // email에서 '@'의 위치 인덱스 번호
	int dot = email.indexOf('.'); // email에서 '.'의 위치 인덱스 번호

	if(at == -1){
		System.out.println(email + "은 '@'가 없습니다.");
	}else if(dot == -1){
		System.out.println(email + "은 '.'가 없습니다.");
	}else if(at > dot){
		System.out.println(email + "은 '@'가 '.'보다 뒤에 있습니다.");
	}else{
		System.out.println(email + "은 이메일이 맞습니다");
	}
}
}