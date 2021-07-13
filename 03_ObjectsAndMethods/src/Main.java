public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        //basket.add("Milk", 40, 2);
        basket.add("Milk", 40, 2, 500);
        basket.add("Apple", 50, 3, 300);
        basket.print("Содержимое корзины: ");
    }
}
