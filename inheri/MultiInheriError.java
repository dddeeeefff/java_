class TV{
	public void onTV(){System.out.println("���� �����");}
}

class Computer{
	public void dataReceive(){System.out.println("���� ������ ������");}
}

class IPTV extends TV, Computer{
// �ڹٿ����� ���߻���� �������� �����Ƿ� ���� �߻�
	public void powerOn(){
		dataReceive();
		onTV();
	}
}

class MultiInheriError {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV tv = new TV();
		Computer com = iptv;
	}
}
