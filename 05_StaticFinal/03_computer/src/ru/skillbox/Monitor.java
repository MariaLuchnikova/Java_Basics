package ru.skillbox;

public class Monitor {

    private final int diagonal;
    private final MonitorType type;
    private final double weight;

    public Monitor(int diagonal, MonitorType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Monitor setDiagonal(int diagonal) {
        return new Monitor(diagonal, type, weight);
    }

    public MonitorType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Monitor setWeight(double weight) {
        return new Monitor(diagonal, type, weight);
    }

}
