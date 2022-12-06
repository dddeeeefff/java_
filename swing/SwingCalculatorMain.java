import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingCalculator extends JFrame{
	public Calculator(String title){
		super(title);
		setSize(200, 200);
		makeUI();
	}
	private void makeUI(){
		setLayout(new GridBagLayout());
		btnInput(0, 0, 1, 1, "1");
		btnInput(1, 0, 1, 1, "2");
		btnInput(2, 0, 1, 1, "3");
		btnInput(3, 0, 2, 1, "CE");
		btnInput(0, 1, 1, 1, "4");
		btnInput(1, 1, 1, 1, "5");
		btnInput(2, 1, 1, 1, "6");
		btnInput(3, 1, 1, 1, "+");
		btnInput(4, 1, 1, 1, "-");
		btnInput(0, 2, 1, 1, "7");
		btnInput(1, 2, 1, 1, "8");
		btnInput(2, 2, 1, 1, "9");
		btnInput(3, 2, 1, 1, "*");
		btnInput(4, 2, 1, 1, "/");
		btnInput(0, 3, 1, 1, "(");
		btnInput(1, 3, 1, 1, "0");
		btnInput(2, 3, 1, 1, ")");
		btnInput(3, 3, 1, 1, ".");
		btnInput(4, 3, 1, 1, "=");
	}
	private void btnInput(int x, int y, int w, int h, String s){
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = h;
		c.weightx = c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		add(new JButton(s), c);
	}
}



class SwingCalculatorMain {
	public static void main(String[] args) {
		SwingCalculator clr = new SwingCalculator("Calculator Test");


		clr.setVisible(true);
		clr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
