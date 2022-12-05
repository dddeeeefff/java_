import java.util.*;

class CoinFlippingTest {
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
		int arr[] = new int[num]; // 입력한 정수만큼 숫자를 담을 배열 선언
		Random ran = new Random(); // 랜덤함수 인스턴스 생성
		for(int i = 0; i < arr.length; i++){
			int tmp = ran.nextInt(50); // 1 ~ 100까지 랜덤숫자는 tmp의 값임
			arr[i] = tmp; // tmp의 값을 배열에 추가
			System.out.print(arr[i] + " ");
		}
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				count1++;
			}else if(arr[i] % 2 == 1){
				count2++;
			}
		}
		System.out.println();
		System.out.println("짝수 : " + count1 + "/ 홀수 : " + count2);
	}
}
