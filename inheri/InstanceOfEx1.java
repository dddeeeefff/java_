class BasicBox{
	public void basicWrap(){System.out.println("basic wrap");}
}

class PaperBox extends BasicBox{
	public void paperWrap(){System.out.println("paper wrap");}
}

class GoldBox extends PaperBox{
	public void goldWrap(){System.out.println("gold wrap");}
}


class InstanceOfEx1 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
		//basic wrap		//paper wrap		//gold wrap
	}
	public static void wrapBox(BasicBox box){
	// 매개변수를 BasicBox형으로 선언했기 때문에 그 하위클래스인 PaperBox와 GoldBox형 인스턴스도 매개변수로 받을 수 있음
	// 단, 상위클래스인 BasicBox형으로 받았으므로 PaperBox와 GoldBox형 인스턴스도 BasicBox로 인식됨

	// instanceof : 형변환 가능여부를 묻는 연산자로 조건 검사는 최하위 클래스부터 해야 함
	// GoldBox형 인스턴스 box3는 PaperBox로도 형변환이 가능하기 때문에 조건을 먼저 검사해야 함

	// 각 케이스마다 형변환하여 실행 - 형변환하는 방법은? -> () -> 형변환 우선순위 주의 1 '.'  2 '()' => 2먼저하고싶으면 괄호로 묶는다
		if(box instanceof GoldBox){
		// box 인스턴스가 GoldBox로 형변환이 가능하면
			((GoldBox)box).goldWrap();
			// box를 GoldBox형으로 형변환 한 후 goldWrap() 메소드 호출
		}else if(box instanceof PaperBox){
			((PaperBox)box).paperWrap();
		}else{
			box.basicWrap();
		}
		
	}
}
