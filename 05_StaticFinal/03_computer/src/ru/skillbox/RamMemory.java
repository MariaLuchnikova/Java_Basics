package ru.skillbox;

public class RamMemory {
    private final RamMemoryType type;
    private final double volume;
    private final double weight;

    public RamMemory(RamMemoryType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RamMemoryType getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public RamMemory setVolume(double volume) {
        return new RamMemory(type, volume, weight);
    }

    public double getWeight() {
        return weight;
    }

    public RamMemory setWeight(double weight) {
        return new RamMemory(type, volume, weight);
    }

}
