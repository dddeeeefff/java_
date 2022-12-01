import java.time.*;
import java.time.temporal.*;


class TimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // ���� ��¥�� LocalDate �ν��Ͻ� today����
		LocalTime now = LocalTime.now(); // ���� �ð����� LocalTime �ν��Ͻ� now ����
		
		// 1999�� 12�� 31�Ϸ� ���ο� LocalDate �ν��Ͻ� bDate ����
		// 23�� 59�� 59��ȣ ���ο� LocalTime �ν��Ͻ� bTime ����

		//static LocalDateTime	of(int year, int month, int dayOfMonth, int hour, int minute) : ������ ����� �ú����� LocalDateTime Ŭ������ �ν��Ͻ��� ����
		LocalDate bDate = LocalDate.of(1999,12,31);
		LocalTime bTime = LocalTime.of(23,59,59);
		
		System.out.println("today : " + today); // today : 2022-12-01
		System.out.println("now : " + now); // now : 10:44:13.406
		System.out.println("bDate : " + bDate); // dDate : 1999-12-31
		System.out.println("bTime : " + bTime); // bTime : 23:59:59
		System.out.println();

		// bDate�� ������ 2000������ �����Ͽ� ���
		System.out.println("withYear(2000) : " + bDate.withYear(2000));
		// 2000-12-31 : ������ dDate�� ����Ǵ� ���� �ƴ�

		// bDate�� �Ϸ縦 ���� �� ��� - plusDays() �̿�
		System.out.println("plusDays(1) : " + bDate.plusDays(1));
		// 2000-01-01 : ������ dDate�� ����Ǵ� ���� �ƴ�
		
		// bDate�� �Ϸ縦 ���� �� ��� - plus() �̿�
		System.out.println("plus(1, ChronoUnit.DAYS) : " + bDate.plus(1, ChronoUnit.DAYS));
		// 2000-01-01
		System.out.println();

		// bTime�� ���� 23:00�� ��µǰ� �۾�(with() ������)
		System.out.println("truncatedTo(ChronoUnit.HOURS) : " + bTime.truncatedTo(ChronoUnit.HOURS));
		// bTime�� ��(hour)���� ���� ���ֵ��� ��� 0���� ����
	
	}
}
