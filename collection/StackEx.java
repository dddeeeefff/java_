import java.util.*;

class StackEx {
	public static Stack back = new Stack(); 
	// 뒤로 가기에 필요한 히스토리를 저장할 멤버
	public static Stack forward = new Stack(); 
	// 앞으로 가기에 필요한 히스토리를 저장할 멤버

	public static void main(String[] args) {
		goURL("1. 네이트");		goURL("2. 야후");
		goURL("3. 네이버");		goURL("4. 다음");
		printStatus();

		goBack();
		System.out.println("뒤로 가기 버튼 클릭시");
		printStatus();

		goBack();
		System.out.println("뒤로 가기 버튼 클릭시");
		printStatus();

		goForward();
		System.out.println("앞으로 가기 버튼 클릭시");
		printStatus();

		goURL("google.com");
		System.out.println("새로운 주소로 이동");
		printStatus();
	}
	public static void printStatus(){
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다");
		System.out.println();
	}

	public static void goURL(String url){
	// 새롭게 이동한 페이지의 url을 back에 저장하는 메소드
		back.push(url);
		// 뒤로가기에 url을 저장시켜줌
		if(!forward.empty()) forward.clear();
		// forward가 비어있지 않으면, forward에 들어있는 정보들을 삭제
	}

	public static void goForward(){
		if(!forward.empty()) back.push(forward.pop());
	}

	public static void goBack(){
		if(!back.empty()) forward.push(back.pop());
		// back이 비어있으면 아무 작업도 안함
		// 비어있지 않으면 back에서 한 url을 추출하여 forward에 저장
		// back.pop() : back에서 가장 위에 있는 데이터를 추출하는 작업
		// 단, 데이터 추출시 원본 데이터에는 가져간 데이터가 남지 않음
	}
}


/*
back : [1. 네이트, 2. 야후, 3. 네이버, 4. 다음]
forward : []
현재화면은 '4. 다음' 입니다

뒤로 가기 버튼 클릭시
back : [1. 네이트, 2. 야후, 3. 네이버]
forward : [4. 다음]
현재화면은 '3. 네이버' 입니다

뒤로 가기 버튼 클릭시
back : [1. 네이트, 2. 야후]
forward : [4. 다음, 3. 네이버]
현재화면은 '2. 야후' 입니다

앞으로 가기 버튼 클릭시
back : [1. 네이트, 2. 야후, 3. 네이버]
forward : [4. 다음]
현재화면은 '3. 네이버' 입니다

새로운 주소로 이동
back : [1. 네이트, 2. 야후, 3. 네이버, google.com]
forward : []
현재화면은 'google.com' 입니다
*/