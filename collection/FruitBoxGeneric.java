class Orange{
	int sugar;
	public Orange(int s){sugar = s;}
	public void showSugar(){System.out.println("�絵 : " + sugar);}
}

class Apple{
	int weight;
	public Apple(int w){weight = w;}
	public void showWeight(){System.out.println("���� : " + weight);}
}

class FruitBox<T>{ 
// FruitBox<T> : FruitBox Ŭ������ �ν��Ͻ� ������ ���� ������ �� <T>�� �ش��ϴ� �ڷ��� Ŭ������ �Է��϶�� �ǹ�
// <T>�� �⺻������ Object�� �ǹ��ϹǷ� � ������ Ŭ������ �Է��ص� ������� - T��� �� �ڷ����� ����
	T item;
	public void store(T item){this.item = item;}
	public T pullOut(){return item;}
}

class FruitBoxGeneric {
	public static void main(String[] args) {
		FruitBox<Orange> box1 = new FruitBox<Orange>();
		// FruitBox<Orange> : FruitBox�� �ν��Ͻ� ������ <T>��� Orange�� �־�
		// �ݵ�� OrangeŬ������ �ش��ϴ� �����͸��� ����ؾ� �Ѵٴ� �������� ����
		box1.store(new Orange(10)); // Orange �ν��Ͻ��� �ƴ� �ٸ� �ڷ����� ������ �����߻�
		Orange org1 = box1.pullOut();
		// box1 �ν��Ͻ� ������ ���׸����� Orange�� �����߱� ������ ���� ����ȯ�� ���� �ʾƵ� ��
		org1.showSugar();

		FruitBox<Apple> box2 = new FruitBox<Apple>();
		// FruitBox�� �ν��Ͻ� ������ <T>��� Apple Ŭ������ �־� Apple �ν��Ͻ��� ����ϰڴٴ� �ǹ�
		box2.store(new Apple(20));
		Apple app1 = box2.pullOut();
		app1.showWeight();

		FruitBox box3 = new FruitBox();
		// FruitBox�� �ν��Ͻ� ������ ���׸����� �������� �ʾ����Ƿ� <T>�� Object�� �νĵ�
		box3.store(new Apple(30));
		// ���׸����� Ư�� �ڷ����� �������� �ʾ����Ƿ� String���� ���� ������� �ν��Ͻ��� �� �� ����
		// �׷��� �Ǹ� �����Ͻÿ��� ������ ������ ����� ClassCastException ���ܰ� �߻��� �� ����
		Apple app2 = (Apple)box3.pullOut();
		// ���׸����� Ư�� �ڷ����� �������� �ʾ����Ƿ� pullOut()���� �޾ƿ� ��ü�� ����ȯ�ؼ� ����ؾ� ��
		app2.showWeight();
	}
}


