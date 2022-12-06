import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GridBagLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridBagLayout Model");
		frm.setBounds(120, 120, 300, 400);
		frm.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();
		// GridBagLayout 사용시 컴포넌트에 지정할 각종 옵션 값을 저장할 인스턴스

		JButton btn1 = new JButton("1");		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");		JButton btn4 = new JButton("4");

		c.gridx = 0;		// 컴포넌트의 열 위치
		c.gridy = 0;		// 컴포넌트의 행 위치
		c.gridwidth = 1;	// 컴포넌트가 차지할 가로(오른쪽) 칸수(tb 태그의 colspan 속성과 같은 기능을 함)
		c.gridheight = 1;	// 컴포넌트가 차지할 세로(아래쪽) 칸수(tb 태그의 rowspan 속성과 같은 기능을 함)
		c.weightx = 1.0;	// 컴포넌트 사이의 가로 간격
		c.weighty = 1.0;	// 컴포넌트 사이의 세로 간격
		c.fill = GridBagConstraints.NONE;
		// 주어진 한 칸의 공간에서 컴포넌트가 채워지는 방법을 상수로 지정
		frm.add(btn1, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		frm.add(btn2, c);

		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.VERTICAL;
		frm.add(btn3, c);

		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		frm.add(btn4, c);

/*
GridBagConstraints.NONE : 컴포넌트를 늘리기 없이 기본크기로 채우기
GridBagConstraints.HORIZONTAL : 컴포넌트를 수평으로 늘려 채우기
GridBagConstraints.VERTICAL : 컴포넌트를 수직으로 늘려 채우기
GridBagConstraints.BOTH : 컴포넌트를 수평과 수직 모두 늘려 채우기
*/
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
