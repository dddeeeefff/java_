import java.util.*;

class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// key�� value ��� String �ν��Ͻ��� ����޴� HashMap �ν��Ͻ� ����
		map.put("test","1234");		map.put("abcd","1111");
		map.put("abcd","1234");

		HashMap<String, String> map1 = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("id�� password�� �Է��ϼ���");
/*			String id = sc.nextLine();
			String password = sc.nextLine();
			map1.put(id, password);
			if(map1 == map) break;
*/
			// id��  password�� ���� �Է¹޾� �α��� ���� - �� �ʰ��� ��� ������? - ��� ��Ī����?
			// �α��� ������ while���� �������� ���α׷� ����
			// �α��� ���н� "�������� �ʴ� id�Դϴ�."�� "��й�ȣ�� Ʋ�Ƚ��ϴ�." �� �ϳ��� �޽����� �����ְ� �ٽ�
			// id��  password�� ���� �Է¹޾� �α��� ����
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String pwd = sc.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)){
			// map�� key�� �߿� ������ id�� ������ key�� ������
				System.out.println("�������� �ʴ� id�Դϴ�. �ٽ� �Է��ϼ���.");
			}else{
				if(!map.get(id).equals(pwd)){
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
				}else{
					System.out.println("�α��� ����!");
					break;
				}
			}
		}

	}
}
