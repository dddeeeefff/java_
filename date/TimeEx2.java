import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
   @Override   // 오버라이딩을 한다는 표식으로 생략해도 무방
   public Temporal adjustInto(Temporal temporal) {
      return temporal.plus(2, ChronoUnit.DAYS);
   }
}

class TimeEx2 {
   public static void main(String[] args) {
      LocalDate today = LocalDate.now();
      LocalDate date = today.with(new DayAfterTomorrow());

      p(today);   // 2022-12-01
      p(date);    // 2022-12-03
      p(today.with(firstDayOfNextMonth()));			// 2023-01-01
      p(today.with(firstDayOfMonth()));				// 2022-12-01
      p(today.with(lastDayOfMonth()));				// 2022-12-31
      p(today.with(firstInMonth(TUESDAY)));			// 2022-12-06
      p(today.with(lastInMonth(TUESDAY)));			// 2022-12-27
      p(today.with(previous(TUESDAY)));				// 2022-11-29
      p(today.with(previousOrSame(TUESDAY)));		// 2022-11-29
      p(today.with(next(TUESDAY)));					// 2022-12-06
      p(today.with(nextOrSame(TUESDAY)));			// 2022-12-06
      p(today.with(dayOfWeekInMonth(4, TUESDAY)));  // 2022-12-27
   }
   static void p(Object obj) {
      System.out.println(obj);
   }
}