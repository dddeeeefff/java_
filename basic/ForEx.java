class ForEx 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 3; i++){
			System.out.println("I like java" + i);
		}
		int n; // for문 밖에서 선언했으므로 for문 종료 후에도 사용가능

		for(n = 1; n <= 5; n += 2){
			System.out.print(n + "  ");
		}
		System.out.println(" \nn : " + n);

		int m = 1;

		for(; m <= 5; m += 2){
		// 외부 변수 사용시 초기화가 되어 있으면 변수 선언을 생략할 수 있음
			System.out.print(m + "  ");
		}
		System.out.println(" \nm : " + m);

		for(int i = 0, j = 10; i < 5; i++, j--){
		// 쉼표로 구분하여 여러 개의 변수를 사용할 수도 있음
			System.out.println("i : " + i + ", j : " + j);
		}
		/*
		i : 0, j : 10
		i : 1, j : 9
		i : 2, j : 8
		i : 3, j : 7
		i : 4, j : 6
		*/
	}
}
