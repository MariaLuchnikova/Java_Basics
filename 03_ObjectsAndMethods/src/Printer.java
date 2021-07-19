import javax.swing.text.Document;

public class Printer {
    private static int count = 0; // начальное значение количества чего-то
    private int kolDoc; // переменная, в которой хранится кол-во документов, добавленных в очередь
    private String queue = ""; // переменная, в которой хранится список документов на печать
    private int totalKolPage = 0; // общее количество страниц, добавленных в принтер

    public Printer(String queue, int kolDoc) {  // конструктор очереди печати списка документов
        this.queue += queue;
        this.kolDoc = kolDoc;
    }

    public static int getCount() { // метод для получения количества чего-то
        return count;
    }

    // метод для определения количества очередей печати ???
    public static void getQueueCount(int count) {
        Printer.count = Printer.count + count;
    }

    public static void main(String[] args) {
        Printer printer = new Printer("", 5);
        //for (int k = 1; k <= printer.kolDoc; k++) {  // для примера отправлено на печать 5 документов
        printer.append("Текст документа"); // пример отправки документов на печать без цикла по количеству документов
        printer.append("Текст документа", "Название документа", 2);
        //}
        printer.print("Список документов, отправленных на печать: ");
    }

    public void append(String txtDoc) {  // метод, принимающий один параметр
        append(txtDoc, "Название документа");
    }

    public void append(String txtDoc, String nameDoc) {   // метод, принимающий два параметра
        append(txtDoc, nameDoc, 1);
    }

    // метод, принимающий три параметра
    public void append(String txtDoc, String nameDoc, int kolPage) {
        queue = queue + txtDoc + ", " + nameDoc + ", " + "кол-во страниц: " + kolPage + "\n";
        totalKolPage = totalKolPage + kolPage;
    }

    public void clear() { // метод, очищающий очередь печати
        queue = "";
        totalKolPage = 0;
    }

    // метод для определения кол-ва страниц, которые добавлены в очередь печати
    public int getPendingPagesCount() {
        return totalKolPage;
    }

    public void print(String listDoc) { // вывод информации в консоль и очистка очереди печати
        System.out.println("Количество страниц в очереди: " + totalKolPage);
        System.out.println(listDoc);
        if (queue.isEmpty()) {
            System.out.println("Очередь печати отсутствует");
        } else {
            System.out.print(queue);
            System.out.println("Количество распечатанных страниц: " + getPendingPagesCount());
            clear();
        }
    }
}
