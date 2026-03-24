package main.letsgo.enum_ex3;

public enum Weekdays {
    Monday(1, "월요일"),
    Tuesday(2, "화요일"),
    Wednesday(3, "수요일"),
    Thursday(4, "목요일"),
    Friday(5, "금요일"),
    Saturday(6, "토요일"),
    Sunday(7, "일요일"),
    ;

    private int days;
    private String weeks;

    Weekdays(int days, String weeks) {
        this.days = days;
        this.weeks = weeks;
    }

    public int getDays() {
        return days;
    }

    public String getWeeks() {
        return weeks;
    }


}
