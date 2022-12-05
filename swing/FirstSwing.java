import java.awt.*;
import javax.swing.*;

class FirstSwing {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		// ����ǥ����(title bar)���� ������ ���ڿ��� �μ��� ������ �ν��Ͻ��� ����
		// java.awt.Container Ŭ������ ��ӹ��� - �ٸ� ������Ʈ�� ���� �� �ִٴ� �ǹ�
		frm.setBounds(200, 120, 500, 300);
		// ������ �������� ��ġ�� ũ�⸦ ����
		// setBounds(x��ǥ, y��ǥ, ������ �ʺ�, ������ ����)
		frm.setLayout(new FlowLayout());
		// �����ӿ����� ������Ʈ ��ġ ��� ����
		// FlowLayout() : ���̾ƿ� �� �⺻ ���̾ƿ����� ������Ʈ�� ������� �����ӿ� �ø��� ���̾ƿ��̸�,
		// ��� ������ �ڵ����� �̷���

		JButton btn1 = new JButton("1st Button");
		JButton btn2 = new JButton("2nd Button");
		JButton btn3 = new JButton("3rd Button");
		// ĸ������ ���� ���ڿ��� �μ��� �Ͽ� ��ư ��ü 3�� ����
		// swing�� ������Ʈ���� �⺻������ AWT�� ������Ʈ���� ��ӹ޾� �۾��ϸ�, ���� �̸� �տ� J�� ����

		frm.add(btn1);		frm.add(btn2);		frm.add(btn3);
		// frm �����ӿ� 3���� ��ư ������Ʈ�� ������ FlowLayout()�� ���� ��ġ��

		frm.setVisible(true);
		// �������� �⺻������ ������ �ʰ� �����Ǿ� �־� �����ַ��� setVisible() �޼ҵ带 �̿��ؾ� ��
	}
}
