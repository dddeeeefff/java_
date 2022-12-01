import java.time.*;
import java.time.temporal.*;

class TimeEx4 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0,0,0);
		LocalTime time2 = LocalTime.of(12,34,56);
		Duration du = Duration.between(time1,time2);

		System.out.println("time1 : " + time1); // time1 : 00:00
		System.out.println("time2 : " + time2); // time2 : 12:34:56
		System.out.println("du : " + du); // du : PT12H34M56S
		System.out.println();

		// du에서 시간, 분, 초를 각각 출력
		LocalTime tmp = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println("hour : " + tmp.getHour()); // 12
		System.out.println("minute : " + tmp.getMinute()); // 34
		System.out.println("second : " + tmp.getSecond()); // 56

		/*
		System.out.println("du.toHours() : " + du.toHours());
		System.out.println("du.toMinutes() : " + du.toMinutes());
		System.out.println("du.get(ChronoUnit.SECONDS) : " + du.get(ChronoUnit.SECONDS));
		//System.out.println("du.toMillis() : " + du.toMillis() / 1000); // 가능
		System.out.println();
		*/
	}
}
