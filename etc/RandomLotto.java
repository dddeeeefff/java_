import java.util.*;


class RandomLotto {
	public static void main(String[] args) {
		// 로또 번호 생성기 : 1 ~ 45 사이의 정수 6개가 중복되지 않고 출력
		// 배열 값을 어떻게 뽑아내지?
		int[] arrLotto = new int[6];
		Random rnd = new Random();
		for(int i = 0; i < arrLotto.length; i++){
			arrLotto[i] = rnd.nextInt(45) + 1; // 1 ~ 45 사이의 정수를 추출
			for(int j = 0; j < i; j++){
			// 현재 받은 값의 인덱스보다 작은 인덱스를 가진 배열의 값들을 루프를 돌면서 비교
				if(arrLotto[i] == arrLotto[j]){
				// arrLotto배열에 저장된 기존 값들 중에서 현재 받은 값과 동일한 값이 있으면
					i--;
					break;
					// 동일한 값은 다시 받아야 하므로 인덱스로 사용할 i의 값을 1감소 시킨 후 안쪽 for문을 빠져나감
				}
			}
		}
		System.out.print("로또번호는 >> ");
		for(int i = 0; i < arrLotto.length; i++){
			System.out.print(arrLotto[i] + " ");
		}
	}
}
