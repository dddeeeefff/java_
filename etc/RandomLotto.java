import java.util.*;


class RandomLotto {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������ : 1 ~ 45 ������ ���� 6���� �ߺ����� �ʰ� ���
		// �迭 ���� ��� �̾Ƴ���?
		int[] arrLotto = new int[6];
		Random rnd = new Random();
		for(int i = 0; i < arrLotto.length; i++){
			arrLotto[i] = rnd.nextInt(45) + 1; // 1 ~ 45 ������ ������ ����
			for(int j = 0; j < i; j++){
			// ���� ���� ���� �ε������� ���� �ε����� ���� �迭�� ������ ������ ���鼭 ��
				if(arrLotto[i] == arrLotto[j]){
				// arrLotto�迭�� ����� ���� ���� �߿��� ���� ���� ���� ������ ���� ������
					i--;
					break;
					// ������ ���� �ٽ� �޾ƾ� �ϹǷ� �ε����� ����� i�� ���� 1���� ��Ų �� ���� for���� ��������
				}
			}
		}
		System.out.print("�ζǹ�ȣ�� >> ");
		for(int i = 0; i < arrLotto.length; i++){
			System.out.print(arrLotto[i] + " ");
		}
	}
}
