package Session_07.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAndCalendarExample {
    public static void main(String[] args) {

        //1. Java Date Examples

        //Example 1.1 - Convert Date to String
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy/M/dd HH:mm:ss");
        String dateInString = simpleDateFormat.format(new Date());
        System.out.println("Example 1.1 - Convert Date to String");
        System.out.println("SimpleDateFormat:  " + dateInString + "\n");

        //Example 1.2 – Convert String to Date.
        Date date;
        SimpleDateFormat simpleDateFormat1 =
                new SimpleDateFormat("HH_mm_ss dd-M-yyyy");
        try {
            date = simpleDateFormat.parse(dateInString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Example 1.2 – Convert String to Date");
        System.out.println(simpleDateFormat1.format(date) + "\n");

        //Example 1.4 – Convert Calendar to Date
        Calendar calendar = Calendar.getInstance();
        Date date2 = calendar.getTime();
        SimpleDateFormat simpleDateFormat2 =
                new SimpleDateFormat("HH|mm|ss dd-M-yyyy");
        System.out.println("Example 1.4 – Convert Calendar to Date \n" +
                simpleDateFormat2.format(date2) + "\n");

        //2. Java Calendar Examples

        //Example 2.5– Convert Date to Calendar.
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        System.out.println(
                "Example 2.5– Convert Date to Calendar \n" +
                "Hour of Day in Java Calendar Object: " +
                        "\n(converted Date to Calendar) \n" +
                        calendar1.get(Calendar.HOUR_OF_DAY) + "\n");

        //Example 2.2 – Simple Calendar example
        System.out.println("Example 2.2 – Simple Calendar example");
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH);
        int dayOfMonth = calendar1.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar1.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar1.get(Calendar.WEEK_OF_MONTH);
        int hour = calendar1.get(Calendar.HOUR);// 12 hour clock
        int hourOfDay = calendar1.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute = calendar1.get(Calendar.MINUTE);
        int second = calendar1.get(Calendar.SECOND);
        int millisecond= calendar1.get(Calendar.MILLISECOND);
        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);
        System.out.println("hour \t\t: " + hour);
        System.out.println("hourOfDay \t: " + hourOfDay);
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond \t: " + millisecond + "\n");

        //Example 2.3 – Set a date manually in Calendar Object.
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        calendar2.set(Calendar.HOUR_OF_DAY, 23);
        calendar2.set(Calendar.YEAR, 2017);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy/M/dd H:m:ss");
        String calendarInString = simpleDateFormat3.format(calendar2.getTime());
        System.out.println("Example 2.3 – Set a date manually\n");
        System.out.println(calendarInString + "\n");

        //Example 2.4– Add or subtract from a date.
        Calendar calendar3 = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy/M/dd hh:m:ss");
        calendar3.setTime(new Date());
        System.out.println("Example 2.4– Add or subtract from a date");
        System.out.println("Main Calendar object:\n" + simpleDateFormat4.format(calendar3.getTime()));
        calendar3.add(Calendar.YEAR, 2);
        System.out.println("In Calendar Object year is added by 2:");
        System.out.println(simpleDateFormat4.format(calendar3.getTime()) + "\n");

    }
}
