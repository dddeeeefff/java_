interface PersonalNumberStorage {
	void addPersonalInfo(String name, String pNum);
	String searchName(String pNum);
	// interface에서 선언하는 모든 메소드를 자동으로 public abstract로 선언됨
	// interface에서는 절데 구현된 메소드를 정의할 수 없고 무조건 public abstract 메소드만 선언해야 함
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
// interface인 PersonalNumberStorage를 implements했으므로 반드시 PersonalNumberStorage 안에 있는
// 모든 메소드를 오버라이딩하여 완성해야 함 - 안하면 오류 발생

	PersonalInfo[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl(int sz){ 
		perArr = new PersonalInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String pNum){
	// interface에 있는 abstract 메소드로 오버라이딩하여 완성해야 함(무조건 public)
		perArr[numOfPerInfo] = new PersonalInfo(name, pNum);
		numOfPerInfo++;

	}
	public String searchName(String pNum){
	// interface에 있는 abstract 메소드로 오버라이딩하여 완성해야 함(무조건 public)
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
		// interface로 인스턴스 생성은 안되지만 선언은 가능
		// (상위클래스로 선언 후 하위클래스 인스턴스가 저장되듯 interface로도 동일한 작업이 가능)
		
		storage.addPersonalInfo("홍길동", "950000-1234567");
		storage.addPersonalInfo("전우치", "970000-1234567");

		String result = storage.searchName("950000-1234567");
		if(result == null) result = "검색결과 없음";
		System.out.println(result);

		result = storage.searchName("970000-1234567");
		if(result == null) result = "검색결과 없음";
		System.out.println(result);

		result = storage.searchName("0000");
		if(result == null) result = "검색결과 없음";
		System.out.println(result);
	}
}
