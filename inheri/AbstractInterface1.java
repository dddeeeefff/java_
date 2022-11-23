abstract class PersonalNumberStorage {
// Ŭ���� ������ �޼ҵ�� �� �ϳ� �̻��� abstract �޼ҵ��̹Ƿ� Ŭ������ abstract�� �����
	public abstract void addPersonalInfo(String name, String pNum);
	public abstract String searchName(String pNum);
}

class PersonalInfo{
	private String name, number;
	public PersonalInfo(String name, String number){
		this.name = name;		this.number = number;
	}
	String getName(){return name;}
	String getNumber(){return number;}
}
class PersonalNumberStorageImpl extends PersonalNumberStorage{
// abstract Ŭ������ PersonalNumberStorage�� ��ӹ޾����Ƿ� �ݵ�� PersonalNumberStorage�� �ִ� abstract �޼ҵ带
// ��� �������̵��Ͽ� �ϼ��ؾ� �� - ���ϸ� �� Ŭ������ abstract�� �����ؾ� ��

	PersonalInfo[] perArr;
	//������� ���������� ���� PersonalInfo�� �ν��Ͻ��� ������ �迭 ����
	int numOfPerInfo;
	// perArr �迭�� �ε��� �� ���� ����ִ� ������ ������ ������ ����

	public PersonalNumberStorageImpl(int sz){ // ������
		perArr = new PersonalInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String pNum){
	// ����Ŭ������ PersonalNumberStorage Ŭ������ abstract �޼ҵ�� �������̵��Ͽ� �ϼ��ؾ� ��
		perArr[numOfPerInfo] = new PersonalInfo(name, pNum);
		// �μ��� �޾ƿ� name�� pNum�� �̿��Ͽ� PersonalInfo�� �ν��Ͻ��� ������ �� perArr �迭�� ����
		numOfPerInfo++;
		// ���� ����� ������ ������ ������ ����� ��ġ �ε����� ���� 1����
	}
	public String searchName(String pNum){
	// ����Ŭ������ PersonalNumberStorage Ŭ������ abstract �޼ҵ�� �������̵��Ͽ� �ϼ��ؾ� ��
		for(int i = 0; i < numOfPerInfo; i++){
			if(pNum.equals(perArr[i].getNumber())){
			// �μ��� �޾ƿ� ��ȣ(pNum)�� perArr�迭�� i�ε����� �ִ� �ν��Ͻ��� getNumber()�޼ҵ�� ������ ��ȣ�� ������ 
				return perArr[i].getName();
				// �ش� �ν��Ͻ����� �̸��� �����Ͽ� ���� -> �޼ҵ� ����(return)
			}
		}
		return null;  // �˻������ ������ null�� ����
		// null�� ����ִ� ��ü(�ν��Ͻ�)�� �ǹ��ϹǷ� ����Ÿ���� �⺻�ڷ����� �ƴϸ� � ����Ÿ���̶� ��밡��
	}
}

class AbstractInterface1 {
	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		
		storage.addPersonalInfo("ȫ�浿", "950000-1234567");
		storage.addPersonalInfo("����ġ", "970000-1234567");

		String result = storage.searchName("950000-1234567");
		if(result == null) result = "�˻���� ����";
		System.out.println(result);

		result = storage.searchName("970000-1234567");
		if(result == null) result = "�˻���� ����";
		System.out.println(result);

		result = storage.searchName("0000");
		if(result == null) result = "�˻���� ����";
		System.out.println(result);
	}
}
