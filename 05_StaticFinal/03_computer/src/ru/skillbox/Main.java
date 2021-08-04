package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(2.10, 4, "China", 30);
        RamMemory ramMemory = new RamMemory(RamMemoryType.DDR2, 8.00, 20);
        HardDrive hardDrive = new HardDrive(HardDriveType.HDD, 500, 700);
        Monitor monitor = new Monitor(24, MonitorType.IPS, 4000);
        Keyboard keyboard = new Keyboard(KeyboardType.оптическая, Backlight.NO, 415);
        Computer computer = new Computer("China", "AMD", processor, ramMemory, hardDrive, monitor, keyboard);
        System.out.println("Масса компьютера: " +
                computer.calculateWeightComputer()
                + " гр.");
        System.out.println(computer);
    }
}
