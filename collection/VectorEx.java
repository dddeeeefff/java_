import java.util.*;

class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");		v.add("2");		v.add("3");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 5

		v.trimToSize();
		// 빈칸을 지워 size와 capacity(용량)을 같게 함
		System.out.println("=== Atfer trimToSize() ===");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 3

		v.ensureCapacity(6);
		// capacity의 최소값을 6으로 지정
		System.out.println("=== Atfer ensureCapacity(6) ===");
		print(v);
		//[1, 2, 3]
		//size : 3 / capacity : 6



		v.setSize(7);
		// size를 강제로 7로 맞춤, 데이터가 모자르면 null로 채움
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
