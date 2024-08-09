import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JavaCalenderClass {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTimeZone());
        System.out.println();
        System.out.println(gc.getFirstDayOfWeek());
        System.out.println();
        System.out.println(gc.getMinimalDaysInFirstWeek());
        System.out.println();

        System.out.println(gc.getTime());
        System.out.println();

        System.out.println(gc.getWeekYear());
        System.out.println(gc.getTimeInMillis());

        TimeZone t = gc.getTimeZone();

        System.out.println(t.getDisplayName());

        System.out.println(t.getID());

        System.out.println(t.getDefault());

        // System.out.println(t.getDSTSavings());

        System.out.println(gc.getAvailableCalendarTypes());

        ;

    }
}
