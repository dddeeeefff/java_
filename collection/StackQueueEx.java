import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		// Stack st�� Queue q�� ���� ������ �� "0", "1", "2"�� ����
		Stack st = new Stack<>();
		Queue q = new LinkedList();
		// Queue�� �������̽��Ƿ� Queue�� implements�� LinkedList�� ����

		st.push("0");		st.push("1");		st.push("2");

		q.offer("0");		q.offer("1");		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()){
			System.out.print(st.pop() + " "); // 2 1 0
			// ������ ������ �������� �����͵��� �����
		}
		System.out.println();

		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.print(q.poll() + " "); // 0 1 2
			// ť�� ������ ������� �����͵��� �����
		}

	}
}
