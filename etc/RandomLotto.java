import java.util.*;


class RandomLotto {
	public static void main(String[] args) {
		// 로또 번호 생성기 : 1 ~ 45 사이의 정수 6개가 중복되지 않고 출력
		// 배열 값을 어떻게 뽑아내지?
		int[] arrLotto = new int[6];
		Random rnd = new Random();
		for(int i = 0; i < 6; i++){
			arrLotto[i] = rnd.nextInt(45) + 1;
			for(int j = 0; j < i; j++){
				if(arrLotto[i] == arrLotto[j])
				i--;
				continue;
			}
			System.out.print(arrLotto[i] + " ");
		}
	}
}
