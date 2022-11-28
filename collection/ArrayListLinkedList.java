import java.util.*;

class ArrayListLinkedList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		System.out.println("= ���������� �߰��ϱ� =");
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add1(ll));
		System.out.println();

		System.out.println("= �߰��� �߰��ϱ� =");
		System.out.println("ArrayList : " + add2(al));
		System.out.println("LinkedList : " + add2(ll));
		System.out.println();

		System.out.println("= �߰��� �����ϱ� =");
		System.out.println("ArrayList : " + del2(al));
		System.out.println("LinkedList : " + del2(ll));
		System.out.println();

		System.out.println("= ���������� �����ϱ� =");
		System.out.println("ArrayList : " + del1(al));
		System.out.println("LinkedList : " + del1(ll));
		System.out.println();

	}
	// add1() : 10������ �����͸� (i + "") �߰�
	public static long add1(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			list.add(i + "x");
		}
		long end = System.currentTimeMillis();
		return end - start;
	 }

	
	// add2() : 10000�� ���� 500�� �ε����� "x" �߰�
	public static long add2(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			list.add(500, "x");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	//del1() : ��� �����͸� �����ϱ�(for���� �̿��Ͽ� ������ ���鼭 remove()�� ����)
	public static long del1(List list){
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1 ; i >= 0; i--){
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	 }
	

	//del2() : 10000�� �ε��� ������ �����͵��� �ϳ��� ����
	public static long del2(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
