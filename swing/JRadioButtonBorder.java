import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class ChkBoxHandler implements ItemListener{
	JRadioButton rdo1, rdo2, rdo3;
	ChkBoxHandler(JRadioButton r1, JRadioButton r2, JRadioButton r3){
		rdo1 = r1;	rdo2 = r2;	rdo3 = r3;
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
		rdo1.setEnabled(true);		rdo2.setEnabled(true);		rdo3.setEnabled(true);
		}else{
		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);
		}
	}
}

class JRadioButtonBorder {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 200, 200);
		frm.setLayout(new GridLayout(0, 1));

		JCheckBox chkBox = new JCheckBox("Are you a programer?");

		JRadioButton rdo1 = new JRadioButton("I like C");
		JRadioButton rdo2 = new JRadioButton("I like C++");
		JRadioButton rdo3 = new JRadioButton("I like Java", true);

		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rdo1);	bGroup.add(rdo2);	bGroup.add(rdo3);

		Border rdoBorder = BorderFactory.createEtchedBorder();
		rdoBorder = BorderFactory.createTitledBorder(rdoBorder, "Language");

		JPanel rdoPanel = new JPanel();
		rdoPanel.setLayout(new GridLayout(0, 1));
		rdoPanel.setBorder(rdoBorder);
		rdoPanel.add(rdo1);		rdoPanel.add(rdo2);		rdoPanel.add(rdo3);

		chkBox.addItemListener(new ChkBoxHandler(rdo1, rdo2, rdo3));

		frm.add(chkBox);	frm.add(rdoPanel);

		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);

		rdo1.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C too");
				}
			}	
		);

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
