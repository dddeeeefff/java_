class Orange{
	int sugar;
	public Orange(int s){sugar = s;}
	public void showSugar(){System.out.println("당도 : " + sugar);}
}

class FruitBox{ // 무엇이든 저장 가능한 박스
	Object item;
	public void store(Object item){this.item = item;}
	public Object pullOut(){return item;}
}

class FruitBoxObject {
	public static void main(String[] args) {
		FruitBox box1 = new FruitBox();
		box1.store(new Orange(10));
		Orange org1 = (Orange)box1.pullOut();
		// pullOut() 메소드로 추출한 객체는 JVM에게 Object로 인식되기 때문에 
		// Orange클래스에 있는 메소드인 showSugar() 메소드를 사용하려면 Orange형으로 형변환 해야 함
		org1.showSugar();

		FruitBox box2 = new FruitBox();
		box2.store("오렌지");
		Orange org2 = (Orange)box2.pullOut();
		// box2에 들어있는 item은 문자열이므로 Orange로 형변환시 ClassCastException 예외가 발생
		org2.showSugar();
	}
}

/*
문제점
 - FruitBox에서 저장하는 item이 Object이므로 아무 객체나 들어와도 오류(컴파일시)가 발생하지 않음
 - 컴파일은 이상없이 진행되나 프로그램 실행 시 예외가 발생할 수 있음

해결책 : FruitBoxOrange.java
 - Object로 선언된 item을 특정 클래스 자료형으로 지정하여 컴파일시 다른 자료형이 들어오면 오류를 발생시키면 됨
*/
