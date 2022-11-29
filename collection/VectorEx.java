import java.util.*;

class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");		v.add("2");		v.add("3");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 5

		v.trimToSize();
		// ��ĭ�� ���� size�� capacity(�뷮)�� ���� ��
		System.out.println("=== Atfer trimToSize() ===");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 3

		v.ensureCapacity(6);
		// capacity�� �ּҰ��� 6���� ����
		System.out.println("=== Atfer ensureCapacity(6) ===");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 6



		v.setSize(7);
		// size�� ������ 7�� ����, �����Ͱ� ���ڸ��� null�� ä��
		System.out.println("=== Atfer setSize(7) ===");
		print(v);
		//[1, 2, 3, null, null, null, null]
		//size : 7 / capacity : 12



		v.clear();
		System.out.println("=== Atfer clear() ===");
		print(v);
		//[]
		//size : 0 / capacity : 12


	}
	public static void print(Vector v){
		System.out.println(v);
		System.out.println("size : " + v.size() + " / capacity : " + v.capacity());

	}
}
