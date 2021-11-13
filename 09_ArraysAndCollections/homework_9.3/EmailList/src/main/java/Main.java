import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static final EmailList emailList = new EmailList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            int positionSpace = input.trim().indexOf(' ');
            String valueCommand = (positionSpace > 0 ? input.substring(0, positionSpace).toUpperCase() : input.substring(0).toUpperCase());
            String valueEmail = (positionSpace > 0 ? input.substring(positionSpace + 1).toLowerCase() : "");

            switch (valueCommand) {
                case "ADD":
                    emailList.add(valueEmail);
                    break;
                case "LIST":
                    emailList.getSortedEmails();
                    break;
                default:
                    System.out.println("Введенная команда некорректна.");
                    break;
            }
        }
        scanner.close();
    }
}
