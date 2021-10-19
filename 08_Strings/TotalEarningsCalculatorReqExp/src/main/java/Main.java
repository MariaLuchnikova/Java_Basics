import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));
    }

    public static int calculateSalarySum(String text) {
        //TODO: реализуйте метод
        String regex = "[0-9]{1,}";
        int sumSalary = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            sumSalary = sumSalary + Integer.parseInt(text.substring(start, end));
        }
        return sumSalary;
    }
}