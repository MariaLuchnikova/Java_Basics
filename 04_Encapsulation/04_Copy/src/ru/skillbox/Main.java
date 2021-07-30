package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2, 3, 1);
        System.out.println(dimensions.getVolumeCargo());
        dimensions = dimensions.setWidth(5);
        dimensions = dimensions.setLength(6);
        dimensions = dimensions.setHeight(2);
        System.out.println(dimensions.getVolumeCargo());
        Cargo cargo = new Cargo(100, "Angarsk", true, "138", false);
        cargo = cargo.setDeliveryAddress("Irkutsk");
        cargo = cargo.setWeight(200);
        System.out.println(cargo.getDeliveryAddress());
        System.out.println(cargo.getWeight());
    }
}
