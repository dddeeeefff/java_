class MessageThread extends Thread{
	String msg;
	public MessageThread(String str){msg = str;}
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(msg + " (" + getPriority() + ")");
			// getPriority() : �ش� �������� �켱������ int������ �����ϴ� �޼ҵ�
		}
	}
}

class PriorityTest1 {
	public static void main(String[] args) {
		MessageThread mt1 = new MessageThread("1st");
		MessageThread mt2 = new MessageThread("2nd");
		MessageThread mt3 = new MessageThread("3rd");

		mt1.start();	mt2.start();	mt3.start();
		// ������� ȣ�� ������ ������� �켱������ �⺻������ 5�� �����Ǿ� �����
	}
}
