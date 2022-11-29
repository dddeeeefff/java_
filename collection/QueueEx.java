import java.util.*;

class QueueEx {
	public static Queue q = new LinkedList(); // 명령어를 저장할 Queue
	public static final int MAX_SIZE = 3; // 명령어를 저장할 최대 개수

	public static void main(String[] args) {
		System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");

		while (true){
			System.out.print(" >> ");
			try{
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if(input.equals("")) continue;
				// 명령어를 입력하지 않은 경우 실행문들을 실행하지 않고 조건으로 올라감

				// 모든 명령어는 대소문자를 구분하지 않고 동작되어야 함			equalsignoreCase()
				// q : 프로그램 종료, help : 도움말 출력, history : 최근 입력한 명령어 3개 보여줌
				// 다른 명령어일 경우 아무일도 하지 않음
				if(input.equalsIgnoreCase("q")){
					System.exit(0); // 프로그램 종료
				}else if(input.equalsIgnoreCase("help")){
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q - 프로그램을 종료합니다.");
					System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")){
					int i = 0; // 명령어 번호로 사용할 변수
					save(input); // 입력받은 명령어를 q에 저장

					LinkedList tmp = (LinkedList)q;
					// q로 루프를 돌릴 수 없으므로 listIterator() 메소드를 사용할 수 있는 LinkedList로 형변환
					// 메소드 첫글자 대문자 주의
					ListIterator it = tmp.listIterator();
					while (it.hasNext()){
						i++;
						System.out.println(i + ". " + it.next());
					}

				}else{
					save(input);
					System.out.println(input);
				}
			}
			catch (Exception e){
				System.out.println("입력오류입니다");
			}
		}
	}
	public static void save(String input){
		// 받아온 명령어가 빈 문자열이 아니면 q에 저장
		if(!input.equals("")) q.offer(input);

		// q에 저장된 명령어가 최대개수를 넘으면 q의 맨 앞에 있는 데이터를 삭제
		if(q.size() > MAX_SIZE) q.remove();
	}
}
