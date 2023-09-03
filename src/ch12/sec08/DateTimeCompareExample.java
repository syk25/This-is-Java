package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        System.out.println("시작일: " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2023, 12, 31, 0, 0, 0);
        System.out.println("종료일: " + endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)){
            System.out.println("진행중입니다.");
        } else if(startDateTime.isEqual(endDateTime)){
            System.out.println("종료합니다.");
        } else if(startDateTime.isAfter(endDateTime)){
            System.out.println("종료합니다.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDat = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("remainYear = " + remainYear);
        System.out.println("remainMonth = " + remainMonth);
        System.out.println("remainDat = " + remainDat);
        System.out.println("remainHour = " + remainHour);
        System.out.println("remainMinute = " + remainMinute);
        System.out.println("remainSecond = " + remainSecond);


    }
}
