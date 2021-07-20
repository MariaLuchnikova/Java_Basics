package ru.skillbox;

public class Country {
    private String name;
    private int populationSize;
    private double square;
    private String nameCapital;
    private boolean isAccessSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean getIsAccessSea() {
        return isAccessSea;
    }

    public void setIsAccessSea(boolean isAccessSea) {
        this.isAccessSea = isAccessSea;
    }

}
