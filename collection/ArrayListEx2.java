import java.util.*;

class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; // ���ڿ��� ����Ʈ�� ��� ������?

		// source�� ���ڿ��� 10���� �߶� ArrayList�� ������ �� �ϳ��� ���
		// List<E>	subList(int fromIndex, int toIndex) : ����Ʈ�� fromIndex ���� toIndex - 1���� �߶󳻾� ����Ʈ�� ����
		// ArrayList(int initialCapacity) : ������ initialCapacity�� ũ��� �ϴ� ArrayList ����
		// ArrayList list1 = new ArrayList(source);            substring()
		int length = source.length(); // source : ����
		List list = new ArrayList(length / LIMIT + 10); // �˳��ϰ� ��°� ����
		// list�� List������ �����߱� ������ List�� �޼ҵ�� ArrayList���� �������̵��� �޼ҵ�鸸
		// ����� �� ����(��κ��� �޼ҵ尡 �������̵��Ǿ� �ֱ� ������ ���ɻ��� ���� ����)
		// List�� �����߱� ������ �ٸ� List��ü(LinkedList)���� ����ȯ�� �����ο�
		// ArrayList�� ũ��� �˳��ϰ� ����ִ� ���� ����
		for(int i = 0; i < length; i += LIMIT){
		// i : subString()�� ù��° �Ű������� ����� ������
			if(i + LIMIT < length){
			// �ڸ� ���ڿ��� 10�� �̻� ��������
				list.add(source.substring(i, i + LIMIT));
			}else{
			// �ڸ� ���ڿ��� 10���� �ȵǸ�
				list.add(source.substring(i));
			}
		}
		for(int i = 0; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
	}
}
