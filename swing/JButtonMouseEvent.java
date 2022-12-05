import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener {
	public void mouseClicked(MouseEvent e){
		System.out.println("마우스 버튼 클릭");
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
		// MouseListener는 인터페이스이므로 인스턴스 생성이 불가하여 MouseListener를 implements한
		// MouseEventHandler 클래스를 통해 인스턴스 생성

		JButton btn1 = new JButton("Button One");
		btn1.addMouseListener(listener);
		// btn1 컴포넌트에 마우스 관련 이벤트 리스너를 장착해줌
		JButton btn2 = new JButton("Button One");
		btn2.addMouseListener(listener);

		frm.add(btn1);		frm.add(btn2);
		btn1.setEnabled(false); // btn1 컴포넌트를 비활성화 시킴
		// 버튼이 아닌 마우스의 이벤트이므로 버튼의 비활성화는 상관없이 동작하게 됨

		frm.setVisible(true);
	}
}
