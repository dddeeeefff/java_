import java.util.*;

class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
		// objArr �迭�� ������ ��� set�� ������ �� ���
		for(int i = 0; i < objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set); // [1, 1, 2, 3, 4] (�ߺ��� ���� x)
	}
}
