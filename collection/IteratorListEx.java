import java.util.*;

class IteratorListEx {
	public static void main(String[] args) {
		ArrayList orig = new ArrayList(10);
		ArrayList cpy1 = new ArrayList(10);
		ArrayList cpy2 = new ArrayList(10);

		for(int i = 0; i < 10; i++) orig.add(i + "");
		// Iterator�� �̿��Ͽ� ������ ���鼭 orig�� ������ cpy1�� ����

		Iterator it = orig.iterator();
        while(it.hasNext()){
            cpy1.add(it.next());
        }
		System.out.println("= orig���� cpy1���� ���� =");
		System.out.println("orig : " + orig + "\ncpy1 : " + cpy1);
		// orig : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		// cpy1 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		it = orig.iterator(); // iterator�� ������ �ȵǹǷ� �ٽ� �����ؾ� ��
		while(it.hasNext()){
            cpy2.add(it.next());
			it.remove(); // �ҷ��� ��Ҹ� ����
        }
		System.out.println("= orig���� cpy2���� ���� =");
		System.out.println("orig : " + orig + "\ncpy2 : " + cpy2);
		// orig : []
		// cpy2 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		System.out.println();
		// ListIterator�� �̿��Ͽ� cpy1�� ���� ����ô �� �������� ���� �� ���� ���
		ListIterator lit = cpy1.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next() + " "); // 0 1 2 3 4 5 6 7 8 9
		}
		System.out.println();
		while(lit.hasPrevious()){
			System.out.print(lit.previous() + " "); // 9 8 7 6 5 4 3 2 1 0
		}
		System.out.println();

		//foreach���� �̿��Ͽ� cpy2�� ���� ���
		// � �ڷ����� �־�� ������ �Ǵ°�? -> Object
		for(Object fe : cpy2){
			System.out.print(fe + " "); // 0 1 2 3 4 5 6 7 8 9
		}
			
	}
}
