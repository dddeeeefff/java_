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

class JTextAreaScrollAdded {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JtextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());

		JTextArea textarea = new JTextArea(10, 20);
		textarea.append("���ϴ� ������ �Է��ϼ���.\n");
		textarea.setCaretPosition(textarea.getText().length());


		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);


		JButton btn = new JButton("Clear");
		btn.addActionListener(new ClearButtonHandler(textarea));

//		JScrollPane scroll = new JScrollPane(textarea);
		// JScrollPane : Component Ŭ������ ��ӹ��� ������Ʈ �������� ���� ����
		// �� Contain Ŭ������ ��ӹ޾� �ٸ� ������Ʈ�� ���� �� ����
		// JScrollPane ������ �Ű������� �ϳ��� ����ϸ� ��ũ�ѹٴ� �ʿ��� ���� ������

		JScrollPane scroll = new JScrollPane(textarea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// VERTICAL_SCROLLBAR_ALWAYS : ���� ��ũ�ѹ� �׻� �����ֱ�
		// HORIZONTAL_SCROLLBAR_NEVER : ���� ��ũ�ѹ� ���� �Ⱥ����ֱ�(�ڵ� �ٹٲ� Ǯ� �Ⱥ���)


		frm.add(scroll);		frm.add(btn);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
