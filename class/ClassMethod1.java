class ClsMethodPrinter
{
	public static void showInt(int n){System.out.println(n);}
	public static void showDouble(double n){System.out.println(n);}
}

class ClassMethod1 {
	public static void main(String[] args) {
		ClsMethodPrinter.showInt(20); // Ŭ���� �޼ҵ嵵 Ŭ������ ���� ���� ����
		ClsMethodPrinter cmp = new ClsMethodPrinter();
		cmp.showDouble(1.2); // �ν��Ͻ��� ���ؼ��� ���� ����
	}
}
