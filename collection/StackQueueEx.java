import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		// Stack st와 Queue q를 각각 생성한 후 "0", "1", "2"를 저장
		Stack st = new Stack<>();
		Queue q = new LinkedList();
		// Queue는 인터페이스므로 Queue를 implements한 LinkedList로 생성

		st.push("0");		st.push("1");		st.push("2");

		q.offer("0");		q.offer("1");		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()){
			System.out.print(st.pop() + " "); // 2 1 0
			// 스택은 저장한 역순으로 데이터들이 추출됨
		}
		System.out.println();

		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.print(q.poll() + " "); // 0 1 2
			// 큐는 저장한 순서대로 데이터들이 추출됨
		}

	}
}
