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
            String regexClearing = "[^0-9]";
            String phoneNumber = input.replaceAll(regexClearing, "");
            switch (phoneNumber.length()) {
                case 10:
                    phoneNumber = "7" + phoneNumber;
                    System.out.println(phoneNumber);
                    break;
                case 11:
                    if (phoneNumber.charAt(0) == '8') {
                        phoneNumber = phoneNumber.replaceFirst("8", "7");
                        System.out.println(phoneNumber);
                    } else if (phoneNumber.charAt(0) != '7')
                        System.out.println("Неверный формат номера");
                    else System.out.println(phoneNumber);
                    break;
                default:
                    System.out.println("Неверный формат номера");
                    break;
            }
        }
    }
}
