import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.*; // java에서 javascript를 사용하기 위한 import

class SwingCalculator extends JFrame implements ActionListener{
	String expr = ""; // 현재 입력되어 있는 수식을 저장할 변수
	JTextField txtExpr;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnCe, btnPls, btnMin, btnMul, btnDiv, btnDot, btnEqual;
	JButton btnBket1, btnBket2;
	public SwingCalculator(String title){
		super(title);
		setBounds(120, 120, 250, 250);
		setCalculator();

		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e){
		expr = txtExpr.getText(); // 현재 수식을 받아 expr에 저장
		String tmp = e.getActionCommand(); // 클릭한 버튼의 캡션을 받아와서 tmp에 저장

		if(tmp.equals("CE")){
			txtExpr.setText("0");
			expr = "0";
		}else if(tmp.equals("=")){
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine engine = sem.getEngineByName("JavaScript");
			try{
				String sol = engine.eval(expr).toString();
				txtExpr.setText(sol);
			}
			catch (ScriptException ex){
				ex.printStackTrace();
			}

		}else{
			char[] arrOp = {'+', '-', '*', '/', '.'};
			char endChr = expr.charAt(expr.length() - 1); 
			// 현재 수식의 마지막 글자를 추출하여 endChr에 저장
			boolean isOp = false; // 연산자인지 여부를 저장할 변수
			for(char c : arrOp){
				if(endChr == c){ // 현재 수식의 마지막 글자가 연산자이면
					isOp = true;	break;
				}
			}
			if(isOp){ // 현재 수식의 마지막 글자가 연산자이면
				for(int i = 0; i < arrOp.length; i++){
					if(tmp.equals(arrOp[i] + "")) return;
					// 수식의 마지막 글자와 현재 입력한 글자가 연산자이면 수식에 
					// 누적되지 않고 메소드 종료
				}
			}
			if(expr.equals("0")) expr = tmp; // 기존 수식이 "0"일 경우 현재 입력한 글자를 기존 수식에 덮어쓰기
			else				 expr += tmp; // 현재 입력한 글자를 기존 수식에 추가

			txtExpr.setText(expr);
		}
	}
	private void setCalculator(){
		setLayout(new GridBagLayout());
		
		txtExpr = new JTextField(35);	txtExpr.setText("0");
		txtExpr.setHorizontalAlignment(JTextField.RIGHT);
		btn0	 = new JButton("0");		btn0.addActionListener(this);
		btn1	 = new JButton("1");		btn1.addActionListener(this);
		btn2	 = new JButton("2");		btn2.addActionListener(this);
		btn3	 = new JButton("3");		btn3.addActionListener(this);
		btn4	 = new JButton("4");		btn4.addActionListener(this);
		btn5	 = new JButton("5");		btn5.addActionListener(this);
		btn6	 = new JButton("6");		btn6.addActionListener(this);
		btn7	 = new JButton("7");		btn7.addActionListener(this);
		btn8	 = new JButton("8");		btn8.addActionListener(this);
		btn9	 = new JButton("9");		btn9.addActionListener(this);
		btnCe	 = new JButton("CE");		btnCe.addActionListener(this);
		btnPls	 = new JButton("+");		btnPls.addActionListener(this);
		btnMin	 = new JButton("-");		btnMin.addActionListener(this);
		btnMul	 = new JButton("*");		btnMul.addActionListener(this);
		btnDiv	 = new JButton("/");		btnDiv.addActionListener(this);
		btnDot	 = new JButton(".");		btnDot.addActionListener(this);
		btnEqual = new JButton("=");		btnEqual.addActionListener(this);
		btnBket1 = new JButton("(");		btnBket1.addActionListener(this);
		btnBket2 = new JButton(")");		btnBket2.addActionListener(this);

		setCompo(0, 0, 5, 1, txtExpr);	setCompo(0, 1, 1, 1, btn1);
		setCompo(1, 1, 1, 1, btn2);		setCompo(2, 1, 1, 1, btn3);
		setCompo(3, 1, 2, 1, btnCe);	setCompo(0, 2, 1, 1, btn4);
		setCompo(1, 2, 1, 1, btn5);		setCompo(2, 2, 1, 1, btn6);
		setCompo(3, 2, 1, 1, btnPls);	setCompo(4, 2, 1, 1, btnMin);
		setCompo(0, 3, 1, 1, btn7);		setCompo(1, 3, 1, 1, btn8);
		setCompo(2, 3, 1, 1, btn9);		setCompo(3, 3, 1, 1, btnMul);
		setCompo(4, 3, 1, 1, btnDiv);	setCompo(0, 4, 1, 1, btnBket1);
		setCompo(1, 4, 1, 1, btn0);		setCompo(2, 4, 1, 1, btnBket2);
		setCompo(3, 4, 1, 1, btnDot);	setCompo(4, 4, 1, 1, btnEqual);
		}
	private void setCompo(int x, int y, int w, int h, Object obj){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;		c.gridy = y;		// obj의 위치(열, 행)
		c.gridwidth = w;	c.gridheight = h;	// obj의 셀병합 및 여부
		c.weightx = c.weighty = 1.0;			// 컴포넌트들 간의 공간

		if(obj instanceof JTextField){
			c.fill = GridBagConstraints.HORIZONTAL;
			add((JTextField)obj, c);
		}else{
			c.fill = GridBagConstraints.BOTH;
			add((JButton)obj, c);
		}
	}
}



class SwingCalculatorMainp {
	public static void main(String[] args) {
		SwingCalculator frm = new SwingCalculator("Calculator Test");
	}
}
