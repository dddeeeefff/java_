class Gun{
	int bullet;
	public Gun(int num){bullet = num;}
	public void shot(){
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police { 
	Gun pistol; // Gun�� �ν��Ͻ� pistol�� ���� - ���������� ����
	int handcuff;
	public Police(int num, int bcuff){
		handcuff = bcuff;
		if(num > 0) pistol = new Gun(num);
		// �Ѿ��� ������ ��(Gun) Ŭ������ �ν��Ͻ��� ������(Gun�� ���� Police �ν��Ͻ� ����)
		else		pistol = null;
		// �Ѿ��� ������ ��(Gun) Ŭ������ �ν��Ͻ��� �������� ����(Gun�� ���� Police �ν��Ͻ� ����)
	}
	public void putHandcuff(){
		System.out.println("SNAP!!");
		handcuff--;
	}
	public void shot(){
		if(pistol == null) System.out.println("���� ���µ���??"); // ��ü�� == �������� ��ü �񱳽� �����ϰ� ��� ������ ���� null
		// ���� ���� Police �ν��Ͻ��� shot() �޼ҵ带 ȣ���� ���
		else			   pistol.shot();
	}
}

class HASComposite {
	public static void main(String[] args) {
		Police pman1 = new Police(5, 3);
		pman1.shot();
		pman1.putHandcuff();

		Police pman2 = new Police(0, 3);
		pman2.shot();
		pman2.putHandcuff();
	}
}
