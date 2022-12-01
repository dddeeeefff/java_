import java.time.*;
import java.time.temporal.*;

class TimeEx3 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2021, 1, 1);
		LocalDate date2 = LocalDate.of(2022, 12, 31);
		Period pe = Period.between(date1, date2);

		System.out.println("date1 : " + date1); // date1 : 2021-01-01
		System.out.println("date2 : " + date2); // date2 : 2022-12-31
		System.out.println("pe : " + pe); // pe : P1Y11M30D
		System.out.println();
		// pe�� �̿��Ͽ� ���� �������� ���
		System.out.println("�� : " + pe.getYears()); // �� : 1
		System.out.println("�� : " + pe.getMonths()); // �� : 11
		System.out.println("�� : " + pe.get(ChronoUnit.DAYS)); // �� : 30
		// ChronoUnit.DAYS�� ����
		System.out.println();

		// 2021-11-30���� 2022-9-9 ������ �Ⱓ�� Preiod�� ���� �� ���(pe2 ����)
		LocalDate date3 = LocalDate.of(2021, 11, 30);
		LocalDate date4 = LocalDate.of(2022, 9, 9);
		Period pe2 = Period.between(date3, date4); // pe2 : P9M10D(1�� �̸��̶� ���� ����)
		System.out.println("pe2 : " + pe2);
		System.out.println();

		LocalDate date5 = LocalDate.of(2022, 11, 30);
		LocalDate date6 = LocalDate.of(2022, 9, 9);
		Period pe3 = Period.between(date5, date6);
		System.out.println("pe3 : " + pe3); // pe3 : P-2M-21D
		// ���� ��¥�� �� ������� Period�� ���� ������ ����
		System.out.println();

		if(pe3.isNegative()){ // pe3 ���� ������ ���
			pe3 = Period.between(date6, date5);
			// �μ��� ������ �ٲ㼭 �۾�
		}
		System.out.println("date5 : " + date5); // 2022-11-30
		System.out.println("date6 : " + date6); // 2022-09-09
		System.out.println("pe3 : " + pe3); // pe3 : P2M21D

		
	}
}
