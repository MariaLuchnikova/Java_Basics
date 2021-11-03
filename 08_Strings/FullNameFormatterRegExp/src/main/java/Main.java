import java.sql.SQLOutput;
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
            String setList = "[А-я-]{2,}";  // при условии, что в фамилии, имени, отчестве содержится хотя бы 2 буквы
            String regexSpace = "\\s";
            String regex = setList + regexSpace + setList + regexSpace + setList;
            if (!input.matches(regex))
                System.out.println("Введенная строка не является ФИО");
            else {
                String[] words = input.split(regexSpace);
                System.out.println("Фамилия: " + words[0] + "\n" + "Имя: " + words[1] + "\n" + "Отчество: " + words[2]);
            }
        }
    }
}