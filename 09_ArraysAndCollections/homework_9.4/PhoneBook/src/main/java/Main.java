import java.util.Scanner;

public class Main {
    public static final String WRONG_FORMAT_INPUT = "Неверный формат ввода";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            if (input.equalsIgnoreCase("LIST"))
                phoneBook.getAllContacts();
            else {
                if (phoneBook.isValidPhoneNumber(input)) {
                    if (phoneBook.getContactByPhone(input) == "")
                        System.out.println("Такого номера в телефонной книге нет.");
                    System.out.println("Введите имя абонента для номера: " + input);
                    String inputName = new Scanner(System.in).nextLine();
                    phoneBook.addContact(input, inputName);
                } else if (phoneBook.isValidNameContact(input)) {
                    if (phoneBook.getContactByName(input).isEmpty())
                        System.out.println("Такого имени в телефонной книге нет.");
                    System.out.println("Введите номер телефона для абонента: " + input);
                    String inputPhone = new Scanner(System.in).nextLine();
                    phoneBook.addContact(inputPhone, input);
                } else System.out.println(WRONG_FORMAT_INPUT);
            }
        }
    }
}
