import java.awt.*;
import javax.swing.*;

class LargeButton extends JButton{
// JButtonŬ������ ��ӹ޾����Ƿ� LargeButtonŬ������ �ν��Ͻ��� ������ ��ư ������Ʈ�� ��޵�
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
		// FlowLayout : ������Ʈ���� ������ ����� �߾Ӻ��� ���ʷ� ä�������� ������ ���̾ƿ� �Ŵ���
		// �������� ũ�Ⱑ ���ϸ� ��ġ�Ǿ��� ������Ʈ�� ��ġ�� ����� �� ����

		// frm�� JButton 3���� LargeButton 3���� ��ġ�� �� ������ ����


		frm.add(new JButton("1st Button"));
		frm.add(new JButton("2nd Button"));
		frm.add(new JButton("3rd Button"));
		frm.add(new LargeButton("1st LargeButton"));
		frm.add(new LargeButton("2nd LargeButton"));
		frm.add(new LargeButton("3rd LargeButton"));

		frm.setVisible(true);

	}
}
