class Sum{
	int num;
	public Sum(){ num = 0;}
	public void addNum(int n){num += n;}
	public int getNum(){return num;}
}
class AdderThread extends Sum implements Runnable{
// Thread Ŭ������ ��ӹ��� �� ���� ��Ȳ���� ������ Ŭ������ ������� �ϸ� java.lang.Runnable
// �������̽��� implements �ؾ� ��
	int start, end;
	public AdderThread(int s, int e){
		start = s;	end = e;
	}
	public void run(){
	// Runnable �������̽��� abstract �޼ҵ�� �ݵ�� �������̵��Ͽ� �����ؾ� ��
		for(int i = start; i <= end; i++){
			addNum(i);
		}
	}
}

class RunnableThread {
	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);

		Thread tr1 = new Thread(at1);		Thread tr2 = new Thread(at2);
		// ThreadŬ������ �����ڸ� �̿��Ͽ� Runnable�� �ν��Ͻ��� �Ű������� �Ͽ� Thread�� �ν��Ͻ���
		// ��������
		// Runnable�� �������̽��̹Ƿ� �ν��Ͻ��� ������ �� ������ Runnable�� implements�� Ŭ������
		// �ν��Ͻ��� �����ϸ� �������� ����� �� ����
		tr1.start();
		tr2.start();

		try{
			tr1.join();		tr2.join();
			// �ش� �������� �۾��� ���� ������ �ٸ� �۾��� ����Ű�� ���
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("1 ~ 100 ������ �� : " + (at1.getNum() + at2.getNum()));
	}
}
