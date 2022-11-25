interface SimpleInterface{
	public void showYourName();
}

class UpperClass{
	public void showYourAncestor(){
		System.out.println("Upper Class");
	}
}

class Aa extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class Aa");}
}

class Bb extends UpperClass implements SimpleInterface{
	public void showYourName() {System.out.println("Class Bb");}
}

class BoundedTypeParam1 {
	public static void main(String[] args) {
		Aa a = new Aa();		Bb b = new Bb();

		showInstanceAncestor(a);  showInstanceName(a);
		showInstanceAncestor(b);  showInstanceName(b);
	}
	public static <T> void showInstanceAncestor(T param){
		((SimpleInterface)param).showYourName();
		// interface도 클래스처럼 형변환이 가능하여 SimpleInterface의 메소드를 실행
	}
	public static <T> void showInstanceName(T param){
		((UpperClass)param).showYourAncestor();
	}
}
