class TV{
	public void onTV(){System.out.println("���� �����");}
}

interface Computer{
	void dataReceive();
}

class ComputerImpl{
	public void dataReceive(){System.out.println("���� ������ ������");}
}

class IPTV extends TV implements Computer{
	ComputerImpl com = new ComputerImpl();	
	public void dataReceive(){
		com.dataReceive();
	}
	public void powerOn(){
		dataReceive();
		onTV();
	}
}

class MultiInheri1 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV tv = new TV();
		// IPTV�� ����Ŭ������ TV�� �ν��Ͻ��� IPTV�� �ν��Ͻ��� �����

		Computer com = iptv;
		// IPTV���� ����(implements)�� Computer�� �ν��Ͻ��� IPTV�� �ν��Ͻ��� �����
		// Computer�� interface������ ����Ŭ�����ΰ� ó�� ������ �� ����
	}
}
