import java.util.*;

class CalendarEx3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_NAME = {"시간","분","초"};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		// time1은 10시 20분 30초로 지정

		// time2는 20시 30분 10초로 지정

		// void		roll(int field, int amount) : add()와 같으나 지정한 field의 값만 변하고 다른 필드의 값을 변하지 않음
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시간" + 
			time1.get(Calendar.MINUTE) + "분" + time1.get(Calendar.SECOND) + "초");
		// time1 : 10시20분30초
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시간" + 
			time2.get(Calendar.MINUTE) + "분" + time2.get(Calendar.SECOND) + "초");
		// time2 : 20시30분10초

		// 두 시간의 차를 초 단위로 출력(단, 절댓값으로)
		long diff = Math.abs((time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000);
		System.out.println("time1과 time2의 시간차는 " + diff + "초 입니다.");
		// time1과 time2의 시간차는 36580초 입니다.

		String tmp = ""; // 시분초의 문자열을 저장할 변수
		for(int i = 0; i < TIME_UNIT.length; i++){
			tmp += diff / TIME_UNIT[i] + TIME_NAME[i];
			diff %= TIME_UNIT[i];
		}
		System.out.println("시간차를 시분초로 변환하면 " + tmp + " 입니다.");
		// 시간차를 시분초로 변환하면 10시간9분40초 입니다.
	}
}
