class Speaker{
	private int vol;
	public void showCurrnetState(){
		System.out.println("���� ũ�� : " + vol);		
	}
	public void setVol(int vol){this.vol = vol;}
}

class BaseSpeaker extends Speaker{
	private int base;
	public void showCurrnetState(){
	// ����Ŭ������ Speaker�� showCurrnetState() �޼ҵ带 �������̵��� �޼ҵ�
		super.showCurrnetState();
		// �������̵� �� �޼ҵ忡���� ����Ŭ������ �����޼ҵ带 super Ű���带 �̿��Ͽ� ȣ���� �� ����
		System.out.println("���̽� ũ�� : " + base);
	}
	public void setBase(int base){this.base = base;}
}

class OverridingEx {
	public static void main(String[] args) {
		BaseSpeaker bs = new BaseSpeaker();
		bs.setVol(10);
		bs.setBase(20);
		bs.showCurrnetState();
		// �������̵��� �޼ҵ带 ȣ���� ��� ������ �ν��Ͻ� �������� ������ Ŭ������ �������̵��� �޼ҵ尡 ȣ���
	}

}
