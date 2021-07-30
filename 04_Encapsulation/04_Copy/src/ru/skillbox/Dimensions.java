package ru.skillbox;

public class Dimensions {
    private final double width;
    private final double length;
    private final double height;

    public Dimensions(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, length, height);
    }

    public double getLength() {
        return length;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(width, length, height);
    }

    public double getHeight() {
        return height;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, length, height);
    }

    public double getVolumeCargo() {
        return getWidth() * getLength() * getHeight();
    }

}
