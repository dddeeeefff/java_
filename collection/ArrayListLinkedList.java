import java.util.*;

class ArrayListLinkedList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add1(ll));
		System.out.println();

		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList : " + add2(al));
		System.out.println("LinkedList : " + add2(ll));
		System.out.println();

		System.out.println("= 중간에 삭제하기 =");
		System.out.println("ArrayList : " + del2(al));
		System.out.println("LinkedList : " + del2(ll));
		System.out.println();

		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList : " + del1(al));
		System.out.println("LinkedList : " + del1(ll));
		System.out.println();

	}
	// add1() : 10만개의 데이터를 (i + "") 추가
	public static long add1(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			list.add(i + "x");
		}
		long end = System.currentTimeMillis();
		return end - start;
	 }

	
	// add2() : 10000번 동안 500번 인덱스에 "x" 추가
	public static long add2(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			list.add(500, "x");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	//del1() : 모든 데이터를 삭제하기(for문을 이용하여 루프를 돌면서 remove()로 삭제)
	public static long del1(List list){
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1 ; i >= 0; i--){
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	 }
	

	//del2() : 10000번 인덱스 이하의 데이터들을 하나씩 삭제
	public static long del2(List list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
