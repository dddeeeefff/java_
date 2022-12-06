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

class JtextAreaSimpleModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JtextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());

		JTextArea textarea = new JTextArea(10, 20);
		// 10행 20열의 크기의 JTextArea 생성
		textarea.append("원하는 내용을 입력하세요.\n");
		// textarea.append(문자열) : txtarea의 내용 맨 끝에 지정한 문자열을 추가
		textarea.setCaretPosition(textarea.getText().length());
		// setCaretPosition(int) : 컴포넌트 커서의 위치를 지정
		// textarea.getText().length() : textarea내의 글자 개수로 textarea의 가장 뒤에 커서를
		// 위치시키라는 의미

		textarea.setLineWrap(true); // 자동 줄바꿈 사용
		textarea.setWrapStyleWord(true);
		// 영문 단어가 중간에 잘리지 않고 단어 통채로 내리는 기능 사용

		JButton btn = new JButton("Clear");
		btn.addActionListener(new ClearButtonHandler(textarea));


		frm.add(textarea);		frm.add(btn);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
