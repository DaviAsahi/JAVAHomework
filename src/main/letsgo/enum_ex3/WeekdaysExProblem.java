//열거타입 이놈

package main.letsgo.enum_ex3;

public class WeekdaysExProblem {
    public static void main(String[] args) {
        Weekdays[] values = Weekdays.values();
        for (Weekdays value : values) {
            System.out.println(value);
            System.out.println(value.getDays());
            System.out.println(value.getWeeks());
        }
        Weekdays weekdays = Weekdays.valueOf("Monday");
        System.out.println("날짜" + weekdays.getDays());
        System.out.println("요일" + weekdays.getWeeks());
    }
}
