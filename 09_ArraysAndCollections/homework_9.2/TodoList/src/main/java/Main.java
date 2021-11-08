import java.util.Scanner;

public class Main {
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите команду управления списком дел:");
        String[] command = scan.nextLine().split("\\s");
        boolean isValueDigit = false;
        if (command.length >= 2)
            isValueDigit = command[1].matches("[0-9]+");

        switch (command[0].toUpperCase()) {
            case "LIST":
                todoList.getTodos();
                break;
            case "ADD":
                if (isValueDigit)
                    todoList.add(Integer.parseInt(command[1]), command[2]);
                else todoList.add(command[1]);
                break;
            case "EDIT":
                if (isValueDigit)
                    todoList.edit(command[2], Integer.parseInt(command[1]));
                break;
            case "DELETE":
                if (isValueDigit)
                    todoList.delete(Integer.parseInt(command[1]));
                break;
            default:
                System.out.println("Введенная команда некорректна.");
                break;
        }
        scan.close();
    }
}
