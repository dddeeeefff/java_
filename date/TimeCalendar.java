import java.time.*;
import java.time.temporal.*;
import static java.time.temporal.TemporalAdjusters.*;
// TemporalAdjusters Ŭ������ static �޼ҵ���� Ŭ���� �̸� ���� �ٷ� ����ϰڴٴ� �ǹ�

/*
LocalDate ��ü�� �̿��Ͽ� �޷� ���
����� ������ ���� ������ �⺻���� ���� ������ ������
*/

class TimeCalendar {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		int year = today.getYear();
		int month = today.getMonthValue();

		if(args.length == 2){
			year = Integer.parseInt(args[0]);
			month = Integer.parseInt(args[1]); 
		}

		
		LocalDate sdate = LocalDate.of(year,month,1); // ������
		int endDay = sdate.with(lastDayOfMonth()).getDayOfMonth(); // ����
		int weekDay = sdate.getDayOfWeek().getValue(); // �������� ���� ��ȣ

		System.out.println("      " + year + "��" + month + "��");

		// ��ȭ����������� ������ ���
		// System.out.println(" MO TU WE TH FR SA SU");

		// �Ͽ�ȭ��������� ������ ���
		
		weekDay++;
		if(weekDay == 8) weekDay = 1;
		System.out.println(" SU MO TU WE TH FR SA");


		for(int i = 1; i < weekDay; i++) System.out.print("   ");

		for(int i = 1, j = weekDay; i <= endDay; i++, j++){
			System.out.print((i < 10) ? "  " + i : " " + i);
			if(j % 7 == 0) System.out.println();
		}


	}
}
