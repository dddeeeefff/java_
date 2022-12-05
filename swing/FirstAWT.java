import java.awt.*;

class FirstAWT {
	public static void main(String[] args) {
		Frame frm = new Frame("First AWT");
		// 제목표시줄(title bar)에서 보여줄 문자열을 인수로 프레임 인스턴스를 생성
		frm.setBounds(200, 120, 500, 300);
		// 생성된 프레임의 위치(x[200], y[120]좌표)와 크기(w[500],h[300]) 지정
		frm.setLayout(new FlowLayout());
		// 프레임에서의 컴포넌트들 배피 방법 지정 / FlowLayout은 기본적으로 가운데 배치

		Button btn1 = new Button("1st Button");
		Button btn2 = new Button("2nd Button");
		Button btn3 = new Button("3rd Button");
		// 캡션으로 사용될 문자열을 인수로 하여 버튼 객체 3개 생성

		frm.add(btn1);		frm.add(btn2);		frm.add(btn3);
		// frm 프레임에 3개의 버튼 컴포넌트를 지정된 FlowLayout()에 따라 배치함

		frm.setVisible(true);
		// 프레임은 기본적으로 보이지 않게 설정되어 있어 보여주려면 setVisible() 메소드를 이용해야 함
	}
}
