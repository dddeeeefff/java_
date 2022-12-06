import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GridBagLayoutManager2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridBagLayout Model");
		frm.setBounds(120, 120, 300, 400);
		frm.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();

		JButton btn1 = new JButton("1");		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");		JButton btn4 = new JButton("4");

		// c의 옵션들을 지정할 메소드 호출
		makeUI(c, 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NONE, btn1, frm);
		makeUI(c, 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.HORIZONTAL, btn2, frm);
		makeUI(c, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.VERTICAL, btn3, frm);
		makeUI(c, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.BOTH, btn4, frm);
		

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void makeUI(GridBagConstraints c, int x, int y, int w, int h, double wx, double wy, int f, JButton btn, JFrame frm){
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = h;
		c.weightx = wx;
		c.weighty = wy;
		c.fill = f;
		frm.add(btn, c);
	}

}
