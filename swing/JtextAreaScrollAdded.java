import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ClearButtonHandler implements ActionListener{
	JTextArea area;
	public ClearButtonHandler(JTextArea area){this.area = area;}
	public void actionPerformed(ActionEvent e){
		area.setText("모두 지웠습니다.\n");
		area.append("원하는 내용을 입력하세요.\n");
	}
}

class JTextAreaScrollAdded {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JtextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());

		JTextArea textarea = new JTextArea(10, 20);
		textarea.append("원하는 내용을 입력하세요.\n");
		textarea.setCaretPosition(textarea.getText().length());


		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);


		JButton btn = new JButton("Clear");
		btn.addActionListener(new ClearButtonHandler(textarea));

//		JScrollPane scroll = new JScrollPane(textarea);
		// JScrollPane : Component 클래스를 상속받은 컴포넌트 일종으로 동작 가능
		// 또 Contain 클래스도 상속받아 다른 컴포넌트를 얹을 수 있음
		// JScrollPane 생성시 매개변수를 하나만 사용하면 스크롤바는 필요할 때만 생성됨

		JScrollPane scroll = new JScrollPane(textarea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// VERTICAL_SCROLLBAR_ALWAYS : 수직 스크롤바 항상 보여주기
		// HORIZONTAL_SCROLLBAR_NEVER : 수평 스크롤바 절대 안보여주기(자동 줄바꿈 풀어도 안보임)


		frm.add(scroll);		frm.add(btn);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
