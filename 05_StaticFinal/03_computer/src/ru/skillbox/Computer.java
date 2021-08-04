package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    private final Processor processor;
    private final RamMemory ramMemory;
    private final HardDrive hardDrive;
    private final Monitor monitor;
    private final Keyboard keyboard;


    public Computer(String vendor, String name, Processor processor, RamMemory ramMemory, HardDrive hardDrive, Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public double calculateWeightComputer() {
        return processor.getWeight() + ramMemory.getWeight() + hardDrive.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "Компьютер " + name + ":\n" +
                "производитель - " + vendor + "\n" +
                "частота процессора - " + processor.getFrequency() + " GHz" + "\n" +
                "количество ядер - " + processor.getNumberOfCores() + "\n" +
                "оперативная память - " + ramMemory.getType() + ", объем " + ramMemory.getVolume() + " Gb" + "\n" +
                "жёсткий диск - " + hardDrive.getType() + ", объем памяти " + hardDrive.getMemoryCapacity() + " Gb" + "\n" +
                "экран - " + monitor.getType() + ", диагональ " + monitor.getDiagonal() + "''" + "\n" +
                "клавиатура - " + keyboard.getType() + (keyboard.getBacklight() == Backlight.YES ? " с подсветкой" : " без подсветки");
    }
}
