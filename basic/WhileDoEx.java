class WhileDoEx 
{
	public static void main(String[] args) 
	{
		int num = 0;
		while (num < 3)
		{
			System.out.println("I like java" + num);
			num++;
		}

		num = 1;
		//num의 값이 1, 3, 5, 7로 출력되게 작업
		while (num < 8)
		{
			System.out.println(num);
			num += 2;
		} // num의 값이 9이므로 두번째 while문은 동작 안함

		do{
			System.out.println(num + "----------");
			num += 2;
		} while(num <= 7);
			//do-while 이므로 num값에 상관없이 최초 한 번은 동작함


		//자연수 1부터 100까지의 합을 while문을 이용하여 구한 뒤 출력
		// 반복문을 이용하여 합을 어떻게 구하지?
		int sum = 0;
		num = 1;
		while(num <= 100){
			sum += num;
			num++; 
		}
		System.out.println("누적합 : " + sum); // 누적합 출력
	}
}
