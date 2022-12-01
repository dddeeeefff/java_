import java.util.*;

class CalendarEx5 {
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("사용법 : java CalendarEx5 2022 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]); // 달력의 연도를 int형으로 변환
		int month = Integer.parseInt(args[1]); // 달력의 월를 int형으로 변환
		// set() 메소드의 인수로 사용하기 위해 int형으로 형변환을 함
		int weekDay = 0; // 1일의 요일번호로 시작위치로도 사용될 변수
		int endDay = 0; // 해당 월의 말일을 저장할 변수

		Calendar sdate = Calendar.getInstance(); // 시작일을 저장할 인스턴스
		Calendar edate = Calendar.getInstance(); // 종료일을 저장할 인스턴스

		//void		set(int year, int month, int date) : 날짜/시간을 지정한 년월일로 변경
		sdate.set(year, month - 1, 1); // 요일번호를 구하기 위한 시작일 지정
		edate.set(year, month, 1);
		edate.add(Calendar.DATE, -1); // 다음달 1일에서 하루를 뺀 날짜로 종료일 지정

		weekDay = sdate.get(Calendar.DAY_OF_WEEK);
		// 시작일의 요일 번호로 날짜 출력의 시작점으로 사용됨
		endDay = edate.get(Calendar.DATE);
		// 말일로 달력 출력의 종료점으로 사용됨

		System.out.println("      " + args[0] + "년" + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");

		for(int i = 1; i < weekDay; i++) System.out.print("   ");
		// 1일의 시작위치를 정하기 위한 for문

		for(int i = 1, j = weekDay; i <= endDay; i++, j++){
		// i : 날짜의 일(Day)을 표현하기 위한 변수
		// j : 일주일 지날 때마다 다음 줄로 내리기 위한 변수
			//if(i < 10) {System.out.print("  " +  i);}
			//else {System.out.print(" " +  i);}
			System.out.print((i < 10) ? "  " + i : " " + i);
			// 날짜 출력
			if(j % 7 == 0) System.out.println();
			// j의 값이 7의 배수일 경우 일주일이 지난 걸로 하여 다음 줄로 내림
		}

	}
}
