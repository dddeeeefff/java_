interface PersonalNumberStorage {
	void addPersonalInfo(String name, String pNum);
	String searchName(String pNum);
	// interface���� �����ϴ� ��� �޼ҵ带 �ڵ����� public abstract�� �����
	// interface������ ���� ������ �޼ҵ带 ������ �� ���� ������ public abstract �޼ҵ常 �����ؾ� ��
}

class PersonalInfo{
	private String name, number;
	public PersonalInfo(String name, String number){
		this.name = name;		this.number = number;
	}
	String getName(){return name;}
	String getNumber(){return number;}
}
class PersonalNumberStorageImpl implements PersonalNumberStorage{
// interface�� PersonalNumberStorage�� implements�����Ƿ� �ݵ�� PersonalNumberStorage �ȿ� �ִ�
// ��� �޼ҵ带 �������̵��Ͽ� �ϼ��ؾ� �� - ���ϸ� ���� �߻�

	PersonalInfo[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl(int sz){ 
		perArr = new PersonalInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String pNum){
	// interface�� �ִ� abstract �޼ҵ�� �������̵��Ͽ� �ϼ��ؾ� ��(������ public)
		perArr[numOfPerInfo] = new PersonalInfo(name, pNum);
		numOfPerInfo++;

	}
	public String searchName(String pNum){
	// interface�� �ִ� abstract �޼ҵ�� �������̵��Ͽ� �ϼ��ؾ� ��(������ public)
		for(int i = 0; i < numOfPerInfo; i++){
			if(pNum.equals(perArr[i].getNumber())){
				return perArr[i].getName();
			}
		}
		return null;
	}
}

class AbstractInterface2 {
	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		// interface�� �ν��Ͻ� ������ �ȵ����� ������ ����
		// (����Ŭ������ ���� �� ����Ŭ���� �ν��Ͻ��� ����ǵ� interface�ε� ������ �۾��� ����)
		
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
