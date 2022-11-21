/*
FirstJava.java 실행순서
D: // d드라이브 이동
D:\>cd cks /java/basic //작업할 폴더위치로 이동
D:\cks\java\basic>javac FirstJava.java // 클래스파일 생성
D:\cks\java\basic>java FirstJava // 컴파일하여 클래스 파일 실행
*/
class FirstJava
{
	public static void main(String[] args) 
	{
		System.out.println("Java를 자바라!!");
		System.out.println("2 + 5 = " + 2 + 5); // 2 + 5 = 25
		System.out.println("2 + 5 = " + (2 + 5)); // 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5");// 7 = 2 + 5
	}
}
