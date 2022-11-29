import java.util.*;

class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// key와 value 모두 String 인스턴스만 저장받는 HashMap 인스턴스 생성
		map.put("test","1234");		map.put("abcd","1111");
		map.put("abcd","1234");

		HashMap<String, String> map1 = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("id와 password를 입력하세요");
/*			String id = sc.nextLine();
			String password = sc.nextLine();
			map1.put(id, password);
			if(map1 == map) break;
*/
			// id와  password를 각각 입력받아 로그인 실행 - 각 맵값을 어떻게 비교하지? - 어떻게 매칭하지?
			// 로그인 성공시 while문을 빠져나가 프로그램 종료
			// 로그인 실패시 "존재하지 않는 id입니다."와 "비밀번호가 틀렸습니다." 중 하나의 메시지를 보여주고 다시
			// id와  password를 각각 입력받아 로그인 실행
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String pwd = sc.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)){
			// map의 key들 중에 지정한 id와 동일한 key가 없으면
				System.out.println("존재하지 않는 id입니다. 다시 입력하세요.");
			}else{
				if(!map.get(id).equals(pwd)){
					System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
				}else{
					System.out.println("로그인 성공!");
					break;
				}
			}
		}

	}
}
