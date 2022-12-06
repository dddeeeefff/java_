import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChkBoxHandler implements ItemListener{
// ItemListener : üũ�ڽ�, ������ư, �޺��ڽ� �� ����ڰ� �����ϴ� ������Ʈ���� ����Ű�� �̺�Ʈ�� ó���ϴ�
// �������̽�
	JRadioButton rdo1, rdo2, rdo3;
	ChkBoxHandler(JRadioButton r1, JRadioButton r2, JRadioButton r3){
		rdo1 = r1;	rdo2 = r2;	rdo3 = r3;
	}
	public void itemStateChanged(ItemEvent e){
	// ItemListener�� ���� �� �ϳ��� �޼ҵ�� ������ �������� ���� ���°� �ٲ�� ���۵Ǵ� �޼ҵ��̸�, ���⼭��
	// checkbox ��ü�� ���û��°� ���� �� ������
		if(e.getStateChange() == ItemEvent.SELECTED){
		// ���� �Ͼ �̺�Ʈ�� �ٲ� ���°� '����'�Ǿ� �ִ� ���¸�
		rdo1.setEnabled(true);		rdo2.setEnabled(true);		rdo3.setEnabled(true);
		// rdo1~3 ������Ʈ�� ��� Ȱ��ȭ��Ŵ
		}else{
		// ���� �Ͼ �̺�Ʈ�� �ٲ� ���°� '��������'�Ǿ� �ִ� ���¸�
		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);
		// rdo1~3 ������Ʈ�� ��� ��Ȱ��ȭ��Ŵ
		}
	}
}

class JCheckBoxAndRadioButton {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 200, 200);
		frm.setLayout(new GridLayout(0, 1));
		// GridLayout()�� ����� 0�� ������ ���� ������ ���ֹ��� �ʰ� ��� ���� �� ����

		JCheckBox chkBox = new JCheckBox("Are you a programer?");

		JRadioButton rdo1 = new JRadioButton("I like C");
		JRadioButton rdo2 = new JRadioButton("I like C++");
		JRadioButton rdo3 = new JRadioButton("I like Java", true);

		ButtonGroup bGroup = new ButtonGroup();
		// ���� ���� ���� ��ư�� �ϳ��� �׷����� �����ִ� ����
		bGroup.add(rdo1);	bGroup.add(rdo2);	bGroup.add(rdo3);

		chkBox.addItemListener(new ChkBoxHandler(rdo1, rdo2, rdo3));
		// üũ�ڽ��� �̺�Ʈ ������ ����

		frm.add(chkBox);	frm.add(rdo1);		frm.add(rdo2);		frm.add(rdo3);

		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);
		// ���� ��ư���� ��Ȱ��ȭ

		rdo1.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C too");
				}
			}	
		); // �͸� �γ� Ŭ������ �̺�Ʈ�� ���� ó���� �ϼ�(�� ���� ����� �� ����)

		rdo2.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C++ too");
				}
			}	
		);

		rdo3.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like Java too");
				}
			}	
		);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
