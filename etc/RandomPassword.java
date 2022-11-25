import java.util.*;

class RandomPassword {
	public static void main(String[] args) {
		// 총 10자의 임시 암호 생성(영문 + 숫자) : 첫글자는 무조건 영문
		// 로직 -> 1. String 배열생성   2. 입력 메소드 추가
		Random rnd = new Random();

		char[] arr = {'a','b','c','d','e','f','g','h','i','g','k','l','m','n','o','p',
		'q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		String pwd = arr[rnd.nextInt(26)] + ""; // 첫글자를 arr배열의 영문자등 중에서 추출
		for(int i = 1; i < 10; i++){
			pwd += arr[rnd.nextInt(arr.length)];
		}
		System.out.println(pwd.toUpperCase());
		

		// 1~10 사이의 정수들 중 3개를 무작위로 추출 : 단, 홀수가 짝수보다 2배 높은 확률로 나와야 함
		int[] arrInt = {1,2,3,4,5,6,7,8,9,10,1,3,5,7,9};
		for(int i = 0; i < 3; i++){
			System.out.print(arrInt[rnd.nextInt(arrInt.length)] + " ");
		}
	}
}
