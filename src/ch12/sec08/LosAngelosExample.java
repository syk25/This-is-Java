package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelosExample {
    public static void main(String[] args) {
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angelos");
        Calendar now = Calendar.getInstance(timezone);

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if( amPm == Calendar.AM){
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.printf("%s %d시 %d분 %d초\n",strAmPm, hour, minute, second);
    }
}
