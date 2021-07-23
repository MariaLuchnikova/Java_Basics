public class Printer {
    private String queue = ""; // переменная, в которой хранится список документов на печать
    private int totalKolPending = 0; // общее количество страниц, добавленных в принтер
    private int totalKolPrinted = 0; // общее количество распечатанных страниц

    public Printer(String queue) {  // конструктор очереди печати списка документов
        this.queue += queue;
    }

    public static void main(String[] args) {
        Printer printer = new Printer("");
        printer.append("Текст документа1"); // пример отправки документов на печать без цикла по количеству документов
        printer.append("Текст документа2", "Название документа2", 2);
        printer.print("Очередь печати:");
        printer.append("Текст документа3", "Название документа3", 3);
        printer.print("Очередь печати:");
        printer.append("Текст документа4", "Название документа4", 4);
        printer.print("Очередь печати:");
        System.out.println("Общее количество распечатанных страниц: " + printer.getPrintedPagesCount());
    }

    public void append(String txtDoc) {  // метод, принимающий один параметр
        append(txtDoc, "Название документа1");
    }

    public void append(String txtDoc, String nameDoc) {   // метод, принимающий два параметра
        append(txtDoc, nameDoc, 1);
    }

    // метод, принимающий три параметра
    public void append(String txtDoc, String nameDoc, int kolPage) {
        queue = queue + "Документ: " + nameDoc + "\n" + "количество страниц: " + kolPage + "\n";
        totalKolPending += kolPage;

    }

    public void clear() { // метод, очищающий очередь печати
        queue = "";
        totalKolPending = 0;
    }

    // метод для определения кол-ва страниц, которые добавлены в очередь печати
    public int getPendingPagesCount() {
        return totalKolPending;
    }

    public int getPrintedPagesCount() {
        return totalKolPrinted;
    }

    public void print(String listDoc) { // вывод информации в консоль и очистка очереди печати
        System.out.println(listDoc);
        if (queue.isEmpty()) {
            System.out.println("Очередь печати отсутствует");
        } else {
            System.out.print(queue);
            totalKolPrinted += getPendingPagesCount();
            System.out.println("Количество страниц, добавленных в очередь: " + getPendingPagesCount());
            clear();
        }
    }
}
