import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowEventHandler implements WindowListener{
// WindowListener는 인터페이스이므로 사용시 모든 메소드를 오버라이딩 해야 하는 번거로움이 존재함
// 그래서 WindowAdapter라는 클래스가 존재하며 본 클래스는 WindowListener의 메소드들을 모두 구현해
// 놓아 필요시 WindowAdapter클래스를 상속받으면 필요한 메소드 하나만 오버라이딩하여 손쉽게 사용할 수 있음
	String info;
	public WindowEventHandler(String info){this.info = info;}

	public void windowOpened(WindowEvent e){
	// 프레임이 열릴 떄 발생하는 이벤트를 처리하는 메소드
		System.out.println(info + " windowOpened");
	}

	public void windowClosing(WindowEvent e){
	// 프레임이 닫힐 떄 발생하는 이벤트를 처리하는 메소드
		JFrame frm = (JFrame)e.getWindow();
		// 이벤트를 일으킨 프레임을 getWindow() 메소드로 가져와 JFrame으로 형변환
		frm.dispose();
		// 이벤트를 일으킨 프레임을 메모리에서 내림(메모리에서 소멸시킴)
		System.out.println(info + " windowClosing");
	}

	public void windowClosed(WindowEvent e){
	// 프레임이 닫혔을 때 발생하는 이벤트를 처리하는 메소드
		System.out.println(info + " windowClosed");
	}

	public void windowActivated(WindowEvent e){
	// 프레임이 활성화 될 때 발생하는 이벤트를 처리하는 메소드
		System.out.println(info + " windowActivated");
	}

	public void windowDeactivated(WindowEvent e){
	// 프레임이 비활성화 될 때 발생하는 이벤트를 처리하는 메소드
		System.out.println(info + " windowDeactivated");
	}

	public void windowIconified(WindowEvent e){
	// 프레임이 최소화 될 때 발생하는 이벤트를 처리하는 메소드
		System.out.println(info + " windowIconified");
	}

	public void windowDeiconified(WindowEvent e){
	// 프레임이 원래 크기로 복원될 때 발생하는 이벤트를 처리하는 메소드
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
