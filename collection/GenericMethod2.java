class Aa{
	public String toString(){return "class Aa";}
}	

class Bb{
	public String toString(){return "class Bb";}
}	

class InstanceTypeShow2 {
	public <T, U> void showInstType(T inst1, U inst2){
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

class GenericMethod2 {
	public static void main(String[] args) {
		Aa a = new Aa();		Bb b = new Bb();
		InstanceTypeShow2 show = new InstanceTypeShow2();

		show.<Aa, Bb>showInstType(a, b);
		/*class Aa
		  class Bb*/
		// showInstType() �޼ҵ��� �μ��� ����� �ν��Ͻ��� �ڷ����� ���� Aa�� Bb�� ������ �� ȣ��

		show.showInstType(b, a);
		/*class Bb
		  class Aa*/
		// �޼ҵ��� ���׸������� �μ��� �ڷ����� �����Ϸ��� �ľ��Ͽ� ���� �������� �ʾƵ� ��(������ ����)
	}
}
