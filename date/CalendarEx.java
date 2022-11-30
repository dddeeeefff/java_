import java.util.*;

class CalendarEx {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // ���� ��¥ �� ���� �ð�
		// Calendar�� abstract Ŭ�����̹Ƿ� �ν��Ͻ��� �����ڰ� �ƴ� �޼ҵ�� ����
		
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR)); // 2022
		System.out.println("��(0~11) : " + today.get(Calendar.MONTH)); // 10(11�� ����)
		System.out.println("�� ���� �� °�� : " + today.get(Calendar.WEEK_OF_YEAR)); // 49
		System.out.println("�� ���� �� °�� : " + today.get(Calendar.WEEK_OF_MONTH)); // 5
		System.out.println("�� ���� ���� : " + today.get(Calendar.DAY_OF_MONTH)); // 30
		System.out.println("�� ���� ���� : " + today.get(Calendar.DATE)); // 30
		System.out.println("�� ���� ���� : " + today.get(Calendar.DAY_OF_YEAR)); // 334
		System.out.println("����(1~7, 1:�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK)); // 4
		System.out.println();
		System.out.println("����_����(0:����, 1:����) : " + today.get(Calendar.AM_PM)); // 0
		System.out.println("��(0~11) : " + today.get(Calendar.HOUR)); // 9
		System.out.println("��(0~23) : " + today.get(Calendar.HOUR_OF_DAY)); // 9
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE)); // 59
		System.out.println("��(0~59) : " + today.get(Calendar.SECOND)); // 14
		System.out.println("�и���(0~999) : " + today.get(Calendar.MILLISECOND)); // 186
		System.out.println("�� ���� ���� : " + today.getActualMaximum(Calendar.DATE)); // 30
	}
}
