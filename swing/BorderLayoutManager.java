import java.awt.*;
import javax.swing.*;

class BorderLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("BorderLayout test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());
		// BorderLayout : 프레임의 동서남북중앙의 각 지점에 컴포넌트를 배치
		// 동서남북의 지정은 생략되도 중앙부분이 채워주지만, 중앙이 생략되면 채워지지 않음

		frm.add(new JButton("EAST"), BorderLayout.EAST);
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		frm.add(new JButton("CENTER"), BorderLayout.CENTER);

		frm.setVisible(true);
	}
}
