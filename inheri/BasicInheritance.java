class Man{
	private String name; // ����� ������ ������ �Ұ�
	public Man(String name) {this.name = name;}
	public void tellYourName(){System.out.println("My name is " + name);}
}

class BusinessMan extends Man{
// extends Man : Man Ŭ������ ��ӹްڴٴ� �ǹ�
	private String company, position;
	public BusinessMan(String name, String company, String position){
		super(name); // �����ϸ� JVM�� �ڵ����� super();�� �����Ŵ
		//����Ŭ������ ManŬ������ �����ڸ� ȣ��(�ݵ�� ����Ŭ���� �������� ù�ٿ��� ȣ���ؾ� ��)
		this.company = company;		this.position = position;
	}

	 public void tellYourInfo(){
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
		// ����Ŭ���������� ����Ŭ������ �޼ҵ带 �����Ӱ� ȣ���� �� ����
	}
}



class BasicInheritance {
	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("Mr. Hong", "Hybrid 3D ELD", "Staff Eng");
		BusinessMan man2 = new BusinessMan("Mr. Lee", "Hybrid 3D ELD", "Assist Eng");

		System.out.println("1st man info -----------------------");
		man1.tellYourName(); // ����Ŭ������ �ν��Ͻ��� ����Ŭ������ �޼ҵ带 �����Ӱ� ȣ���� �� ����
		man1.tellYourInfo();
		System.out.println();	

		System.out.println("2nd man info -----------------------");
		man2.tellYourInfo();
	}
}
