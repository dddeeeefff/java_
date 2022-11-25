class Orange{
	int sugar;
	public Orange(int s){sugar = s;}
	public void showSugar(){System.out.println("�絵 : " + sugar);}
}

class OrangeBox{ 
	Orange item;
	public void store(Orange item){this.item = item;}
	public Orange pullOut(){return item;}
}

class FruitBoxOrange {
	public static void main(String[] args) {
		OrangeBox box1 = new OrangeBox();
		box1.store(new Orange(10));
		Orange org1 = (Orange)box1.pullOut();
		org1.showSugar();

		OrangeBox box2 = new OrangeBox();
		box2.store("������");
		Orange org2 = (Orange)box2.pullOut();
		org2.showSugar();
	}
}

/*
������
 - OrangeBox�� ���� Orange�� ����ǰ� ��
 - �ٸ� ������ ���� �ν��Ͻ��� �����Ϸ��� �� ���Ϻ��� ~Box Ŭ������ �����ؾ� ��

�ذ�å : FruitBoxGeneric.java
 - ���׸��� �̿��Ͽ� ����� Ŭ������ ������ ������

*/
