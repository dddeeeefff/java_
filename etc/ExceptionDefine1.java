import java.util.*;

class AgeInputException extends Exception{
// Exception 클래스를 상속받았으므로 AgeInputException 클래스는 예외 클래스가 됨
	public AgeInputException(){
		super("유효하지 않은 나이가 입력되었습니다.");
		//getMessage() 메소드로 보여줄 예외 메시지를 매개변수로 하여 상위클래스(Exception) 생성자를 호출
	}
}

class ExceptionDefine1 {
	public static void main(String[] args) {
		System.out.print("나이 입력 :");

		try{
			int age = readAge();
			System.out.println("당신은 " + age + "세 입니다.");
		}
		catch (AgeInputException e){
			System.out.println(e.getMessage());
		}
	}
	public static int readAge() throws AgeInputException{
	// throws AgeInputException : 현 메소드에서는 AgeInputException 예외가 발생해도 처리하지 않겠다는 의미
	// 예외처리를 현 메소드를 호출한 곳으로 넘기는 명령이 throws - 예외처리는 try-catch로 해야 함
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 0){
			AgeInputException ex = new AgeInputException();
			// AgeInputException 형 인스턴스 ex를 생성(예외가 생성된것으로 예외 발생은 아님)
			throw ex;
			// ex에 들어있는 AgeInputException 예외가 발생했다고 JVM에게 알리는 역할
			// throws가 실행되면 JVM의 예외처리가 동작하게 됨 
		}
		return age;
	}
}
