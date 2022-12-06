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
	// txtPW���� Enter�� ĥ ��� �����ϰ� �� �޼ҵ�
		System.out.println("ID : " + txtID.getText());
		// getText() : JTextField�� ����Ŭ������ JTextComponent�� ����
		System.out.println("Password : " + new String(txtPW.getPassword()));
		// txtPW.getPassword() : txtPW������Ʈ�� �Էµ� ���ڵ��� Char�� �迭�� ����
		// ���Ϲ��� Char�� �迭�� �ٷ� ����� �� �����Ƿ� String���� ��ȯ �� ���

		txtID.setText("");		txtPW.setText("");
		// txtID�� txtPW�� ������ �� ���ڿ��� ����
	}
}

class JLabelAndJTextField {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 300, 80);
		frm.setLayout(new GridLayout(2, 2));

		JLabel lblID = new JLabel("ID", SwingConstants.RIGHT);
		JTextField txtID = new JTextField(15);
		// �ѹ��� 15���ڰ� ���� ũ��� JTextField �ν��Ͻ� ����

		JLabel lblPW = new JLabel("Password", SwingConstants.RIGHT);
		JPasswordField txtPW = new JPasswordField(15);
		txtPW.setEchoChar('*');
		// txtPW�� �Է��ϴ� ���ڵ��� ����� ��� ������ ���ڷ� '*'�� ����

		// txtPW�� ActionListener�� ����
		
//		PWHandler action = new PWHandler(txtID, txtPW);

//		txtID.addActionListener(action);
		txtPW.addActionListener(new PWHandler(txtID, txtPW));		

		frm.add(lblID);		frm.add(txtID);
		frm.add(lblPW);		frm.add(txtPW);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
