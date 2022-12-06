import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChkBoxHandler implements ItemListener{
// ItemListener : 체크박스, 라디오버튼, 콤보박스 등 사용자가 선택하는 컴포넌트들이 일으키는 이벤트를 처리하는
// 인터페이스
	JRadioButton rdo1, rdo2, rdo3;
	ChkBoxHandler(JRadioButton r1, JRadioButton r2, JRadioButton r3){
		rdo1 = r1;	rdo2 = r2;	rdo3 = r3;
	}
	public void itemStateChanged(ItemEvent e){
	// ItemListener가 가진 단 하나의 메소드로 지정된 아이템의 선택 상태가 바뀌면 동작되는 메소드이며, 여기서는
	// checkbox 객체의 선택상태가 변할 때 동작함
		if(e.getStateChange() == ItemEvent.SELECTED){
		// 현재 일어난 이벤트로 바뀐 상태가 '선택'되어 있는 상태면
		rdo1.setEnabled(true);		rdo2.setEnabled(true);		rdo3.setEnabled(true);
		// rdo1~3 컴포넌트를 모두 활성화시킴
		}else{
		// 현재 일어난 이벤트로 바뀐 상태가 '선택해제'되어 있는 상태면
		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);
		// rdo1~3 컴포넌트를 모두 비활성화시킴
		}
	}
}

class JCheckBoxAndRadioButton {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 200, 200);
		frm.setLayout(new GridLayout(0, 1));
		// GridLayout()의 행수에 0을 넣으면 행의 개수에 구애받지 않고 계속 넣을 수 있음

		JCheckBox chkBox = new JCheckBox("Are you a programer?");

		JRadioButton rdo1 = new JRadioButton("I like C");
		JRadioButton rdo2 = new JRadioButton("I like C++");
		JRadioButton rdo3 = new JRadioButton("I like Java", true);

		ButtonGroup bGroup = new ButtonGroup();
		// 여러 개의 라디오 버튼을 하나의 그룹으로 묶어주는 역할
		bGroup.add(rdo1);	bGroup.add(rdo2);	bGroup.add(rdo3);

		chkBox.addItemListener(new ChkBoxHandler(rdo1, rdo2, rdo3));
		// 체크박스에 이벤트 리스너 장착

		frm.add(chkBox);	frm.add(rdo1);		frm.add(rdo2);		frm.add(rdo3);

		rdo1.setEnabled(false);		rdo2.setEnabled(false);		rdo3.setEnabled(false);
		// 라디오 버튼들을 비활성화

		rdo1.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					if(e.getStateChange() == ItemEvent.SELECTED)
						System.out.println("I like C too");
				}
			}	
		); // 익명 인너 클래스로 이벤트에 대한 처리를 완성(한 번만 사용할 수 있음)

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
