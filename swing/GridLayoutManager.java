import java.awt.*;
import javax.swing.*;

class GridLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new GridLayout(3, 2, 5, 10));
		// GridLayout() : 1행 1열 생성
		// GridLayout(rows, cols) : 행수와 열수를 인수로 생성
		// GridLayout(rows, cols, hgap, vgap) : hgap - 수평간격, vgap - 수직간격

		frm.add(new JButton("1st"));
		frm.add(new JButton("2nd"));
		frm.add(new JButton("3rd"));
		frm.add(new JButton("4th"));
		frm.add(new JButton("5th"));
		frm.add(new JButton("6th"));

		frm.setVisible(true);
	}
}
