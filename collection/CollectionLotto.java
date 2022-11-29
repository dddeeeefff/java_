import java.util.*;


class CollectionLotto {
	public static void main(String[] args) {
		// 1~45������ ���� 6���� �ߺ����� �ʰ� ���� �� ��� - ������ ����
		// ������ MathŬ�������� �̿�
		Set set = new HashSet();
		while(set.size() < 6){
		// set�� 6���� ���ڰ� ����� ������ ������ ��
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num)); // Set�̹Ƿ� �ߺ��� ���� ���� �Ұ�
			// �������� ������ ���ڸ� Integer�� �ν��Ͻ��� ������ �� set�� ����
		}
		System.out.println(set); // [24, 10, 42, 11, 12, 29]

		// set�� ����ִ� ���ڵ��� �������� �����Ͽ� ���
		// �����κ� : set -> list�� ����ȯ ����(sort�� list���� ����� �����ϹǷ� ����ȯ �� ����ؾߵ�)
		List list = new ArrayList(set); // LinkedList�� ����
		// set�� Collections �������̽��� ��ӹ޾����Ƿ� List�� �ν��Ͻ��� ���� ����
		Collections.sort(list);
		// Collections Ŭ������ sort() �޼ҵ�� �Ű������� �ڷ����� List�̹Ƿ� set�� �̿��Ͽ� List�� �ν��Ͻ��� �����Ͽ� ����
		System.out.println(list);
	}
}