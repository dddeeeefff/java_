import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowEventHandler implements WindowListener{
// WindowListener�� �������̽��̹Ƿ� ���� ��� �޼ҵ带 �������̵� �ؾ� �ϴ� ���ŷο��� ������
// �׷��� WindowAdapter��� Ŭ������ �����ϸ� �� Ŭ������ WindowListener�� �޼ҵ���� ��� ������
// ���� �ʿ�� WindowAdapterŬ������ ��ӹ����� �ʿ��� �޼ҵ� �ϳ��� �������̵��Ͽ� �ս��� ����� �� ����
	String info;
	public WindowEventHandler(String info){this.info = info;}

	public void windowOpened(WindowEvent e){
	// �������� ���� �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowOpened");
	}

	public void windowClosing(WindowEvent e){
	// �������� ���� �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		JFrame frm = (JFrame)e.getWindow();
		// �̺�Ʈ�� ����Ų �������� getWindow() �޼ҵ�� ������ JFrame���� ����ȯ
		frm.dispose();
		// �̺�Ʈ�� ����Ų �������� �޸𸮿��� ����(�޸𸮿��� �Ҹ��Ŵ)
		System.out.println(info + " windowClosing");
	}

	public void windowClosed(WindowEvent e){
	// �������� ������ �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowClosed");
	}

	public void windowActivated(WindowEvent e){
	// �������� Ȱ��ȭ �� �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowActivated");
	}

	public void windowDeactivated(WindowEvent e){
	// �������� ��Ȱ��ȭ �� �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowDeactivated");
	}

	public void windowIconified(WindowEvent e){
	// �������� �ּ�ȭ �� �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowIconified");
	}

	public void windowDeiconified(WindowEvent e){
	// �������� ���� ũ��� ������ �� �߻��ϴ� �̺�Ʈ�� ó���ϴ� �޼ҵ�
		System.out.println(info + " windowDeiconified");
	}
}

class JFrameWindowEvent {
	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		frmOne.setBounds(120, 120, 250, 150);
		JFrame frmTwo = new JFrame("Frame Two");
		frmTwo.setBounds(120, 120, 250, 150);

		frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));

		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));

		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}
