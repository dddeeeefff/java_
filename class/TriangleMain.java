/*
밑변과 높이 정보를 저장할 수 있는 Triangle 클래스 제작
1.인스턴스 생성과 동시에 멤버변수들을 초기화 시킴
2. 밑변과 높이 정보를 변경할 수 있는 메소드 제작
3. 삼각형의 넓이를 구하여 리턴하는 메소드 제작
 - 밑변 10.2, 높이 17.3인 삼각형 인스턴스 생성 후 넓이 출력
 - 밑변 9.2, 높이 7.5로 변경한 후 다시 넓이 출력
*/


class Triangle
{
	double bottom, height; // 밑변과 높이를 저장할 멤버변수
	Triangle(double b, double h){
		bottom = b; height = h;
		//매대변수로 받아온 값들을 멤버변수에 넣어 초기화 시킴
	}
	public void setBottom(double b){bottom = b;}
	public void setHeight(double h){height = h;}
	public double getArea(){return bottom * height / 2;}
}


class TriangleMain {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("삼각형의 넓이 : " + tr.getArea());

		tr.setBottom(9.2); tr.setHeight(7.5);
		System.out.println("삼각형의 넓이 : " + tr.getArea());
	}
}
