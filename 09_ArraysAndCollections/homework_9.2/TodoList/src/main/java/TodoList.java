import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело " + "'" + todo + "'");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        try {
            todoList.add(index, todo);
            System.out.println("Дело " + "'" + todo + "'" + " добавлено на " + index + "-ое место");
        } catch (IndexOutOfBoundsException ex) {
            todoList.add(todo);
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        try {
            String newTask = todoList.get(index);
            todoList.set(index, todo);
            System.out.println("Дело " + newTask + " заменено на " + "'" + todo + "'");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        try {
            String oldTask = todoList.get(index);
            todoList.remove(index);
            System.out.println("Дело " + "'" + oldTask + "'" + " удалено");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
        return todoList;
    }

}