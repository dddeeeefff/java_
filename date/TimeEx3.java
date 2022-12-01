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
		// pe를 이용하여 각각 연월일을 출력
		System.out.println("년 : " + pe.getYears()); // 년 : 1
		System.out.println("월 : " + pe.getMonths()); // 월 : 11
		System.out.println("일 : " + pe.get(ChronoUnit.DAYS)); // 일 : 30
		// ChronoUnit.DAYS도 가능
		System.out.println();

		// 2021-11-30부터 2022-9-9 까지의 기간을 Preiod로 생성 후 출력(pe2 생성)
		LocalDate date3 = LocalDate.of(2021, 11, 30);
		LocalDate date4 = LocalDate.of(2022, 9, 9);
		Period pe2 = Period.between(date3, date4); // pe2 : P9M10D(1년 미만이라 연도 누락)
		System.out.println("pe2 : " + pe2);
		System.out.println();

		LocalDate date5 = LocalDate.of(2022, 11, 30);
		LocalDate date6 = LocalDate.of(2022, 9, 9);
		Period pe3 = Period.between(date5, date6);
		System.out.println("pe3 : " + pe3); // pe3 : P-2M-21D
		// 뒤의 날짜가 더 빠를경우 Period의 값이 음수로 나옴
		System.out.println();

		if(pe3.isNegative()){ // pe3 값이 음수일 경우
			pe3 = Period.between(date6, date5);
			// 인수의 순서를 바꿔서 작업
		}
		System.out.println("date5 : " + date5); // 2022-11-30
		System.out.println("date6 : " + date6); // 2022-09-09
		System.out.println("pe3 : " + pe3); // pe3 : P2M21D

		
	}
}
