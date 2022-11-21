import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String data = "11 22 33";
		//data ���ڿ��� ���⸦ �������� ���ڿ� �迭�� ����� �� �����͸� ���(���η�)
		String[] arr = data.split(" ");
		for(String str : arr) System.out.print(str + " ");
		System.out.println();

		// ���� ������ �۾��� StringTokenizer�� �̿��Ͽ� �۾�

		StringTokenizer tokenizer = new StringTokenizer(data);
		// Ư�� �����ڸ� �������� ������ �⺻���� ���⸦ ������� ���ڿ��� ������
        while (tokenizer.hasMoreTokens())// hasMoreElements�� ����
		System.out.print(tokenizer.nextToken() + " "); // nextElement()�� ����
		//StringTokenizer�� �� ���� ������ ���� �� ������, �ٽ� ������ �� ��� ���� ����ų� �迭�� ��Ƽ� ���
		System.out.println();

		String data2 = "1+2-3*4/5";
		StringTokenizer st2 = new StringTokenizer(data2, "+-*/");
		// StringTokenizer������ �����ڴ� �� ���ڸ� ���ǹǷ� ���� ���� �Է½� �� ���ں��� �����ڷ� ������
		while(st2.hasMoreTokens()) System.out.print(st2.nextToken() + " ");
		// 1 2 3 4 5
		System.out.println();

		StringTokenizer st3 = new StringTokenizer(data2, "+-*/",true);
		// true : �����ڵ鵵 ��ũ���� ���
		while(st3.hasMoreTokens()) System.out.print(st3.nextToken() + " ");
		// 1 + 2 - 3 * 4 / 5
		System.out.println();
	}
}
