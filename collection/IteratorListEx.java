import java.util.*;

class IteratorListEx {
	public static void main(String[] args) {
		ArrayList orig = new ArrayList(10);
		ArrayList cpy1 = new ArrayList(10);
		ArrayList cpy2 = new ArrayList(10);

		for(int i = 0; i < 10; i++) orig.add(i + "");
		// Iterator를 이용하여 루프를 돌면서 orig의 값들을 cpy1에 저장

		Iterator it = orig.iterator();
        while(it.hasNext()){
            cpy1.add(it.next());
        }
		System.out.println("= orig에서 cpy1으로 복사 =");
		System.out.println("orig : " + orig + "\ncpy1 : " + cpy1);
		// orig : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		// cpy1 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		it = orig.iterator(); // iterator는 재사용이 안되므로 다시 생성해야 함
		while(it.hasNext()){
            cpy2.add(it.next());
			it.remove(); // 불러온 요소를 삭제
        }
		System.out.println("= orig에서 cpy2으로 복사 =");
		System.out.println("orig : " + orig + "\ncpy2 : " + cpy2);
		// orig : []
		// cpy2 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		System.out.println();
		// ListIterator를 이용하여 cpy1의 값을 순자척 및 역순으로 각각 한 번씩 출력
		ListIterator lit = cpy1.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next() + " "); // 0 1 2 3 4 5 6 7 8 9
		}
		System.out.println();
		while(lit.hasPrevious()){
			System.out.print(lit.previous() + " "); // 9 8 7 6 5 4 3 2 1 0
		}
		System.out.println();

		//foreach문을 이용하여 cpy2의 값을 출력
		// 어떤 자료형을 넣어야 성립이 되는가? -> Object
		for(Object fe : cpy2){
			System.out.print(fe + " "); // 0 1 2 3 4 5 6 7 8 9
		}
			
	}
}
