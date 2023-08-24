package ch05.sec12;
import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        // 열거변수 선언
        Week today = null;

        // Calendar 객체 얻기
        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // week 로 얻은 수를 Week 열거타입을 이용하여 변수에 대입
        switch(week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if(today == Week.SUNDAY){
            System.out.println("일요일에 축구합시다.");
        } else {
            System.out.println("열심히 자바를 공부합시다.");
        }
    }
}
