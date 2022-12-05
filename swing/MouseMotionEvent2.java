import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ���콺 �巡�� �̺�Ʈ �߻��� ���콺�� ��ǥ�� ����ϴ� �̺�Ʈ ������ ����
class MouseMotionHandler2 extends MouseMotionAdapter {
// MouseMotionAdapter : MouseMotionListener �������̽��� implements �� Ŭ������ ���� �޼ҵ带 ����
// �������̵� ���� �ʰ� �ʿ��� �޼ҵ常 �������̵��Ͽ� ����� �� �ְ� ����
	public void mouseDragged(MouseEvent e){
		System.out.printf("Drag [%d, %d]\n", e.getX(), e.getY());
	}
}

class MouseMotionEvent2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion Event");
		frm.setBounds(120, 120, 250, 150);
		frm.addMouseMotionListener(new MouseMotionHandler2());

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
