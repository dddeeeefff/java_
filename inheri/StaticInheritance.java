class Adder{
	public static int val = 0;
	public void add(int num){val += num;}
}

class AddCount extends Adder{
	public void countAdd(int num){val += num;}
	public void showVal(){System.out.println("val : " + val);}
}


class StaticInheritance {
	public static void main(String[] args) {
		Adder a = new Adder();
		AddCount ac = new AddCount();
		a.add(1);
		ac.countAdd(3);
		AddCount.val += 5;
		// static ����� ����� �Ǿ� ����Ŭ�������� ����Ŭ������ static ����� �����Ӱ� ���� ����
		ac.showVal();
	}
}
