/*
�غ��� ���� ������ ������ �� �ִ� Triangle Ŭ���� ����
1.�ν��Ͻ� ������ ���ÿ� ����������� �ʱ�ȭ ��Ŵ
2. �غ��� ���� ������ ������ �� �ִ� �޼ҵ� ����
3. �ﰢ���� ���̸� ���Ͽ� �����ϴ� �޼ҵ� ����
 - �غ� 10.2, ���� 17.3�� �ﰢ�� �ν��Ͻ� ���� �� ���� ���
 - �غ� 9.2, ���� 7.5�� ������ �� �ٽ� ���� ���
*/


class Triangle
{
	double bottom, height; // �غ��� ���̸� ������ �������
	Triangle(double b, double h){
		bottom = b; height = h;
		//�Ŵ뺯���� �޾ƿ� ������ ��������� �־� �ʱ�ȭ ��Ŵ
	}
	public void setBottom(double b){bottom = b;}
	public void setHeight(double h){height = h;}
	public double getArea(){return bottom * height / 2;}
}


class TriangleMain {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("�ﰢ���� ���� : " + tr.getArea());

		tr.setBottom(9.2); tr.setHeight(7.5);
		System.out.println("�ﰢ���� ���� : " + tr.getArea());
	}
}
