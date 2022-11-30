import java.util.*;

class CalendarEx2 {
	public static void main(String[] args) {
		final String[] WEEK_DAY = {"","��","��","ȭ","��","��","��","��"};
		// ���� �̸��� ����ϱ� ���� ���ڿ� ��� �迭
		// ���Ϲ�ȣ�� 1���� �����ϹǷ� ù��° ��Ҹ� �����

		// ���� ��¥(date2)�� 2021�� 1�� 15�Ϸ� ������ ��¥(date1) ��ü�� ����
		// ������ ��¥�� ��� ������?
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2021,0,15);

		System.out.println("date1�� " + toString(date1) + WEEK_DAY[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�, ");
		// date1�� 2021�� 1�� 15�� �ݿ����̰�,
		System.out.println("date2�� " + toString(date2) + WEEK_DAY[date2.get(Calendar.DAY_OF_WEEK)] + "�����̴� ");
		// date1�� 2022�� 11�� 30�� �������̴�

		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("�� ��(date1)���� ����(date2)���� " + diff + "�ʰ� �������ϴ�.");
		// �� ��(date1)���� ����(date2)���� 59097600�ʰ� �������ϴ�.
		System.out.println("��(day) ������ ����ϸ� " + (diff/ (24*60*60)) + "�� �Դϴ�.");
		// ��(day) ������ ����ϸ� 684�� �Դϴ�.
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "��" + 
		(date.get(Calendar.MONTH) + 1) + "��" + 
		date.get(Calendar.DATE) + "��";
	}
}
