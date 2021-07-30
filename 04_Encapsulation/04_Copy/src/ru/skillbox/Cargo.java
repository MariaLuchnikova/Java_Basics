package ru.skillbox;

public class Cargo {
    private final double weight;
    private final String deliveryAddress;
    private final boolean isFlip;
    private final String registrationNumber;
    private final boolean isFregile;

    public Cargo(double weight, String deliveryAddress, boolean isFlip, String registrationNumber, boolean isFregile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isFlip = isFlip;
        this.registrationNumber = registrationNumber;
        this.isFregile = isFregile;
    }

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(weight, deliveryAddress, isFlip, registrationNumber, isFregile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(weight, deliveryAddress, isFlip, registrationNumber, isFregile);
    }

    public boolean getIsFlip() {
        return isFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getIsFregile() {
        return isFregile;
    }
}
