import java.awt.*;

class FirstAWT {
	public static void main(String[] args) {
		Frame frm = new Frame("First AWT");
		// ����ǥ����(title bar)���� ������ ���ڿ��� �μ��� ������ �ν��Ͻ��� ����
		frm.setBounds(200, 120, 500, 300);
		// ������ �������� ��ġ(x[200], y[120]��ǥ)�� ũ��(w[500],h[300]) ����
		frm.setLayout(new FlowLayout());
		// �����ӿ����� ������Ʈ�� ���� ��� ���� / FlowLayout�� �⺻������ ��� ��ġ

		Button btn1 = new Button("1st Button");
		Button btn2 = new Button("2nd Button");
		Button btn3 = new Button("3rd Button");
		// ĸ������ ���� ���ڿ��� �μ��� �Ͽ� ��ư ��ü 3�� ����

		frm.add(btn1);		frm.add(btn2);		frm.add(btn3);
		// frm �����ӿ� 3���� ��ư ������Ʈ�� ������ FlowLayout()�� ���� ��ġ��

		frm.setVisible(true);
		// �������� �⺻������ ������ �ʰ� �����Ǿ� �־� �����ַ��� setVisible() �޼ҵ带 �̿��ؾ� ��
	}
}
