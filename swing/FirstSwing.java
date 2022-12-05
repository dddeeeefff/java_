import java.awt.*;
import javax.swing.*;

class FirstSwing {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		// 제목표시줄(title bar)에서 보여줄 문자열을 인수로 프레임 인스턴스를 생성
		// java.awt.Container 클래스를 상속받음 - 다른 컨포넌트를 얹을 수 있다는 의미
		frm.setBounds(200, 120, 500, 300);
		// 생성된 프레임의 위치와 크기를 지정
		// setBounds(x좌표, y좌표, 프레임 너비, 프레임 높이)
		frm.setLayout(new FlowLayout());
		// 프레임에서의 컨포넌트 배치 방법 지정
		// FlowLayout() : 레이아웃 중 기본 레이아웃으로 컨포넌트를 순서대로 프레임에 올리는 레이아웃이며,
		// 가운데 정렬이 자동으로 이뤄짐

		JButton btn1 = new JButton("1st Button");
		JButton btn2 = new JButton("2nd Button");
		JButton btn3 = new JButton("3rd Button");
		// 캡션으로 사용될 문자열을 인수로 하여 버튼 객체 3개 생성
		// swing의 컴포넌트들은 기본적으로 AWT의 컴포넌트들을 상속받아 작업하며, 보통 이름 앞에 J를 붙임

		frm.add(btn1);		frm.add(btn2);		frm.add(btn3);
		// frm 프레임에 3개의 버튼 컴포넌트를 지정된 FlowLayout()에 따라 배치함

		frm.setVisible(true);
		// 프레임은 기본적으로 보이지 않게 설정되어 있어 보여주려면 setVisible() 메소드를 이용해야 함
	}
}
