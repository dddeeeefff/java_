import java.awt.*;
import javax.swing.*;

class LargeButton extends JButton{
// JButton클래스를 상속받았으므로 LargeButton클래스의 인스턴스는 일종의 버튼 컴포넌트로 취급됨
	public LargeButton(String title){
		super(title);
	}
	public Dimension getPreferredSize(){
		Dimension LargeBtn = new Dimension(
			super.getPreferredSize().width + 20,
			super.getPreferredSize().height + 15);
		
		return LargeBtn;
	}
}

class FlowLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout test");
		frm.setBounds(120, 120, 400, 200);
		frm.setLayout(new FlowLayout());
		// FlowLayout : 컴포넌트들을 프레임 상단의 중앙부터 차례로 채워나가는 형태의 레이아웃 매니저
		// 프레임의 크기가 변하면 배치되었던 컴포넌트의 위치도 변경될 수 있음

		// frm에 JButton 3개와 LargeButton 3개를 배치한 후 프레임 띄우기


		frm.add(new JButton("1st Button"));
		frm.add(new JButton("2nd Button"));
		frm.add(new JButton("3rd Button"));
		frm.add(new LargeButton("1st LargeButton"));
		frm.add(new LargeButton("2nd LargeButton"));
		frm.add(new LargeButton("3rd LargeButton"));

		frm.setVisible(true);

	}
}
