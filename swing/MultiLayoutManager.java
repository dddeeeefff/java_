import java.awt.*;
import javax.swing.*;

class MultiLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MultiLayout test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());

		JButton btn0 = new JButton("B0");	JButton btn1 = new JButton("B1");
		JButton btn2 = new JButton("B2");	JButton btn3 = new JButton("B3");
		JButton btn4 = new JButton("B4");	JButton btn5 = new JButton("B5");
		JButton btn6 = new JButton("B6");	JButton btn7 = new JButton("B7");
		JButton btn8 = new JButton("B8");	JButton btn9 = new JButton("B9");

		JPanel panel1 = new JPanel();
		// JPanel : 실제로 보이지는 않지만 하나의 컴포넌트(Component 상속)로서 동작함
		// 단, 다른 다른 컨포넌트들을 얹을 수 있고(Container 상속), 배치관리자(LayoutManager)도 지정가능
		panel1.setLayout(new FlowLayout());
		// JPanel panel1 : JPanel인 panel1의 배치관리자로 FlowLayout()을 지정
		panel1.add(btn0);	panel1.add(btn1);
		panel1.add(btn2);	panel1.add(btn3);
		// panel1의 지정한 FlowLayout에 따라 4개의 버튼을 배치시킴

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 3, 2, 2));
		// JPanel panel2 : JPanel인 panel2의 배치관리자로 GridLayout()을 지정
		panel2.add(btn4);	panel2.add(btn5);	panel2.add(btn6);	
		panel2.add(btn7);	panel2.add(btn8);	panel2.add(btn9);
		// panel2의 지정한 GridLayout 따라 6개의 버튼을 배치시킴

		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);
		// 완성된 JPanel을 프레임에 지정된 BorderLayout에 따라 각 영역에 배치시킴

		frm.setVisible(true);
	}
}
