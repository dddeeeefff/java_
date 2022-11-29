import java.util.*;

class ArraysEx {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13},{21, 22, 23}};

		System.out.println("arr : " + Arrays.toString(arr));
		// arr : [0, 1, 2, 3, 4]
		System.out.println("arr2D : " + Arrays.deepToString(arr2D)); // 2차원 이상 배열은 deep을 붙이지 않으면 주소값으로 리턴됨
		// arr2D : [[11, 12, 13], [21, 22, 23]]

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr배열 전체를 복사
		int[] arr3 = Arrays.copyOf(arr, 3);// arr배열의 0~2 복사
		int[] arr4 = Arrays.copyOf(arr, 7);// arr배열의 0~6 복사
		int[] arr5 = Arrays.copyOfRange(arr, 2,4);// arr배열의 2~3 복사
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);// arr배열의 0~6 복사

		System.out.println("arr2 : " + Arrays.toString(arr2)); // arr2 : [0, 1, 2, 3, 4]
		System.out.println("arr3 : " + Arrays.toString(arr3)); // arr3 : [0, 1, 2]
		System.out.println("arr4 : " + Arrays.toString(arr4)); // arr4 : [0, 1, 2, 3, 4, 0, 0]
		System.out.println("arr5 : " + Arrays.toString(arr5)); // arr5 : [2, 3]
		System.out.println("arr6 : " + Arrays.toString(arr6)); // arr6 : [0, 1, 2, 3, 4, 0, 0]

		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // arr7 배열의 값을 모두 9로 채움
		System.out.println("arr7 : " + Arrays.toString(arr7)); // arr7 : [9, 9, 9, 9, 9]

		String[][] str2D1 = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println("equals : " + Arrays.equals(str2D1, str2D2)); // equals : false
		System.out.println("deepEquals : " + Arrays.deepEquals(str2D1, str2D2)); // deepEquals : true
		// 다차원 배열은 deepEquals()를 사용해야 데이터가 들어있는 곳까지 가서 비교함

		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr : " + Arrays.toString(chArr)); // chArr : [A, D, C, B, E]
		// chArr배열에서 'B'를 binarySearch() 메소드를 이용하여 위치를 출력
		System.out.println("index of B : " + Arrays.binarySearch(chArr,'B')); 
		// -2(정렬이 되어있지 않으므로 'B'의 위치를 찾을 수 없음)
		Arrays.sort(chArr);
		// chArr 배열의 값들을 오름차순 정렬 시킴
		System.out.println("chArr : " + Arrays.toString(chArr)); // chArr : [A, B, C, D, E]
		System.out.println("index of B : " + Arrays.binarySearch(chArr,'B')); // index of B : 1
		// binarySearch() : 오름차순 정렬이 된 상태에서 이분 검색으로 데이터의 위치 리턴

		List list1 = Arrays.asList("a","b","c","d");
		// 입력받은 데이터들을 List로 생성(단, List에 대한 추가나 삭제등의 작업은 불가)
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " "); // a b c d
		}
		System.out.println();

		// asList()로 만든 리스트에 추가나 삭제가 필요하면 직접 생성해야 함
		List list2 = new ArrayList(Arrays.asList("a","b","c","d"));
		list2.add("z");
		for(int i = 0; i < list2.size(); i++){
			System.out.print(list2.get(i) + " "); // a b c d z
		}
	}
}
