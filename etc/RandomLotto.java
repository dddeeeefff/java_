import java.util.*;


class RandomLotto {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������ : 1 ~ 45 ������ ���� 6���� �ߺ����� �ʰ� ���
		// �迭 ���� ��� �̾Ƴ���?
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
