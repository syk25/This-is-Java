package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch(week) {
            case Calendar.MONDAY -> strWeek = "월";
            case Calendar.TUESDAY -> strWeek = "화";
            case Calendar.WEDNESDAY -> strWeek = "수";
            case Calendar.THURSDAY -> strWeek = "목";
            case Calendar.FRIDAY -> strWeek = "금";
            case Calendar.SATURDAY -> strWeek = "토";
            case Calendar.SUNDAY -> strWeek = "일";
        }
        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM){
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);


        System.out.printf("%d년 %d월 %d일\n", year, month, day);
        System.out.printf("%s요일 %s\n", strWeek, strAmPm);
        System.out.printf("%d시 %d분 %d초\n", hour, minute, second);

    }
}
