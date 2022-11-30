import java.util.*;

class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2020, 7, 30);
		System.out.println(toString(date)); // 2020년8월30일
		
		// void		add(int field, int amount) : 날짜/시간에서 지정한 field의 값에 amount(음수 사용가능)를 더함
		System.out.println("== 1일 후 ==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date)); // 2020년8월31일

		System.out.println("== 6개월 전 ==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date)); // 2020년2월29일
		
		System.out.println("== 31일 후(roll) ==");
		date.roll(Calendar.DATE, 31); // (roll)지정한 필드의 값만 변함
		System.out.println(toString(date)); // 2020년2월2일

		System.out.println("== 31일 후(add) ==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date)); // 2020년3월4일
}		
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "년" + 
		(date.get(Calendar.MONTH) + 1) + "월" + 
		date.get(Calendar.DATE) + "일";
	}
}
