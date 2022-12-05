import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ActionEventHandler implements ActionListener{
// ActionListener : 컴포넌트별 특정 행위 관련 이벤트를 감지하는 리스터로 actionPerformed() 메소드만 존재
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());
	}
}

class JButtonActionEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Action");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new FlowLayout());

		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");

		ActionListener action = new ActionEventHandler();
		btn1.addActionListener(action);
		btn2.addActionListener(action);

		frm.add(btn1);		frm.add(btn2);
		btn1.setEnabled(false);

		frm.setVisible(true);
	}
}
