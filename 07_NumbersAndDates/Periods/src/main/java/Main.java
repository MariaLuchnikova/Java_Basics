import java.time.LocalDate;
import java.time.Period;

public class Main {
    private static final int day = 23;
    private static final int month = 5;
    private static final int year = 1995;

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(year, month, day);
        System.out.println(getPeriodFromBirthday(birthday));
    }

    public static String getPeriodFromBirthday(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return "" + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }

}
