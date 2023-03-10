public class Basket {

    private static int count = 0;
    private static int costAllBasket = 0;
    private static int countAllProdBasket = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int getCountAllProdBasket() {
        return countAllProdBasket;
    }

    public static void increaseCountAllProdBasket(int count) {
        countAllProdBasket += count;
    }

    public static int getCostAllBasket() {
        return costAllBasket;
    }

    public static void increaseCostAllBasket(int cost) {
        costAllBasket += cost;
    }

    public static int getAveragePriceAllBasket() {
        return costAllBasket / countAllProdBasket;
    }

    public static int getAverageCostBasket() {
        return costAllBasket / getCount();
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = contains(name);

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        totalPrice = totalPrice + count * price;
        increaseCountAllProdBasket(count);
        increaseCostAllBasket(count * price);

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + "\n" + "Общая стоимость товаров: " + totalPrice;
    }

    public void add(String name, int price, int count, double weight) {
        totalWeight = totalWeight + weight * count;
        items = "\n" + "Масса всех товаров корзине: " + totalWeight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeght() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
