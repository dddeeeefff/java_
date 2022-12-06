import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class GridBagLayoutManager3 {
	public static void main(String[] args) {
		GridBagFrame frm = new GridBagFrame("GridBagLayout Test");

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
class GridBagFrame extends JFrame{
// JFrame을 상속받았으므로 GridBagFrame 클래스는 일종의 프레임으로 동작됨
	public GridBagFrame(String title){
		super(title);	// 받아온 문자열을 타이틀바에서 보여줄 제목으로 지정
		setSize(200, 300);	// 현재 생성되는 프레임의 크기를 지정
		makeUI();
	}
	private void makeUI(){
		setLayout(new GridBagLayout());
		btnInput(0, 0, 1, 1, "A");
		btnInput(1, 0, 1, 1, "B");
		btnInput(0, 1, 1, 1, "C");
		btnInput(1, 1, 1, 1, "D");
		btnInput(0, 2, 2, 1, "E");
		btnInput(0, 3, 1, 2, "F");
		btnInput(1, 3, 1, 1, "G");
		btnInput(1, 4, 1, 1, "H");
	}
	private void btnInput(int x, int y, int w, int h, String s){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = h;
		c.weightx = c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		add(new JButton(s), c);
	}
}