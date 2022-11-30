import java.util.*;

/*회원 정보 관리 - MemberManage.java
회원정보(아이디, 암호, 이름)를 저장할 클래스 - MemberInfo
정보를 입력받고, 저장 처리 및 각종 기능을 담당할 클래스 - MemberHander
메뉴
1. 회원 등록 - 회원 정보를 입력받아 ArrayList에 저장(제네릭 사용, 아이디 중복체크)
2. 전체 회원정보 보기
3. 회원 검색 - 아이디로 검색하여 정보 보여줌
9. 프로그램 종료
*/

class MemberInfo{ // 회원정보 저장용 클래스
	private String id, pwd, name;
	public MemberInfo(String id, String pwd, String name){
		this.id = id;		this.pwd = pwd;		this.name = name;
	}
	public void setPwd(String pwd){this.pwd = pwd;}
	public String getId(){return id;} // id를 받아오는 getter
	public String getPwd(){return pwd;} // pwd를 받아오는 getter
	public String getName(){return name;} // name을 받아오는 getter
	public void showInfo(){
		System.out.println("아이디 : " + id + "/ 암호 : " + pwd + " / 이름 : " + name);
	}
}

class MemberHandler{ 
// 회원정보(MemberInfo 인스턴스)를 입력받고 처리하는 클래스
	private ArrayList<MemberInfo> members;
	// MemberInfo형 인스턴스만 저장하는 회원정보 저장용 ArrayList
	// 제네릭으로 MemberInfo형만 지정했으므로 members에서 객체를 참조할 때 MemberInfo형으로 형변환하지 않아도 됨
	public MemberHandler(){
		members = new ArrayList<MemberInfo>();
	}
	// 회원정보를 사용자에게 입력받아 저장(회원등록)시키는 메소드

	// 아이디 중복 체크하는 메소드
	private boolean isDupId(String id){
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().equals(id)){
			// 새로 입력한 id와 동일한 id가 이미 회원등록이 되어 있다면
				return true;
			}
		}
		return false;
	}

	public void joinMember(){
		String id, pwd, name;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); id = sc.nextLine();
		if(isDupId(id)){
			System.out.println("이미 사용중인 아이디 입니다.");
			joinMember(); // 재귀호출로 아이디를 다시 입력받게 함
			return;
		}
		
		System.out.print("비밀번호 : "); pwd = sc.nextLine();
		System.out.print("이름 : "); name = sc.nextLine();

		members.add(new MemberInfo(id, pwd, name));
		System.out.println("회원 가입을 축하합니다.\n");
	}

	// 회원정보를 보여주는 메소드
	public void showAllInfo(){
		for(int i = 0; i < members.size(); i++){
			members.get(i).showInfo();
		}
	}
	
	// 검색어를 받아 회원정보를 검색하는 메소드
	public void searchMember(){
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 : "); 
		String keyword = sc.nextLine(); // 검색어(친구정보들 중 이름)

/*		
		// 입력한 아이디와 동일한 아이디를 가진 회원정보(한 명만 존재) 출력

		for(int i = 0; i < members.size(); i++){
			if(keyword.equals(members.get(i).getId())){
			// 현 회원정보 인스턴스의 id가 keyword와 같으면
				members.get(i).showInfo();	
				return;
			}
		}
		System.out.println("검색결과가 없습니다."); 
*/

		// 입력한 검색어를 포함하고 있는 아이디를 가진 회원들의 정보 출력
		boolean isSch = false; // 검색 성공여부를 저장하는 변수
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().indexOf(keyword) != -1){ // contains도 가능
			// 현 회원정보 인스턴스의 id가 keyword를 포함하고 있으면
				members.get(i).showInfo();
				isSch = true; // 검색 성공
			}
		}
		if(!isSch) System.out.println("검색결과가 없습니다."); 
	}

	//아이디와 암호를 받아 로그인을 시키는 메소드
	public void loginMember(){
		String id, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); id = sc.nextLine();
		System.out.print("비밀번호 : "); pwd = sc.nextLine();

		boolean isLogin = false; // 로그인 성공 여부에 대한 변수
	// 성공 : 로그인 되었습니다. / 실패 : 로그인에 실패했습니다. 다시 시도
	// 현 메소드에서 입력한 값을 어디다 저장하지?  members 안에 저장되어 있는 값들을 어떻게 비교하지?
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().equals(id) && members.get(i).getPwd().equals(pwd)){
				isLogin = true;
				break;
			}
		}
		if(isLogin){
			System.out.println("로그인 되었습니다.\n");
		}else{
			System.out.println("로그인에 실패했습니다.\n");
			loginMember();
		}
	}
}

class MemberManage {
	public static void main(String[] args) {
		MemberHandler handler = new MemberHandler();
		
		while(true){ 
			System.out.println("*** 메뉴선택 ***");
			System.out.println("1. 회원 등록");
			System.out.println("2. 전체 회원정보 보기");
			System.out.println("3. 회원 검색");
			System.out.println("4. 로그인");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				handler.joinMember(); break;
			case 2:
				handler.showAllInfo(); break;
			case 3:
				handler.searchMember(); break;
			case 4:
				handler.loginMember(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
