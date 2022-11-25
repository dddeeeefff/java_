class Orange{
	int sugar;
	public Orange(int s){sugar = s;}
	public void showSugar(){System.out.println("�絵 : " + sugar);}
}

class FruitBox{ // �����̵� ���� ������ �ڽ�
	Object item;
	public void store(Object item){this.item = item;}
	public Object pullOut(){return item;}
}

class FruitBoxObject {
	public static void main(String[] args) {
		FruitBox box1 = new FruitBox();
		box1.store(new Orange(10));
		Orange org1 = (Orange)box1.pullOut();
		// pullOut() �޼ҵ�� ������ ��ü�� JVM���� Object�� �νĵǱ� ������ 
		// OrangeŬ������ �ִ� �޼ҵ��� showSugar() �޼ҵ带 ����Ϸ��� Orange������ ����ȯ �ؾ� ��
		org1.showSugar();

		FruitBox box2 = new FruitBox();
		box2.store("������");
		Orange org2 = (Orange)box2.pullOut();
		// box2�� ����ִ� item�� ���ڿ��̹Ƿ� Orange�� ����ȯ�� ClassCastException ���ܰ� �߻�
		org2.showSugar();
	}
}

/*
������
 - FruitBox���� �����ϴ� item�� Object�̹Ƿ� �ƹ� ��ü�� ���͵� ����(�����Ͻ�)�� �߻����� ����
 - �������� �̻���� ����ǳ� ���α׷� ���� �� ���ܰ� �߻��� �� ����

�ذ�å : FruitBoxOrange.java
 - Object�� ����� item�� Ư�� Ŭ���� �ڷ������� �����Ͽ� �����Ͻ� �ٸ� �ڷ����� ������ ������ �߻���Ű�� ��
*/
