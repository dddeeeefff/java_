interface TV{
	void onTV();
}

class TVImpl{
	public void onTV(){System.out.println("���� �����");}
}

interface Computer{
	void dataReceive();
}

class ComputerImpl{
	public void dataReceive(){System.out.println("���� ������ ������");}
}

class IPTV implements TV, Computer{
	ComputerImpl com = new ComputerImpl();
	TVImpl tvi = new TVImpl();

	public void onTV(){
		tvi.onTV();
	}

	public void dataReceive(){
		com.dataReceive();
	}


	public void powerOn(){
		dataReceive();
		onTV();
	}
}

class MultiInheri2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();



		Computer com = iptv;
		TV tvi = iptv;

	}
}
