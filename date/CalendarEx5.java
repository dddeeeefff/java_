import java.util.*;

class CalendarEx5 {
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("���� : java CalendarEx5 2022 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]); // �޷��� ������ int������ ��ȯ
		int month = Integer.parseInt(args[1]); // �޷��� ���� int������ ��ȯ
		// set() �޼ҵ��� �μ��� ����ϱ� ���� int������ ����ȯ�� ��
		int weekDay = 0; // 1���� ���Ϲ�ȣ�� ������ġ�ε� ���� ����
		int endDay = 0; // �ش� ���� ������ ������ ����

		Calendar sdate = Calendar.getInstance(); // �������� ������ �ν��Ͻ�
		Calendar edate = Calendar.getInstance(); // �������� ������ �ν��Ͻ�

		//void		set(int year, int month, int date) : ��¥/�ð��� ������ ����Ϸ� ����
		sdate.set(year, month - 1, 1); // ���Ϲ�ȣ�� ���ϱ� ���� ������ ����
		edate.set(year, month, 1);
		edate.add(Calendar.DATE, -1); // ������ 1�Ͽ��� �Ϸ縦 �� ��¥�� ������ ����

		weekDay = sdate.get(Calendar.DAY_OF_WEEK);
		// �������� ���� ��ȣ�� ��¥ ����� ���������� ����
		endDay = edate.get(Calendar.DATE);
		// ���Ϸ� �޷� ����� ���������� ����

		System.out.println("      " + args[0] + "��" + args[1] + "��");
		System.out.println(" SU MO TU WE TH FR SA");

		for(int i = 1; i < weekDay; i++) System.out.print("   ");
		// 1���� ������ġ�� ���ϱ� ���� for��

		for(int i = 1, j = weekDay; i <= endDay; i++, j++){
		// i : ��¥�� ��(Day)�� ǥ���ϱ� ���� ����
		// j : ������ ���� ������ ���� �ٷ� ������ ���� ����
			//if(i < 10) {System.out.print("  " +  i);}
			//else {System.out.print(" " +  i);}
			System.out.print((i < 10) ? "  " + i : " " + i);
			// ��¥ ���
			if(j % 7 == 0) System.out.println();
			// j�� ���� 7�� ����� ��� �������� ���� �ɷ� �Ͽ� ���� �ٷ� ����
		}

	}
}
