package ru.skillbox;

public class HardDrive {

    private final HardDriveType type;
    private final int memoryCapacity;
    private final double weight;

    public HardDrive(HardDriveType type, int memoryCapacity, double weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public HardDriveType getType() {
        return type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public HardDrive setMemoryCapacity(int memoryCapacity) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public double getWeight() {
        return weight;
    }

    public HardDrive setWeight(double weight) {
        return new HardDrive(type, memoryCapacity, weight);
    }
}
