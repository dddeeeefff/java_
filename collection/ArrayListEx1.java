import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		// list1에 integer형 인스턴스 저장 - 5 4 2 0 1 3
		list1.add(new Integer(5));		list1.add(new Integer(4));
		list1.add(new Integer(2));		list1.add(new Integer(0));
		list1.add(new Integer(1));		list1.add(new Integer(3));

		//list1에서 4, 2, 0 데이터들만 잘라서 list2 생성
		//List<E>			subList(int fromIndex, int toIndex)	
		//: 리스트를 fromIndex 부터 toIndex - 1까지 잘라내어 리스트로 리턴

//		ArrayList list2 = new ArrayList();
//		list2.add(list1.get(1));
//		list2.add(list1.get(2));
//		list2.add(list1.get(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4));
		// subList의 리턴타입이 List이므로 collection을 매개변수로 하는 ArrayList의 생성자를 이용하여 새로운
		// ArrayList 인스턴스2를 생성
		print(list1, list2);
		//list1 : [5, 4, 2, 0, 1, 3]		list2 : [4, 2, 0]


		Collections.sort(list1);		Collections.sort(list2);
		// Collections 클래스의 sort() 메소드를 이용 두 ArrayList를 오름차순 정럴
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]		list2 : [0, 2, 4]

		System.out.println("list1.containsAll(list2)" + list1.containsAll(list2) + "\n"); 
		// list1.containsAll(list2)true
		// list1에 list2의 데이터들이 모두 들어 있는지 여부


		// list2의 맨 뒤에 "B"와 "C"를 추가하고, 3번 자리에 "A"를 추가
		// void			add(int index, E element)					 : 리스트의 index위치에 element를 추가
		list2.add("B");		list2.add("C");		list2.add(3,"A");
		// Collections 인터페이스의 add() 메소드를 이용하여 맨 뒤에 두 데이터 추가
		// list 인터페이스를 이용하여 특정 인덱스의 데이터 추가
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]	list2 : [0, 2, 4, A, B, C]

		// list2의 3번 자리를 "AA"로 덮어쓰기
		list2.set(3, "AA");
		print(list1, list2);
		//list1 : [0, 1, 2, 3, 4, 5]	list2 : [0, 2, 4, AA, B, C]

		// list1에서 list2의 데이터와 동일한 데이터들만 남기고 나머지는 삭제
		// boolean     retainAll(Collection<?> c) : 컬렉션에서 지정한 컬렉션(c)의 데이터들만 남기고 다른 데이터들 삭제
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); 
		// true -> list1에서 삭제데이터o
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); 
		// false -> list1에서 삭제데이터x
		print(list1, list2);
		// list1 : [0, 2, 4]		list2 : [0, 2, 4, AA, B, C]

		// list2에 list1과 동일한 데이터가 있으면 찾아내어 하나씩 삭제 후 출력(for문)
		//E	remove(int index): 리스트에서 지정한 index에 해당하는 데이터를 삭제한 후 해당 데이터를 리턴
		/*	
		for(int i = 0; i < list2.size(); i++){
			for(int j = 0; j < list1.size(); j++){
				if(list2.get(i) == list1.get(j))
					list2.remove(i);
			}
		}
		*/
		for(int i = list2.size()-1; i >= 0; i--){
		// 여러 데이터를 삭제할 경우 거꾸로 루프를 돌면서 삭제하는 것이 효율적임
			if(list1.contains(list2.get(i))){
			//list1에 list2의 i인덱스에 해당하는 데이터가 들어있으면
				list2.remove(i);
				// list2의 i인덱스에 해당하는 데이터 삭제
			}
		} // 단, 본 예제는 removeAll() 메소드를 사용해도 됨
		print(list1, list2);
		// list1 : [0, 2, 4]		list2 : [AA, B, C]
	}
	public static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
