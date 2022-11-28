import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		// list1�� integer�� �ν��Ͻ� ���� - 5 4 2 0 1 3
		list1.add(new Integer(5));		list1.add(new Integer(4));
		list1.add(new Integer(2));		list1.add(new Integer(0));
		list1.add(new Integer(1));		list1.add(new Integer(3));

		//list1���� 4, 2, 0 �����͵鸸 �߶� list2 ����
		//List<E>			subList(int fromIndex, int toIndex)	
		//: ����Ʈ�� fromIndex ���� toIndex - 1���� �߶󳻾� ����Ʈ�� ����

//		ArrayList list2 = new ArrayList();
//		list2.add(list1.get(1));
//		list2.add(list1.get(2));
//		list2.add(list1.get(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4));
		// subList�� ����Ÿ���� List�̹Ƿ� collection�� �Ű������� �ϴ� ArrayList�� �����ڸ� �̿��Ͽ� ���ο�
		// ArrayList �ν��Ͻ�2�� ����
		print(list1, list2);
		//list1 : [5, 4, 2, 0, 1, 3]		list2 : [4, 2, 0]


		Collections.sort(list1);		Collections.sort(list2);
		// Collections Ŭ������ sort() �޼ҵ带 �̿� �� ArrayList�� �������� ����
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]		list2 : [0, 2, 4]

		System.out.println("list1.containsAll(list2)" + list1.containsAll(list2) + "\n"); 
		// list1.containsAll(list2)true
		// list1�� list2�� �����͵��� ��� ��� �ִ��� ����


		// list2�� �� �ڿ� "B"�� "C"�� �߰��ϰ�, 3�� �ڸ��� "A"�� �߰�
		// void			add(int index, E element)					 : ����Ʈ�� index��ġ�� element�� �߰�
		list2.add("B");		list2.add("C");		list2.add(3,"A");
		// Collections �������̽��� add() �޼ҵ带 �̿��Ͽ� �� �ڿ� �� ������ �߰�
		// list �������̽��� �̿��Ͽ� Ư�� �ε����� ������ �߰�
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]	list2 : [0, 2, 4, A, B, C]

		// list2�� 3�� �ڸ��� "AA"�� �����
		list2.set(3, "AA");
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]	list2 : [0, 2, 4, AA, B, C]

		// list1���� list2�� �����Ϳ� ������ �����͵鸸 ����� �������� ����
		// boolean     retainAll(Collection<?> c) : �÷��ǿ��� ������ �÷���(c)�� �����͵鸸 ����� �ٸ� �����͵� ����
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); 
		// true -> list1���� ����������o
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); 
		// false -> list1���� ����������x
		print(list1, list2);
		// list1 : [0, 2, 4]		list2 : [0, 2, 4, AA, B, C]

		// list2�� list1�� ������ �����Ͱ� ������ ã�Ƴ��� �ϳ��� ���� �� ���(for��)
		//E	remove(int index): ����Ʈ���� ������ index�� �ش��ϴ� �����͸� ������ �� �ش� �����͸� ����
		/*	
		for(int i = 0; i < list2.size(); i++){
			for(int j = 0; j < list1.size(); j++){
				if(list2.get(i) == list1.get(j))
					list2.remove(i);
			}
		}
		*/
		for(int i = list2.size()-1; i >= 0; i--){
		// ���� �����͸� ������ ��� �Ųٷ� ������ ���鼭 �����ϴ� ���� ȿ������
			if(list1.contains(list2.get(i))){
			//list1�� list2�� i�ε����� �ش��ϴ� �����Ͱ� ���������
				list2.remove(i);
				// list2�� i�ε����� �ش��ϴ� ������ ����
			}
		} // ��, �� ������ removeAll() �޼ҵ带 ����ص� ��
		print(list1, list2);
		// list1 : [0, 2, 4]		list2 : [AA, B, C]
	}
	public static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
