/*
�� ������ ���� �ٸ� �켱������ �־� ���۽�Ű�� �� �켱������ ���
*/ 
class MessageThread2 extends Thread{
	String msg;
	public MessageThread2(String str, int prio){
		msg = str;
		setPriority(prio);
		// setPriority() : Thread Ŭ������ �޼ҵ�� �ش� �������� �켱 ������ ����
		// �켱 ������ �����ص� ��Ȳ�� ���� �켱������ �����ϰ� ���� �켱������ �����尡 ���� �۾��� ���� ����
		// �׷��Ƿ� ������ ���Ѿ� �ϴ� ���α׷������� �����带 ����ϸ� �ȵ�
		}
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(msg + " (" + getPriority() + ")");
		}
	}
}

class PriorityTest2 {
	public static void main(String[] args) {
		MessageThread2 mt1 = new MessageThread2("1st", Thread.MAX_PRIORITY);
		// MAX_PRIORITY : 10�� int ������ ���� ���� �켱 ������
		MessageThread2 mt2 = new MessageThread2("2nd", Thread.NORM_PRIORITY);
		// NORM_PRIORITY : 5�� int ������ ��� �켱 ������
		MessageThread2 mt3 = new MessageThread2("3rd", Thread.MIN_PRIORITY);
		// MIN_PRIORITY : 1�� int ������ ���� ���� �켱 ������
		// �켱������ Ȯ���� �����شٴ� ������ ������������ �������� ���� ȣ����� ����

		/* �̰͵� ����
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.NORM_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);

		mt1.setPriority(1);
		mt2.setPriority(2);
		mt3.setPriority(3);
		*/

		mt1.start();	mt2.start();	mt3.start();
	}
}
