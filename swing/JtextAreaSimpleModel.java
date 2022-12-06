import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ClearButtonHandler implements ActionListener{
	JTextArea area;
	public ClearButtonHandler(JTextArea area){this.area = area;}
	public void actionPerformed(ActionEvent e){
		area.setText("��� �������ϴ�.\n");
		area.append("���ϴ� ������ �Է��ϼ���.\n");
	}
}

class JtextAreaSimpleModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JtextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());

		JTextArea textarea = new JTextArea(10, 20);
		// 10�� 20���� ũ���� JTextArea ����
		textarea.append("���ϴ� ������ �Է��ϼ���.\n");
		// textarea.append(���ڿ�) : txtarea�� ���� �� ���� ������ ���ڿ��� �߰�
		textarea.setCaretPosition(textarea.getText().length());
		// setCaretPosition(int) : ������Ʈ Ŀ���� ��ġ�� ����
		// textarea.getText().length() : textarea���� ���� ������ textarea�� ���� �ڿ� Ŀ����
		// ��ġ��Ű��� �ǹ�

		textarea.setLineWrap(true); // �ڵ� �ٹٲ� ���
		textarea.setWrapStyleWord(true);
		// ���� �ܾ �߰��� �߸��� �ʰ� �ܾ� ��ä�� ������ ��� ���

		JButton btn = new JButton("Clear");
		btn.addActionListener(new ClearButtonHandler(textarea));


		frm.add(textarea);		frm.add(btn);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
