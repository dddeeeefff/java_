import java.util.*;

class CalendarEx2 {
	public static void main(String[] args) {
		final String[] WEEK_DAY = {"","일","월","화","수","목","금","토"};
		// 요일 이름을 출력하기 위한 문자열 상수 배열
		// 요일번호는 1부터 시작하므로 첫번째 요소를 비워둠

		// 오늘 날짜(date2)와 2021년 1월 15일로 지정한 날짜(date1) 객체를 생성
		// 지정한 날짜를 어떻게 구하지?
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2021,0,15);

		System.out.println("date1은 " + toString(date1) + WEEK_DAY[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		// date1은 2021년 1월 15일 금요일이고,
		System.out.println("date2은 " + toString(date2) + WEEK_DAY[date2.get(Calendar.DAY_OF_WEEK)] + "요일이다 ");
		// date1은 2022년 11월 30일 수요일이다

		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("그 날(date1)부터 지금(date2)까지 " + diff + "초가 지났습니다.");
		// 그 날(date1)부터 지금(date2)까지 59097600초가 지났습니다.
		System.out.println("일(day) 단위로 계산하면 " + (diff/ (24*60*60)) + "일 입니다.");
		// 일(day) 단위로 계산하면 684일 입니다.
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "년" + 
		(date.get(Calendar.MONTH) + 1) + "월" + 
		date.get(Calendar.DATE) + "일";
	}
}
