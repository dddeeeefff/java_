import java.util.*;


class Friend{

		private String name, phone, addr;
		public Friend(String name, String phone, String addr){
		this.name = name;		this.phone = phone;		this.addr = addr;
	} 
	public String getName(){return name;}
	public String getPhone(){return phone;}
	public String getAddr(){return addr;}
	// 멤버변수 참조용 메소드들 - getter
	public void showAllInfo(){
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo(){}

}

class HighFriend extends Friend{

	String work;

	public HighFriend(String name, String phone, String addr, String work){
		super(name, phone, addr);

		this.work = work;
	}

	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("직업 : " + work);
	}
	public void showBasicInfo(){
		System.out.println("이름 : " + getName());
		System.out.println("전화 : " + getPhone());
	}
}

class UnivFriend extends Friend{

	String major;

	public UnivFriend(String name, String phone, String addr, String major){
		super(name, phone, addr);

		this.major = major;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("전공 : " + major);
	}
	public void showBasicInfo(){
		System.out.println("이름 : " + getName());
		System.out.println("전화 : " + getPhone());
		System.out.println("전공 : " + major);
	}
}

class FriendHandler{

	private Friend[] myFriends;

	private int numOfFriends;

	public FriendHandler(int num){
		myFriends = new Friend[num];
		numOfFriends = 0;

	}
	private void addFriendInfo(Friend fren){

		myFriends[numOfFriends] = fren;
		numOfFriends++;

	}
	public void addFriend(int choice){

		String name, phone, addr, work, major;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); name = sc.nextLine();
		System.out.print("전화 : "); phone = sc.nextLine();
		System.out.print("주소 : "); addr = sc.nextLine();


		if(choice == 1){
			System.out.print("직업 : "); work = sc.nextLine();

			addFriendInfo(new HighFriend(name, phone, addr, work)); 
		}else{
			System.out.print("전공 : "); major = sc.nextLine();

			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("입력완료\n");
	}
	public void showAllInfo(){

		for(int i = 0; i < numOfFriends; i++){
			myFriends[i].showAllInfo();

		}
	}

	public void showBasicInfo(){
		for(int i = 0; i < numOfFriends; i++){
			myFriends[i].showBasicInfo();
		}
	}

	public void searchFriend(){
	// 사용자에게 입력받은 검색어(이름)로 친구정보를 검색하여 출력하는 메소드 
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : "); 
		String keyword = sc.nextLine(); // 검색어(친구정보들 중 이름)
		
		for(int i = 0; i < numOfFriends; i++){
		// 저장된 친구정보들 만큼 루프를 돌면서 입력받은 검색어와 동일한 이름이 있는지 검사 후 출력
		// 이름 : myFriends 배열안에 있는 인스턴스들의 name 멤버변수
			if(keyword.equals(myFriends[i].getName())){
				myFriends[i].showAllInfo();	
				return;
			}
//			else if(!keyword.equals(myFriends[i].name)){
//				System.out.println("검색결과가 없습니다."); 
//				return;
//		}
		}
		System.out.println("검색결과가 없습니다."); 
	}
}




class FriendInfoMain2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(100);


		while(true){ 
			System.out.println("*** 메뉴선택 ***");
			System.out.println("1. 고교친구 저장");
			System.out.println("2. 대학친구 저장");
			System.out.println("3. 전체정보 출력");
			System.out.println("4. 기본정보 출력");
			System.out.println("5. 친구검색-이름");
//검색할 이름 : ???
//검색결과 출력 - showAllInfo()를 이용하여 검색된 친구의 정보를 입력
//검색결과가 없으면 "검색결과가 없습니다." 메시지 출력
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");

			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			

			switch (choice)
			{
			case 1: case 2: 
				handler.addFriend(choice); break;
			case 3:
				handler.showAllInfo(); break;
			case 4:
				handler.showBasicInfo(); break;
			case 5:
				handler.searchFriend(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
