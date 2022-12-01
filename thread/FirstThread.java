class ShowThread extends Thread{
// Thread클래스를 상속받음으로써 ShowThread클래스는 쓰레드로 사용할 수 있음
// Main Thread가 아닌 다은 process로 동작한다는 의미
	String name;
	public ShowThread(String name){this.name = name;}
	// 하위 클래스의 생성자로 원래는 상위클래스의 Thread의 생성자를 호출해야 함
	// 단, Thread클래스는 생성자들 중 기본생성자(매개변수 없는 생성자)가 있으므로 생략가능
	public void run(){
	// 상위클래스인 Thread의 run() 메소드를 오버라이딩하는 메소드로 해당 쓰레드에서 할 일을 정의해 놓은 메소드
	// 특정 쓰레드의 start() 메소드를 호출하면 해당 쓰레드의 run() 메소드가 자동으로 호출
		for(int i = 0; i < 5; i++){
			System.out.println("안녕하세요. " + name + "입니다.");
			try{
				sleep(100); // 일시멈춤으로 밀리초 단위로 작업됨
				// 현재 실행중인 쓰레드를 0.1초 동안 멈춤
				// 상위클래스인 Thread의 메소드로 하위클래스에서 자유롭게 호출 가능
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class FirstThread {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("1st 쓰레드"); // 안녕하세요. 1st 쓰레드입니다.
		ShowThread st2 = new ShowThread("2nd 쓰레드"); // 안녕하세요. 2nd 쓰레드입니다.
		// st1과 st2라는 process를 가진 두 개의 쓰레드를 생성

		st1.start(); // st1이라는 쓰레드를 실행(run() 메소드 호출)
		st2.start(); // st2이라는 쓰레드를 실행(run() 메소드 호출)
		// 쓰레드는 실행시키는 문서와 상관없이 먼저 CPU를 차지하는 쪽이 먼저 실행됨
	}
}
