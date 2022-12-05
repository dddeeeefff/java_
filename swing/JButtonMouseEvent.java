import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener {
	public void mouseClicked(MouseEvent e){
		System.out.println("���콺 ��ư Ŭ��");
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}

class JButtonMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Event Check");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new FlowLayout());

		MouseListener listener = new MouseEventHandler();
		// MouseListener�� �������̽��̹Ƿ� �ν��Ͻ� ������ �Ұ��Ͽ� MouseListener�� implements��
		// MouseEventHandler Ŭ������ ���� �ν��Ͻ� ����

		JButton btn1 = new JButton("Button One");
		btn1.addMouseListener(listener);
		// btn1 ������Ʈ�� ���콺 ���� �̺�Ʈ �����ʸ� ��������
		JButton btn2 = new JButton("Button One");
		btn2.addMouseListener(listener);

		frm.add(btn1);		frm.add(btn2);
		btn1.setEnabled(false); // btn1 ������Ʈ�� ��Ȱ��ȭ ��Ŵ
		// ��ư�� �ƴ� ���콺�� �̺�Ʈ�̹Ƿ� ��ư�� ��Ȱ��ȭ�� ������� �����ϰ� ��

		frm.setVisible(true);
	}
}
