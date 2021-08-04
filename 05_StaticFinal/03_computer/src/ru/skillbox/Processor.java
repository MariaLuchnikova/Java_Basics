package ru.skillbox;

public class Processor {
    private final double frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    public Processor(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public Processor setNumberOfCores(int numberOfCores) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Processor setManufacturer(String manufacturer) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public double getWeight() {
        return weight;
    }

    public Processor setWeight(double weight) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

}
