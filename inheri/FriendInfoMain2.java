import java.util.*;


class Friend{

		private String name, phone, addr;
		public Friend(String name, String phone, String addr){
		this.name = name;		this.phone = phone;		this.addr = addr;
	} 
	public String getName(){return name;}
	public String getPhone(){return phone;}
	public String getAddr(){return addr;}
	// ������� ������ �޼ҵ�� - getter
	public void showAllInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("�ּ� : " + addr);
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
		System.out.println("���� : " + work);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + getName());
		System.out.println("��ȭ : " + getPhone());
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
		System.out.println("���� : " + major);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + getName());
		System.out.println("��ȭ : " + getPhone());
		System.out.println("���� : " + major);
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
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("��ȭ : "); phone = sc.nextLine();
		System.out.print("�ּ� : "); addr = sc.nextLine();


		if(choice == 1){
			System.out.print("���� : "); work = sc.nextLine();

			addFriendInfo(new HighFriend(name, phone, addr, work)); 
		}else{
			System.out.print("���� : "); major = sc.nextLine();

			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("�Է¿Ϸ�\n");
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
	// ����ڿ��� �Է¹��� �˻���(�̸�)�� ģ�������� �˻��Ͽ� ����ϴ� �޼ҵ� 
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� : "); 
		String keyword = sc.nextLine(); // �˻���(ģ�������� �� �̸�)
		
		for(int i = 0; i < numOfFriends; i++){
		// ����� ģ�������� ��ŭ ������ ���鼭 �Է¹��� �˻���� ������ �̸��� �ִ��� �˻� �� ���
		// �̸� : myFriends �迭�ȿ� �ִ� �ν��Ͻ����� name �������
			if(keyword.equals(myFriends[i].getName())){
				myFriends[i].showAllInfo();	
				return;
			}
//			else if(!keyword.equals(myFriends[i].name)){
//				System.out.println("�˻������ �����ϴ�."); 
//				return;
//		}
		}
		System.out.println("�˻������ �����ϴ�."); 
	}
}




class FriendInfoMain2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(100);


		while(true){ 
			System.out.println("*** �޴����� ***");
			System.out.println("1. ��ģ�� ����");
			System.out.println("2. ����ģ�� ����");
			System.out.println("3. ��ü���� ���");
			System.out.println("4. �⺻���� ���");
			System.out.println("5. ģ���˻�-�̸�");
//�˻��� �̸� : ???
//�˻���� ��� - showAllInfo()�� �̿��Ͽ� �˻��� ģ���� ������ �Է�
//�˻������ ������ "�˻������ �����ϴ�." �޽��� ���
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� >> ");

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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
