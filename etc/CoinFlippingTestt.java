import java.util.*;

class CoinFlippingTestt {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");

		// 정수를 입력받아 정수만큼의 랜덤 숫자(50)를 출력한 후 짝수와 홀수가 몇 개인지 출력

		/*
		출력 예
		1 2 3 4 5 6 7 8 9 10
		짝수 : 5 / 홀수 : 5
		*/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 정수 입력
		int amount = sc.nextInt();

		int[] arrNum = new int[amount];
		int even = 0, odd = 0;
		for(int i = 0; i < amount; i++){
			arrNum[i] = (int)(Math.random() * 50 + 1);
			System.out.print(arrNum[i] + " ");
			if(arrNum[i] % 2 == 0) even++;
			else	odd++;
		}
		System.out.println("\n짝수 : " + even + ", 홀수 : " + odd);
		

	}
}
