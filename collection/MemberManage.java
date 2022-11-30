import java.util.*;

/*ȸ�� ���� ���� - MemberManage.java
ȸ������(���̵�, ��ȣ, �̸�)�� ������ Ŭ���� - MemberInfo
������ �Է¹ް�, ���� ó�� �� ���� ����� ����� Ŭ���� - MemberHander
�޴�
1. ȸ�� ��� - ȸ�� ������ �Է¹޾� ArrayList�� ����(���׸� ���, ���̵� �ߺ�üũ)
2. ��ü ȸ������ ����
3. ȸ�� �˻� - ���̵�� �˻��Ͽ� ���� ������
9. ���α׷� ����
*/

class MemberInfo{ // ȸ������ ����� Ŭ����
	private String id, pwd, name;
	public MemberInfo(String id, String pwd, String name){
		this.id = id;		this.pwd = pwd;		this.name = name;
	}
	public void setPwd(String pwd){this.pwd = pwd;}
	public String getId(){return id;} // id�� �޾ƿ��� getter
	public String getPwd(){return pwd;} // pwd�� �޾ƿ��� getter
	public String getName(){return name;} // name�� �޾ƿ��� getter
	public void showInfo(){
		System.out.println("���̵� : " + id + "/ ��ȣ : " + pwd + " / �̸� : " + name);
	}
}

class MemberHandler{ 
// ȸ������(MemberInfo �ν��Ͻ�)�� �Է¹ް� ó���ϴ� Ŭ����
	private ArrayList<MemberInfo> members;
	// MemberInfo�� �ν��Ͻ��� �����ϴ� ȸ������ ����� ArrayList
	// ���׸����� MemberInfo���� ���������Ƿ� members���� ��ü�� ������ �� MemberInfo������ ����ȯ���� �ʾƵ� ��
	public MemberHandler(){
		members = new ArrayList<MemberInfo>();
	}
	// ȸ�������� ����ڿ��� �Է¹޾� ����(ȸ�����)��Ű�� �޼ҵ�

	// ���̵� �ߺ� üũ�ϴ� �޼ҵ�
	private boolean isDupId(String id){
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().equals(id)){
			// ���� �Է��� id�� ������ id�� �̹� ȸ������� �Ǿ� �ִٸ�
				return true;
			}
		}
		return false;
	}

	public void joinMember(){
		String id, pwd, name;
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : "); id = sc.nextLine();
		if(isDupId(id)){
			System.out.println("�̹� ������� ���̵� �Դϴ�.");
			joinMember(); // ���ȣ��� ���̵� �ٽ� �Է¹ް� ��
			return;
		}
		
		System.out.print("��й�ȣ : "); pwd = sc.nextLine();
		System.out.print("�̸� : "); name = sc.nextLine();

		members.add(new MemberInfo(id, pwd, name));
		System.out.println("ȸ�� ������ �����մϴ�.\n");
	}

	// ȸ�������� �����ִ� �޼ҵ�
	public void showAllInfo(){
		for(int i = 0; i < members.size(); i++){
			members.get(i).showInfo();
		}
	}
	
	// �˻�� �޾� ȸ�������� �˻��ϴ� �޼ҵ�
	public void searchMember(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ���̵� : "); 
		String keyword = sc.nextLine(); // �˻���(ģ�������� �� �̸�)

/*		
		// �Է��� ���̵�� ������ ���̵� ���� ȸ������(�� �� ����) ���

		for(int i = 0; i < members.size(); i++){
			if(keyword.equals(members.get(i).getId())){
			// �� ȸ������ �ν��Ͻ��� id�� keyword�� ������
				members.get(i).showInfo();	
				return;
			}
		}
		System.out.println("�˻������ �����ϴ�."); 
*/

		// �Է��� �˻�� �����ϰ� �ִ� ���̵� ���� ȸ������ ���� ���
		boolean isSch = false; // �˻� �������θ� �����ϴ� ����
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().indexOf(keyword) != -1){ // contains�� ����
			// �� ȸ������ �ν��Ͻ��� id�� keyword�� �����ϰ� ������
				members.get(i).showInfo();
				isSch = true; // �˻� ����
			}
		}
		if(!isSch) System.out.println("�˻������ �����ϴ�."); 
	}

	//���̵�� ��ȣ�� �޾� �α����� ��Ű�� �޼ҵ�
	public void loginMember(){
		String id, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : "); id = sc.nextLine();
		System.out.print("��й�ȣ : "); pwd = sc.nextLine();

		boolean isLogin = false; // �α��� ���� ���ο� ���� ����
	// ���� : �α��� �Ǿ����ϴ�. / ���� : �α��ο� �����߽��ϴ�. �ٽ� �õ�
	// �� �޼ҵ忡�� �Է��� ���� ���� ��������?  members �ȿ� ����Ǿ� �ִ� ������ ��� ������?
		for(int i = 0; i < members.size(); i++){
			if(members.get(i).getId().equals(id) && members.get(i).getPwd().equals(pwd)){
				isLogin = true;
				break;
			}
		}
		if(isLogin){
			System.out.println("�α��� �Ǿ����ϴ�.\n");
		}else{
			System.out.println("�α��ο� �����߽��ϴ�.\n");
			loginMember();
		}
	}
}

class MemberManage {
	public static void main(String[] args) {
		MemberHandler handler = new MemberHandler();
		
		while(true){ 
			System.out.println("*** �޴����� ***");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ��ü ȸ������ ����");
			System.out.println("3. ȸ�� �˻�");
			System.out.println("4. �α���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� >> ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
