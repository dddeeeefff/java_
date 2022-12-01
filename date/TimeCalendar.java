import java.time.*;
import java.time.temporal.*;
import static java.time.temporal.TemporalAdjusters.*;
// TemporalAdjusters 클래스의 static 메소드들을 클래스 이름 없이 바로 사용하겠다는 의미

/*
LocalDate 객체를 이용하여 달력 출력
실행시 연도와 월이 없으면 기본으로 현재 연월을 보여줌
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

		
		LocalDate sdate = LocalDate.of(year,month,1); // 시작일
		int endDay = sdate.with(lastDayOfMonth()).getDayOfMonth(); // 말일
		int weekDay = sdate.getDayOfWeek().getValue(); // 시작일의 요일 번호

		System.out.println("      " + year + "년" + month + "월");

		// 월화수목금토일의 순으로 출력
		// System.out.println(" MO TU WE TH FR SA SU");

		// 일월화수목금토의 순으로 출력
		
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
