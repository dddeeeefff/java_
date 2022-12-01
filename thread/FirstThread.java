class ShowThread extends Thread{
// ThreadŬ������ ��ӹ������ν� ShowThreadŬ������ ������� ����� �� ����
// Main Thread�� �ƴ� ���� process�� �����Ѵٴ� �ǹ�
	String name;
	public ShowThread(String name){this.name = name;}
	// ���� Ŭ������ �����ڷ� ������ ����Ŭ������ Thread�� �����ڸ� ȣ���ؾ� ��
	// ��, ThreadŬ������ �����ڵ� �� �⺻������(�Ű����� ���� ������)�� �����Ƿ� ��������
	public void run(){
	// ����Ŭ������ Thread�� run() �޼ҵ带 �������̵��ϴ� �޼ҵ�� �ش� �����忡�� �� ���� ������ ���� �޼ҵ�
	// Ư�� �������� start() �޼ҵ带 ȣ���ϸ� �ش� �������� run() �޼ҵ尡 �ڵ����� ȣ��
		for(int i = 0; i < 5; i++){
			System.out.println("�ȳ��ϼ���. " + name + "�Դϴ�.");
			try{
				sleep(100); // �Ͻø������� �и��� ������ �۾���
				// ���� �������� �����带 0.1�� ���� ����
				// ����Ŭ������ Thread�� �޼ҵ�� ����Ŭ�������� �����Ӱ� ȣ�� ����
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class FirstThread {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("1st ������"); // �ȳ��ϼ���. 1st �������Դϴ�.
		ShowThread st2 = new ShowThread("2nd ������"); // �ȳ��ϼ���. 2nd �������Դϴ�.
		// st1�� st2��� process�� ���� �� ���� �����带 ����

		st1.start(); // st1�̶�� �����带 ����(run() �޼ҵ� ȣ��)
		st2.start(); // st2�̶�� �����带 ����(run() �޼ҵ� ȣ��)
		// ������� �����Ű�� ������ ������� ���� CPU�� �����ϴ� ���� ���� �����
	}
}
