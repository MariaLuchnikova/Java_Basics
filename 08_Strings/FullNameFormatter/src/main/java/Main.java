import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            char space = ' ';
            int i = input.indexOf(space);
            int countSpace = 0;
            int flagDigit = 0;
            String template = "Фамилия: %s\nИмя: %s\nОтчество: %s";

            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == space) {
                    countSpace++;
                }
                if (Character.isDigit(symbol)) {
                    flagDigit = 1;
                }
            }
            if (countSpace != 2 || flagDigit == 1)
                System.out.println("Введенная строка не является ФИО");
            else {
                String Surname = input.substring(0, i);
                String Name = input.substring(i, input.indexOf(space, i + 1)).trim();
                String Patronymic = input.substring(input.lastIndexOf(space)).trim();
                System.out.printf(template, Surname, Name, Patronymic);
            }
        }
    }
}