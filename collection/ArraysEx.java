import java.util.*;

class ArraysEx {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13},{21, 22, 23}};

		System.out.println("arr : " + Arrays.toString(arr));
		// arr : [0, 1, 2, 3, 4]
		System.out.println("arr2D : " + Arrays.deepToString(arr2D)); // 2���� �̻� �迭�� deep�� ������ ������ �ּҰ����� ���ϵ�
		// arr2D : [[11, 12, 13], [21, 22, 23]]

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr�迭 ��ü�� ����
		int[] arr3 = Arrays.copyOf(arr, 3);// arr�迭�� 0~2 ����
		int[] arr4 = Arrays.copyOf(arr, 7);// arr�迭�� 0~6 ����
		int[] arr5 = Arrays.copyOfRange(arr, 2,4);// arr�迭�� 2~3 ����
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);// arr�迭�� 0~6 ����

		System.out.println("arr2 : " + Arrays.toString(arr2)); // arr2 : [0, 1, 2, 3, 4]
		System.out.println("arr3 : " + Arrays.toString(arr3)); // arr3 : [0, 1, 2]
		System.out.println("arr4 : " + Arrays.toString(arr4)); // arr4 : [0, 1, 2, 3, 4, 0, 0]
		System.out.println("arr5 : " + Arrays.toString(arr5)); // arr5 : [2, 3]
		System.out.println("arr6 : " + Arrays.toString(arr6)); // arr6 : [0, 1, 2, 3, 4, 0, 0]

		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // arr7 �迭�� ���� ��� 9�� ä��
		System.out.println("arr7 : " + Arrays.toString(arr7)); // arr7 : [9, 9, 9, 9, 9]

		String[][] str2D1 = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println("equals : " + Arrays.equals(str2D1, str2D2)); // equals : false
		System.out.println("deepEquals : " + Arrays.deepEquals(str2D1, str2D2)); // deepEquals : true
		// ������ �迭�� deepEquals()�� ����ؾ� �����Ͱ� ����ִ� ������ ���� ����

		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr : " + Arrays.toString(chArr)); // chArr : [A, D, C, B, E]
		// chArr�迭���� 'B'�� binarySearch() �޼ҵ带 �̿��Ͽ� ��ġ�� ���
		System.out.println("index of B : " + Arrays.binarySearch(chArr,'B')); 
		// -2(������ �Ǿ����� �����Ƿ� 'B'�� ��ġ�� ã�� �� ����)
		Arrays.sort(chArr);
		// chArr �迭�� ������ �������� ���� ��Ŵ
		System.out.println("chArr : " + Arrays.toString(chArr)); // chArr : [A, B, C, D, E]
		System.out.println("index of B : " + Arrays.binarySearch(chArr,'B')); // index of B : 1
		// binarySearch() : �������� ������ �� ���¿��� �̺� �˻����� �������� ��ġ ����

		List list1 = Arrays.asList("a","b","c","d");
		// �Է¹��� �����͵��� List�� ����(��, List�� ���� �߰��� �������� �۾��� �Ұ�)
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " "); // a b c d
		}
		System.out.println();

		// asList()�� ���� ����Ʈ�� �߰��� ������ �ʿ��ϸ� ���� �����ؾ� ��
		List list2 = new ArrayList(Arrays.asList("a","b","c","d"));
		list2.add("z");
		for(int i = 0; i < list2.size(); i++){
			System.out.print(list2.get(i) + " "); // a b c d z
		}
	}
}
