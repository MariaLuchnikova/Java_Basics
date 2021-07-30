public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Milk", 40, 2);
        basket1.add("Apple", 50, 5);
        basket1.print("Содержимое корзины 1: ");
        System.out.println();
        Basket basket2 = new Basket();
        basket2.add("Orange", 60, 3);
        basket2.print("Содержимое корзины 2: ");
        System.out.println("Общая стоимость товаров во всех корзинах: " + Basket.getCostAllBasket());
        System.out.println("Общее количество товаров во всех корзинах: " + Basket.getCountAllProdBasket());
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAveragePriceAllBasket());
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageCostBasket());
    }
}
