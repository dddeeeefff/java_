import java.time.*;
import java.time.temporal.*;


class TimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 오늘 날짜로 LocalDate 인스턴스 today생성
		LocalTime now = LocalTime.now(); // 현재 시간으로 LocalTime 인스턴스 now 생성
		
		// 1999년 12월 31일로 새로운 LocalDate 인스턴스 bDate 생성
		// 23시 59분 59로호 새로운 LocalTime 인스턴스 bTime 생성

		//static LocalDateTime	of(int year, int month, int dayOfMonth, int hour, int minute) : 지정한 년월일 시분으로 LocalDateTime 클래스의 인스턴스를 생성
		LocalDate bDate = LocalDate.of(1999,12,31);
		LocalTime bTime = LocalTime.of(23,59,59);
		
		System.out.println("today : " + today); // today : 2022-12-01
		System.out.println("now : " + now); // now : 10:44:13.406
		System.out.println("bDate : " + bDate); // dDate : 1999-12-31
		System.out.println("bTime : " + bTime); // bTime : 23:59:59
		System.out.println();

		// bDate의 연도를 2000년으로 변경하여 출력
		System.out.println("withYear(2000) : " + bDate.withYear(2000));
		// 2000-12-31 : 원본인 dDate가 변경되는 것은 아님

		// bDate에 하루를 더한 후 출력 - plusDays() 이용
		System.out.println("plusDays(1) : " + bDate.plusDays(1));
		// 2000-01-01 : 원본인 dDate가 변경되는 것은 아님
		
		// bDate에 하루를 더한 후 출력 - plus() 이용
		System.out.println("plus(1, ChronoUnit.DAYS) : " + bDate.plus(1, ChronoUnit.DAYS));
		// 2000-01-01
		System.out.println();

		// bTime의 값을 23:00로 출력되게 작업(with() 사용없이)
		System.out.println("truncatedTo(ChronoUnit.HOURS) : " + bTime.truncatedTo(ChronoUnit.HOURS));
		// bTime의 시(hour)보다 작은 유닛들은 모두 0으로 변경
	
	}
}
