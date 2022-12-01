class Sum{
	int num;
	public Sum(){ num = 0;}
	public void addNum(int n){num += n;}
	public int getNum(){return num;}
}
class AdderThread extends Sum implements Runnable{
// Thread 클래스를 상속받을 수 없는 상황에서 쓰레드 클레스를 만들려고 하면 java.lang.Runnable
// 인터페이스를 implements 해야 함
	int start, end;
	public AdderThread(int s, int e){
		start = s;	end = e;
	}
	public void run(){
	// Runnable 인터페이스의 abstract 메소드로 반드시 오버라이딩하여 구현해야 함
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
		// Thread클래스의 생성자를 이용하여 Runnable의 인스턴스를 매개변수로 하여 Thread의 인스턴스로
		// 생성해줌
		// Runnable는 인터페이스이므로 인스턴스를 생성할 수 없지만 Runnable를 implements한 클래스로
		// 인스턴스를 생성하면 문제없이 사용할 수 있음
		tr1.start();
		tr2.start();

		try{
			tr1.join();		tr2.join();
			// 해당 쓰레드의 작업이 끝날 때까지 다른 작업을 대기시키는 기능
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("1 ~ 100 까지의 합 : " + (at1.getNum() + at2.getNum()));
	}
}
