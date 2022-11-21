class BreakContinue 
{
	public static void main(String[] args) 
	{
		int num1 = 1;
		while (num1 < 10){
			System.out.print(num1 + "  ");
			if (num1 == 5) break;
			num1++;
		}
		
		// 100이하의 자연수 중 5와 7의 최소 공배수를 구하여 출력 - while문 이용
		int num2 = 1; // 100까지 루프를 돌릴 정수를 저장
		while (num2 <= 100){
			if(num2 % 5 == 0 && num2 % 7 == 0){
				break;
			}
			num2++;
		}
		System.out.println("\n5와 7의 최소공배수 : " + num2);

		// 100이하의 자연수 중 5와 7의 공배수들과 개수를 구하여 출력 - while문 이용
		int num3 = 1; // 100까지의 루프를 돌릴 변수
		int count = 0; // 공배수의 개수를 저장할 변수
		while(num3 <= 100){
			num3++;
			if(num3 % 5 != 0 || num3 % 7 != 0){
				continue; //  아래의 실행문들을 무시하고 조건절(while)로 바로 올라감
			}

			count++;
			System.out.println("5와 7의 공배수 : " + num3);
		}
			System.out.println("공배수의 개수 : " + count);
	}
}
