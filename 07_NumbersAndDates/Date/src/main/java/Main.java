import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 14;
        int month = 7;
        int year = 1980;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(" - dd.MM.yyyy - EE", Locale.US);

        int i = 0;
        String str = "";
        while (birthday.isBefore(today.plusDays(1))) {
            str = str + i + dateFormatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            i++;
        }
        return str;
    }
}
