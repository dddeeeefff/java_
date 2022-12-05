import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 마우스 드래그 이벤트 발생시 마우스의 좌표를 출력하는 이벤트 리스너 제작
class MouseMotionHandler2 extends MouseMotionAdapter {
// MouseMotionAdapter : MouseMotionListener 인터페이스를 implements 한 클래스로 여러 메소드를 전부
// 오버라이딩 하지 않고 필요한 메소드만 오버라이딩하여 사용할 수 있게 해줌
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
