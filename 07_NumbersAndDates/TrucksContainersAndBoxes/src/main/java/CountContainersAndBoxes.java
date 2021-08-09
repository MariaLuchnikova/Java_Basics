import java.util.Scanner;

public class CountContainersAndBoxes {
    private static final int MAX_BOXES_ONE_CONTAINERS = 27;
    private static final int MAX_CONTAINERS_ONE_TRUCKS = 12;
    private int containers;
    private int trucks;

    public static void main(String[] args) {
        CountContainersAndBoxes countContainersAndBoxes = new CountContainersAndBoxes();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите количество ящиков");
        if (scanner.hasNextInt()) {
            int boxes = scanner.nextInt();
            if (boxes < 0)
                System.out.println("Ошибка!Введено отрицательное количество.Перезапустите программу.");
            else
                countContainersAndBoxes.printCountTrucksAndContainers(boxes);
        } else
            System.out.println("Количество ящиков должно быть целым числом.Перезапустите программу.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

    public void printCountTrucksAndContainers(int boxes) {
        if (boxes != 0) {
            if (boxes >= MAX_BOXES_ONE_CONTAINERS) {
                containers = (boxes % MAX_BOXES_ONE_CONTAINERS == 0 ? boxes / MAX_BOXES_ONE_CONTAINERS : boxes / MAX_BOXES_ONE_CONTAINERS + 1);
            } else containers = 1;
            if (containers >= MAX_CONTAINERS_ONE_TRUCKS) {
                trucks = (containers % MAX_CONTAINERS_ONE_TRUCKS == 0 ? containers / MAX_CONTAINERS_ONE_TRUCKS : containers / MAX_CONTAINERS_ONE_TRUCKS + 1);
            } else trucks = 1;
            int cont = 1;
            int box = 1;
            for (int tr = 1; tr <= trucks; tr++) {
                System.out.println("Грузовик: " + tr);
                int i = 0;
                for (; cont <= containers; cont++) {
                    if (i == MAX_CONTAINERS_ONE_TRUCKS)
                        break;
                    i++;
                    System.out.println("\tКонтейнер: " + cont);
                    int j = 0;
                    for (; box <= boxes; box++) {
                        if (j == MAX_BOXES_ONE_CONTAINERS)
                            break;
                        j++;
                        System.out.println("\t\tЯщик: " + box);
                    }
                }
            }
        }
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + trucks + " шт." +
                    System.lineSeparator() + "контейнеров - " + containers + " шт.");
    }
}