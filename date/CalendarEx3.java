import java.util.*;

class CalendarEx3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_NAME = {"�ð�","��","��"};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		// time1�� 10�� 20�� 30�ʷ� ����

		// time2�� 20�� 30�� 10�ʷ� ����

		// void		roll(int field, int amount) : add()�� ������ ������ field�� ���� ���ϰ� �ٸ� �ʵ��� ���� ������ ����
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "�ð�" + 
			time1.get(Calendar.MINUTE) + "��" + time1.get(Calendar.SECOND) + "��");
		// time1 : 10��20��30��
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "�ð�" + 
			time2.get(Calendar.MINUTE) + "��" + time2.get(Calendar.SECOND) + "��");
		// time2 : 20��30��10��

		// �� �ð��� ���� �� ������ ���(��, ��������)
		long diff = Math.abs((time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000);
		System.out.println("time1�� time2�� �ð����� " + diff + "�� �Դϴ�.");
		// time1�� time2�� �ð����� 36580�� �Դϴ�.

		String tmp = ""; // �ú����� ���ڿ��� ������ ����
		for(int i = 0; i < TIME_UNIT.length; i++){
			tmp += diff / TIME_UNIT[i] + TIME_NAME[i];
			diff %= TIME_UNIT[i];
		}
		System.out.println("�ð����� �ú��ʷ� ��ȯ�ϸ� " + tmp + " �Դϴ�.");
		// �ð����� �ú��ʷ� ��ȯ�ϸ� 10�ð�9��40�� �Դϴ�.
	}
}
