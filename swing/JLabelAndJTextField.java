import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PWHandler implements ActionListener {
	JTextField txtID;
	JPasswordField txtPW;
	public PWHandler(JTextField txtID, JPasswordField txtPW){
		this.txtID = txtID;		this.txtPW = txtPW;
	}
	public void actionPerformed(ActionEvent e){
	// txtPW에서 Enter를 칠 경우 동작하게 될 메소드
		System.out.println("ID : " + txtID.getText());
		// getText() : JTextField의 상위클래스인 JTextComponent에 있음
		System.out.println("Password : " + new String(txtPW.getPassword()));
		// txtPW.getPassword() : txtPW컴포넌트에 입력된 글자들을 Char형 배열로 리턴
		// 리턴받은 Char형 배열을 바로 사용할 수 없으므로 String으로 변환 후 출력

		txtID.setText("");		txtPW.setText("");
		// txtID와 txtPW의 내용을 빈 문자열로 변경
	}
}

class JLabelAndJTextField {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 300, 80);
		frm.setLayout(new GridLayout(2, 2));

		JLabel lblID = new JLabel("ID", SwingConstants.RIGHT);
		JTextField txtID = new JTextField(15);
		// 한번에 15글자가 보일 크기로 JTextField 인스턴스 생성

		JLabel lblPW = new JLabel("Password", SwingConstants.RIGHT);
		JPasswordField txtPW = new JPasswordField(15);
		txtPW.setEchoChar('*');
		// txtPW에 입력하는 글자들을 숨기고 대신 보여줄 글자로 '*'를 지정

		// txtPW에 ActionListener를 장착
		
//		PWHandler action = new PWHandler(txtID, txtPW);

//		txtID.addActionListener(action);
		txtPW.addActionListener(new PWHandler(txtID, txtPW));		

		frm.add(lblID);		frm.add(txtID);
		frm.add(lblPW);		frm.add(txtPW);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
