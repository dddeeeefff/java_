class Gun{
	int bullet;
	public Gun(int num){bullet = num;}
	public void shot(){
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police extends Gun { // Police has a Gun(Police�� Gun�� �����Ѵٴ� ���� ����)
// ��� Police�� Gun�� �����ؾ߸� �����ϴ� ���谡 ��
// ���� Gun�� �������� �ʴ� Police�� �ִٸ� �� Police�� �ν��Ͻ��� ������ �� ����
	int handcuff;
	public Police(int num, int bcuff){
		super(num);
		handcuff = bcuff;
	}
	public void putHandcuff(){
		System.out.println("SNAP!!");
		handcuff--;
	}
}


class HASInheritance {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shot();
		pman.putHandcuff();
	}
}
