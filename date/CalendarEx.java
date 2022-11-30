import java.util.*;

class CalendarEx {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // 오늘 날짜 및 현재 시간
		// Calendar는 abstract 클래스이므로 인스턴스를 생성자가 아닌 메소드로 생성
		
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR)); // 2022
		System.out.println("월(0~11) : " + today.get(Calendar.MONTH)); // 10(11월 기준)
		System.out.println("이 해의 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR)); // 49
		System.out.println("이 달의 몇 째주 : " + today.get(Calendar.WEEK_OF_MONTH)); // 5
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH)); // 30
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE)); // 30
		System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR)); // 334
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK)); // 4
		System.out.println();
		System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM)); // 0
		System.out.println("시(0~11) : " + today.get(Calendar.HOUR)); // 9
		System.out.println("시(0~23) : " + today.get(Calendar.HOUR_OF_DAY)); // 9
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE)); // 59
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND)); // 14
		System.out.println("밀리초(0~999) : " + today.get(Calendar.MILLISECOND)); // 186
		System.out.println("이 달의 말일 : " + today.getActualMaximum(Calendar.DATE)); // 30
	}
}
