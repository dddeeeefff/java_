import java.awt.*;
import javax.swing.*;

class MultiLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("MultiLayout test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());

		JButton btn0 = new JButton("B0");	JButton btn1 = new JButton("B1");
		JButton btn2 = new JButton("B2");	JButton btn3 = new JButton("B3");
		JButton btn4 = new JButton("B4");	JButton btn5 = new JButton("B5");
		JButton btn6 = new JButton("B6");	JButton btn7 = new JButton("B7");
		JButton btn8 = new JButton("B8");	JButton btn9 = new JButton("B9");

		JPanel panel1 = new JPanel();
		// JPanel : ������ �������� ������ �ϳ��� ������Ʈ(Component ���)�μ� ������
		// ��, �ٸ� �ٸ� ������Ʈ���� ���� �� �ְ�(Container ���), ��ġ������(LayoutManager)�� ��������
		panel1.setLayout(new FlowLayout());
		// JPanel panel1 : JPanel�� panel1�� ��ġ�����ڷ� FlowLayout()�� ����
		panel1.add(btn0);	panel1.add(btn1);
		panel1.add(btn2);	panel1.add(btn3);
		// panel1�� ������ FlowLayout�� ���� 4���� ��ư�� ��ġ��Ŵ

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 3, 2, 2));
		// JPanel panel2 : JPanel�� panel2�� ��ġ�����ڷ� GridLayout()�� ����
		panel2.add(btn4);	panel2.add(btn5);	panel2.add(btn6);	
		panel2.add(btn7);	panel2.add(btn8);	panel2.add(btn9);
		// panel2�� ������ GridLayout ���� 6���� ��ư�� ��ġ��Ŵ

		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);
		// �ϼ��� JPanel�� �����ӿ� ������ BorderLayout�� ���� �� ������ ��ġ��Ŵ

		frm.setVisible(true);
	}
}
