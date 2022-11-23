import java.util.*;

/*
ģ�� �ּҷ� ���α׷�
1. ģ���� ��ģ���� ����ģ���� �з�
 - �� ģ���� ������ ������ Ŭ����(��) : Friend(�⺻����), HighFriend(��ģ��), UnivFriend(����ģ��)
2. ģ�� ������ ���� �Է��Ͽ� ����
 - �Է¹��� ������ �����Ű�� Ŭ���� �Ǵ� �޼ҵ� : FriendHandler(�Է�, ����, �˻�)
3. ���α׷� ���� �� ���� : FriendInfoMain
*/

class Friend{
// ģ������ �⺻����(�̸�, ��ȭ, �ּ�)���� ������ Ŭ����
	String name, phone, addr;
	// ģ������ �⺻�������� ������ ���������
	public Friend(String name, String phone, String addr){
	// Friend Ŭ������ �����ڷ� �޾ƿ� �Ű��������� ��������� ����(�ϳ��� �ν��Ͻ��� �ϳ��� ģ���⺻������ �ǹ�)
		this.name = name;		this.phone = phone;		this.addr = addr;
	} 
	public void showAllInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("�ּ� : " + addr);
	}
	public void showBasicInfo(){}
	// ����Ŭ�������� �������̵� �� �� �ֵ��� ������ ������ ������ ���� �޼ҵ�
//  ����Ŭ������ ����ȯ
}

class HighFriend extends Friend{
// ��ģ�� ������ ������ Ŭ������ Friend�� ��ӹ޾� ģ���⺻������ ������ ��
	String work;
	// ���������� ��ģ������ �ִ� ������ ������ �������
	public HighFriend(String name, String phone, String addr, String work){
		super(name, phone, addr);
		//�޾ƿ� ���� �� �⺻�������� �μ��� �Ͽ� ����Ŭ������ friendŬ������ ������ ȣ��
		this.work = work;
	}
	// ����Ŭ������ FriendŬ������ showAllInfo() �������̵�(�̸�, ��ȭ, �ּ�, ������ ������)
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("���� : " + work);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
	}
}

class UnivFriend extends Friend{
// ����ģ�� ������ ������ Ŭ������ Friend�� ��ӹ޾� ģ���⺻������ ������ ��
	String major;
	// ���������� ��ģ������ �ִ� ������ ������ �������
	public UnivFriend(String name, String phone, String addr, String major){
		super(name, phone, addr);
		//�޾ƿ� ���� �� �⺻�������� �μ��� �Ͽ� ����Ŭ������ friendŬ������ ������ ȣ��
		this.major = major;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("���� : " + major);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("���� : " + major);
	}
}

class FriendHandler{
// friend, Highfriend, Univfriend Ŭ�������� �̿��Ͽ� ���� �۾��� ó���ϴ� Ŭ����
	private Friend[] myFriends;
	// Friend�� �ν��Ͻ�(����Ŭ���� ����)�� ������ �� �ִ� �迭 myFriends ����
	// Friend������ ���������ν� Friend�� ����Ŭ������ HighFriend�� UnivFriend�� �ν��Ͻ��� ���尡�� 
	private int numOfFriends;
	// myFriends �迭�� �ε��� ��ȣ���� ���� ����� ģ�� ���� ������ ����
	public FriendHandler(int num){
		myFriends = new Friend[num];
		//�迭�� ũ�⸦ �μ��� �޾ƿ� myfriends�迭�� ���� - ������ num�� ũ�⸸ŭ ģ�������� ������ �� ����
		numOfFriends = 0;
		//myFriends�迭�� ������ ģ�������� �ε��� ��ȣ���� ���� ����� ģ�� ���� �ǹ��ϴ� ��
	}
	private void addFriendInfo(Friend fren){
	// FirendHandler Ŭ���� ���ο����� ����ϹǷ� �ܺο��� ������ �� ���� private���� ������
	// myFriends �迭�� �߰��� ģ������ �ν��Ͻ��� �μ��� �޾� muFriends �迭�� �����Ű�� �޼ҵ�
	// �Ű������� Friend���� ������ HighFriend�� UnivFriend�� �ν��Ͻ� ��� �޾ƾ� �ϹǷ� �� Ŭ������ ��������
	// ����Ŭ���������� ������
	// �Ű������� Friend���� �ƴϸ� ��� ������ ģ������ ��ŭ addFriendInfo() �޼ҵ带 ���� ���� ������ ��
		myFriends[numOfFriends] = fren;
		// �޾ƿ� ģ������ �ν��Ͻ��� myFriends �迭�� ����
		numOfFriends++;
		// ���� ģ�������� ������ �ε����� ���� 1����(���� ����Ǿ� �ִ� ģ������ �ν��Ͻ��� �����̱⵵ ��)
	}
	public void addFriend(int choice){
	// ����ڰ� �Է��ϴ� ģ������(choice ���� ���� �� �Ǵ� ���� ģ���� ����)�� �޾� �����Ű�� �޼ҵ�
		String name, phone, addr, work, major; // ģ���������� ������ ���� ����

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("��ȭ : "); phone = sc.nextLine();
		System.out.print("�ּ� : "); addr = sc.nextLine();
		// ���� ���� ģ�� ��� �ʿ�� �ϴ� �⺻����(FriendŬ������ ���������) ���� �Է¹���

		if(choice == 1){ // ��ģ�� ��Ͻ�
			System.out.print("���� : "); work = sc.nextLine();
			// ��ģ�� ���� ������ �Է¹���
			addFriendInfo(new HighFriend(name, phone, addr, work)); // �����ν��Ͻ� ����
		}else{
			System.out.print("���� : "); major = sc.nextLine();
			// ����ģ�� ���� ������ �Է¹���
			addFriendInfo(new UnivFriend(name, phone, addr, major)); // �����ν��Ͻ� ����
		}
		System.out.println("�Է¿Ϸ�\n");
	}
	public void showAllInfo(){
	// ���� myFriends �迭�� ����Ǿ� �ִ� ��� ģ������ ������ ����ϴ� �޼ҵ�
	// ������ִ� ���� �ִ� ��ġ?  myFriends�迭? ����������ִ� �迭�� ���?  showAllInfo()�� ȣ��
//		addFriendInfo();
//		myFriends fren = new myFriends();
//		System.out.println(fren);
		for(int i = 0; i < numOfFriends; i++){
			myFriends[i].showAllInfo();
			// myFriends[i] : myFriends�迭�� i�ε����� ����ִ� Friend�� �ν��Ͻ�
			// .showAllInfo() : �ȿ� �ִ� showAllInfo() �޼ҵ� ȣ��
			// showAllInfo()�޼ҵ�� ����Ŭ�������� �������̵� �߱� ������ ����Ŭ����(Friend)�� �ƴ� 
			// ����Ŭ����(HighFriend, UnivFriend)�� �޼ҵ尡 �����
		}
	}

	public void showBasicInfo(){
	// ���� myFriends �迭�� ����Ǿ� �ִ� ��� ģ������ �⺻������ ����ϴ� �޼ҵ�
		
		for(int i = 0; i < numOfFriends; i++){
			myFriends[i].showBasicInfo();
//			if(myFriends[i] instanceof HighFriend){
//				((HighFriend)myFriends[i]).showBasicInfo();
//			}else{
//				((UnivFriend)myFriends[i]).showBasicInfo();
//			}
		}
	}
}




class FriendInfoMain {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(100);
		// FriendHandler handler �� �ν��Ͻ� handler�� ���� �� ����

		while(true){ // ���ѷ����μ� ��� ���鼭 ���α׷� ��� ���¸� ����
			System.out.println("*** �޴����� ***");
			System.out.println("1. ��ģ�� ����");
			System.out.println("2. ����ģ�� ����");
			System.out.println("3. ��ü���� ���");
			System.out.println("4. �⺻���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			// ����ڰ� �Է��� �޴���ȣ�� choice������ ����

			switch (choice)
			{
			case 1: case 2: // ����ڰ� ������ �޴��� 1�̰ų� 2�̸�
				handler.addFriend(choice); break;
			case 3:
				handler.showAllInfo(); break;
			case 4:
				handler.showBasicInfo(); break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
