class ToStringEx {
//�̸��� ���ֵ��ø� ������ �� �ִ� Ŭ���� ����(�ν��Ͻ� ������ ���ÿ� �ʱ�ȭ ����)
	private String name, city;
	public ToStringEx(String name, String city){ // name, city�� �޴� ������ ����
		this.name = name;	this.city = city;
	}
	// �̸��� ���ø� �����ִ� toString() �޼ҵ带 �������̵�
	public String toString(){
		return "�̸� : " + name + ", ���� : " + city;
	}
}
// ������ -> �ν��Ͻ�(new �ٿ� ����)

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("ȫ�浿","����"); // �ν��Ͻ� ����
		System.out.println(ts1.toString());
		// �������̵� �� : �̸� : ȫ�浿, ���� : ����

		ToStringEx ts2 = new ToStringEx("����ġ","�λ�");
		System.out.println(ts2);
		// �������̵� �� : �̸� : ����ġ, ���� : �λ�
	}
}
