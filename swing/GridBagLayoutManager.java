import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GridBagLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridBagLayout Model");
		frm.setBounds(120, 120, 300, 400);
		frm.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();
		// GridBagLayout ���� ������Ʈ�� ������ ���� �ɼ� ���� ������ �ν��Ͻ�

		JButton btn1 = new JButton("1");		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");		JButton btn4 = new JButton("4");

		c.gridx = 0;		// ������Ʈ�� �� ��ġ
		c.gridy = 0;		// ������Ʈ�� �� ��ġ
		c.gridwidth = 1;	// ������Ʈ�� ������ ����(������) ĭ��(tb �±��� colspan �Ӽ��� ���� ����� ��)
		c.gridheight = 1;	// ������Ʈ�� ������ ����(�Ʒ���) ĭ��(tb �±��� rowspan �Ӽ��� ���� ����� ��)
		c.weightx = 1.0;	// ������Ʈ ������ ���� ����
		c.weighty = 1.0;	// ������Ʈ ������ ���� ����
		c.fill = GridBagConstraints.NONE;
		// �־��� �� ĭ�� �������� ������Ʈ�� ä������ ����� ����� ����
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
GridBagConstraints.NONE : ������Ʈ�� �ø��� ���� �⺻ũ��� ä���
GridBagConstraints.HORIZONTAL : ������Ʈ�� �������� �÷� ä���
GridBagConstraints.VERTICAL : ������Ʈ�� �������� �÷� ä���
GridBagConstraints.BOTH : ������Ʈ�� ����� ���� ��� �÷� ä���
*/
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
