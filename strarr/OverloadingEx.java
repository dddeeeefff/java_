class StudentInfo{
// �л������� ������ Ŭ���� : �ϳ��� �ν��Ͻ��� �� ���� �л��� �ǹ�
	private int stID, korean, math, art;

	StudentInfo(int stID, int korean, int math, int art){ // ������
		this.stID = stID;  // this.�� ������������� ǥ��
		this.korean = korean; 
		this.math = math; 
		this.art = art;
		//��������� �Ű������� �̸��� ������ this�� �̿��Ͽ� ��������� ��������
		//this. : '���� �����ǰ� �ִ� �ν��Ͻ��� ~'�� �ǹ��ϴ� ���
	} 
	StudentInfo(int stID, int korean, int math){ // ������
		this(stID, korean, math,-1);
		//�Ű������� �μ��� �Ͽ� �ٸ� �����ڸ� ȣ��
		//�ٸ� �����ڸ� ȣ���ϴ� ���� ���� ������ �ȿ��� this()�� �̿��ϴ� �������
	} 
	public void showInfo(){
		System.out.println("�й� : " + stID);
		System.out.println("���� : " + korean);
		System.out.println("���� : " + math);
		if(art == -1){
			System.out.println("�̼������� ���� �ʴ� �л�");
		}else{
			System.out.println("�̼� : " + art);	
		}
		
	}
}


class OverloadingEx {
	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo(1234,20,50,30); // 
		System.out.println("�л� A�� ������... ");
		st1.showInfo();

		StudentInfo st2 = new StudentInfo(1235,20,50); // 
		// �̼� ������ ���� �ʴ� �л�
		System.out.println("�л� B�� ������... ");
		st2.showInfo();
	}
}
